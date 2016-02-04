package com.fincatto.nfe310.classes;

import static org.junit.Assert.*;

import java.time.YearMonth;

import org.junit.Test;

public class NFChaveNotaTest {

	@Test
	public void testBuilder() {
		NFChaveNota chaveNota = new NFChaveNota.Builder()
			.withCnpjEmitente("85.785.244/0001-99")
			.withCodigoNumerico("5")
			.withDataEmissao(YearMonth.of(2011, 05))
			.withFormaEmissao(NFTipoEmissao.CONTINGENCIA_FS_IA)
			.withNFModelo(NFModelo.NF_E)
			.withNFUnidadeFederativa(NFUnidadeFederativa.SC)
			.withNumero("20")
			.withSerie("1")
			.build();
		
		assertEquals("0", chaveNota.getDV());
		assertEquals("NFe42110585785244000199550010000000202000000050", chaveNota.toString());
	}
	
	@Test
	public void testFromStringOk(){
		NFChaveNota chaveNota = NFChaveNota.fromString("NFe42110585785244000199550010000000202000000050");
		
		assertEquals("0", chaveNota.getDV());
	}
	
	@Test
	public void testFromStringOkSomenteNumeros(){
		NFChaveNota chaveNota = NFChaveNota.fromString("42110585785244000199550010000000202000000050");
		
		assertEquals("0", chaveNota.getDV());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFromStringTamanhoDiferente(){
		NFChaveNota.fromString("NFe4211058578524400019955001000000020200");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFromStringDVDiferente(){
		NFChaveNota.fromString("NFe42110585785244000199550010000000202000000059");
	}	

}
