package com.fincatto.nfe310.classes;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

import org.joda.time.LocalDateTime;

import com.fincatto.nfe310.classes.nota.NFNotaInfo;
import com.fincatto.nfe310.classes.nota.NFNotaInfoIdentificacao;

public class NFChaveNota {

	private final String chave;

	private NFChaveNota(final String chave) {
		this.chave = chave;
	}

	public NFUnidadeFederativa getNFUnidadeFederativa() {
		return NFUnidadeFederativa.valueOfCodigo(this.chave.substring(0, 2));
	}

	public Date getDataEmissao() {
		return new GregorianCalendar(this.getDataEmissaoAno(),
				this.getDataEmissaoMes(), 1).getTime();
	}

	private int getDataEmissaoMes() {
		return Integer.parseInt(this.chave.substring(4, 6)) - 1;
	}

	private int getDataEmissaoAno() {
		return 2000 + Integer.parseInt(this.chave.substring(2, 4));
	}

	public String getCnpjEmitente() {
		return this.chave.substring(6, 20);
	}

	public String getSerie() {
		return this.chave.substring(22, 25);
	}

	public String getNumero() {
		return this.chave.substring(25, 34);
	}

	public NFTipoEmissao getFormaEmissao() {
		return NFTipoEmissao.valueOfCodigo(this.chave.substring(34, 35));
	}

	public String getCodigoNumerico() {
		return this.chave.substring(35, 43);
	}

	public String getDV() {
		return this.chave.substring(43, 44);
	}

	public boolean isEmitidaContingenciaSCAN() {
		return this.getSerie().matches("9[0-9]{2}");
	}

	public String getFormatado() {
		return this.chave
				.replaceFirst(
						"(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})",
						"$1 $2 $3 $4 $5 $6 $7 $8 $9 $10 $11");
	}
	
	public String getChave() {
		return chave;
	}
	
	@Override
	public String toString() {
		return "NFe" + this.chave;
	}
	
	public static NFChaveNota fromInfo(NFNotaInfo info) {
		NFNotaInfoIdentificacao identificacao = info.getIdentificacao();
		LocalDateTime emissao = identificacao.getDataHoraEmissao();
		
		return new Builder()
			.withCnpjEmitente(info.getEmitente().getCnpj())
			.withCodigoNumerico(identificacao.getCodigoRandomico())
			.withDataEmissao(YearMonth.of(emissao.getYear(), emissao.getMonthOfYear()))
			.withFormaEmissao(identificacao.getTipoEmissao())
			.withNFModelo(identificacao.getModelo())
			.withNFUnidadeFederativa(identificacao.getUf())
			.withNumero(identificacao.getCodigoRandomico())
			.withSerie(identificacao.getSerie())
			.build();			
	}
	
	public static NFChaveNota fromString(final String chave){
		String numerico;
		
		if (chave == null || (numerico = chave.replaceAll("\\D", "")).length() != 44) {
			throw new IllegalArgumentException(String.format("A chave deve ter exatos 44 caracteres numericos: %s",chave));
		}
		
		int dv = modulo11(numerico.substring(0, 43));
		
		if(!String.valueOf(dv).equals(numerico.substring(43))){
			throw new IllegalArgumentException(String.format("Dígito verificador inválido: %s",chave));
		}
		
		return new NFChaveNota(numerico);
	}

	public static class Builder {
		private NFUnidadeFederativa uf;
		private YearMonth dataEmissao;
		private String cnpjEmitente;
		private String serie;
		private String numero;
		private NFTipoEmissao formaEmissao;
		private String codigoNumerico;
		private NFModelo modelo;

		public Builder withNFUnidadeFederativa(final NFUnidadeFederativa uf) {
			this.uf = uf;
			return this;
		}

		public Builder withDataEmissao(final YearMonth dataEmissao) {
			this.dataEmissao = dataEmissao;
			return this;
		}

		public Builder withCnpjEmitente(final String cnpjEmitente) {
			this.cnpjEmitente = cnpjEmitente;
			return this;
		}

		public Builder withSerie(final String serie) {
			this.serie = serie;
			return this;
		}

		public Builder withNumero(final String numero) {
			this.numero = numero;
			return this;
		}

		public Builder withFormaEmissao(final NFTipoEmissao formaEmissao) {
			this.formaEmissao = formaEmissao;
			return this;
		}

		public Builder withCodigoNumerico(final String codigoNumerico) {
			this.codigoNumerico = codigoNumerico;
			return this;
		}
		
		public Builder withNFModelo(final NFModelo modelo){
			this.modelo = modelo;
			return this;
		}

		public NFChaveNota build() {
			StringBuilder chaveBuilder = new StringBuilder()
				.append(uf.getCodigoIbge())
				.append(dataEmissao.format(DateTimeFormatter.ofPattern("uuMM")))
				.append(cnpjEmitente.replaceAll("\\D", ""))
				.append(modelo.getCodigo())
				.append(lpadTo(serie, 3, '0'))
				.append(lpadTo(numero, 9, '0'))
				.append(formaEmissao.getCodigo())
				.append(lpadTo(codigoNumerico, 8, '0'));
			
			final int dv = modulo11(chaveBuilder.toString());

			chaveBuilder.append(dv);

			return new NFChaveNota(chaveBuilder.toString());
		}
	  
	    private String lpadTo(String input, int width, char ch) {  
	        String strPad = "";  
	  
	        StringBuffer sb = new StringBuffer(input.trim());  
	        while (sb.length() < width)  
	            sb.insert(0,ch);  
	        strPad = sb.toString();  
	          
	        if (strPad.length() > width) {  
	            strPad = strPad.substring(0,width);  
	        }  
	        return strPad;  
	    }  
	}
	
    private static int modulo11(String chave) {  
        int total = 0;  
        int peso = 2;  
              
        for (int i = 0; i < chave.length(); i++) {  
            total += (chave.charAt((chave.length()-1) - i) - '0') * peso;  
            peso ++;  
            if (peso == 10)  
                peso = 2;  
        }  
        int resto = total % 11;  
        return (resto == 0 || resto == 1) ? 0 : (11 - resto);  
    }  

}
