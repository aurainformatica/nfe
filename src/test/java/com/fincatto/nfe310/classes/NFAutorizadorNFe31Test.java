package com.fincatto.nfe310.classes;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class NFAutorizadorNFe31Test {

    @Test
    public void deveBuscarCorretamenteURLsWebServiceAM() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.AM;
        Assert.assertEquals("https://homnfe.sefaz.am.gov.br/services2/services/cadconsultacadastro2", autorizador.getConsultaCadastro(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homnfe.sefaz.am.gov.br/services2/services/NfeAutorizacao", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homnfe.sefaz.am.gov.br/services2/services/NfeConsulta2", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homnfe.sefaz.am.gov.br/services2/services/NfeRetAutorizacao", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homnfe.sefaz.am.gov.br/services2/services/NfeStatusServico2", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homnfe.sefaz.am.gov.br/services2/services/RecepcaoEvento", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homnfe.sefaz.am.gov.br/services2/services/NfeInutilizacao2", autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://nfe.sefaz.am.gov.br/services2/services/CadConsultaCadastro2", autorizador.getConsultaCadastro(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.am.gov.br/services2/services/NfeAutorizacao", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.am.gov.br/services2/services/NfeConsulta2", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.am.gov.br/services2/services/NfeRetAutorizacao", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.am.gov.br/services2/services/NfeStatusServico2", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.am.gov.br/services2/services/RecepcaoEvento", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.am.gov.br/services2/services/NfeInutilizacao2", autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceBA() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.BA;
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/nfenw/CadConsultaCadastro2.asmx", autorizador.getConsultaCadastro(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/NfeAutorizacao/NfeAutorizacao.asmx", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/NfeConsulta/NfeConsulta.asmx", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/NfeRetAutorizacao/NfeRetAutorizacao.asmx", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/NfeStatusServico/NfeStatusServico.asmx", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/sre/recepcaoevento.asmx", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.sefaz.ba.gov.br/webservices/NfeInutilizacao/NfeInutilizacao.asmx", autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://nfe.sefaz.ba.gov.br/webservices/nfenw/CadConsultaCadastro2.asmx", autorizador.getConsultaCadastro(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.ba.gov.br/webservices/NfeAutorizacao/NfeAutorizacao.asmx", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.ba.gov.br/webservices/nfenw/nfeconsulta2.asmx", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.ba.gov.br/webservices/NfeRetAutorizacao/NfeRetAutorizacao.asmx", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.ba.gov.br/webservices/nfenw/NfeStatusServico2.asmx", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.ba.gov.br/webservices/sre/recepcaoevento.asmx", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.ba.gov.br/webservices/NfeInutilizacao/NfeInutilizacao.asmx", autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceCE() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.CE;
        Assert.assertEquals("https://nfeh.sefaz.ce.gov.br/nfe2/services/CadConsultaCadastro2?wsdl", autorizador.getConsultaCadastro(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfeh.sefaz.ce.gov.br/nfe2/services/NfeAutorizacao?wsdl", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfeh.sefaz.ce.gov.br/nfe2/services/NfeConsulta2?wsdl", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfeh.sefaz.ce.gov.br/nfe2/services/NfeRetAutorizacao?wsdl", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfeh.sefaz.ce.gov.br/nfe2/services/NfeStatusServico2?wsdl", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfeh.sefaz.ce.gov.br/nfe2/services/RecepcaoEvento?wsdl", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfeh.sefaz.ce.gov.br/nfe2/services/NfeInutilizacao2?wsdl", autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://nfe.sefaz.ce.gov.br/nfe2/services/CadConsultaCadastro2?wsdl", autorizador.getConsultaCadastro(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.ce.gov.br/nfe2/services/NfeAutorizacao?wsdl", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.ce.gov.br/nfe2/services/NfeConsulta2?wsdl", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.ce.gov.br/nfe2/services/NfeRetAutorizacao?wsdl", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.ce.gov.br/nfe2/services/NfeStatusServico2?wsdl", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.ce.gov.br/nfe2/services/RecepcaoEvento?wsdl", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.ce.gov.br/nfe2/services/NfeInutilizacao2?wsdl", autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceGO() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.GO;
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/v2/CadConsultaCadastro2?wsdl", autorizador.getConsultaCadastro(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/v2/NfeAutorizacao?wsdl", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/v2/NfeConsulta2?wsdl", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/v2/NfeRetAutorizacao?wsdl", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/v2/NfeStatusServico2?wsdl", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/v2/RecepcaoEvento?wsdl", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homolog.sefaz.go.gov.br/nfe/services/v2/NfeInutilizacao2?wsdl", autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://nfe.sefaz.go.gov.br/nfe/services/v2/CadConsultaCadastro2?wsdl", autorizador.getConsultaCadastro(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.go.gov.br/nfe/services/v2/NfeAutorizacao?wsdl", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.go.gov.br/nfe/services/v2/NfeConsulta2?wsdl", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.go.gov.br/nfe/services/v2/NfeRetAutorizacao?wsdl", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.go.gov.br/nfe/services/v2/NfeStatusServico2?wsdl", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.go.gov.br/nfe/services/v2/RecepcaoEvento?wsdl", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.go.gov.br/nfe/services/v2/NfeInutilizacao2?wsdl", autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceMG() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.MG;
        Assert.assertEquals("https://hnfe.fazenda.mg.gov.br/nfe2/services/cadconsultacadastro2", autorizador.getConsultaCadastro(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.fazenda.mg.gov.br/nfe2/services/NfeAutorizacao", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.fazenda.mg.gov.br/nfe2/services/NfeConsulta2", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.fazenda.mg.gov.br/nfe2/services/NfeRetAutorizacao", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.fazenda.mg.gov.br/nfe2/services/NfeStatusServico2", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.fazenda.mg.gov.br/nfe2/services/RecepcaoEvento", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hnfe.fazenda.mg.gov.br/nfe2/services/NfeInutilizacao2", autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://nfe.fazenda.mg.gov.br/nfe2/services/cadconsultacadastro2", autorizador.getConsultaCadastro(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.mg.gov.br/nfe2/services/NfeAutorizacao", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.mg.gov.br/nfe2/services/NfeConsulta2", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.mg.gov.br/nfe2/services/NfeRetAutorizacao", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.mg.gov.br/nfe2/services/NfeStatus2", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.mg.gov.br/nfe2/services/RecepcaoEvento", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.mg.gov.br/nfe2/services/NfeInutilizacao2", autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceMS() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.MS;
        Assert.assertEquals("https://homologacao.nfe.ms.gov.br/homologacao/services2/CadConsultaCadastro2", autorizador.getConsultaCadastro(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.ms.gov.br/homologacao/services2/NfeAutorizacao", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.ms.gov.br/homologacao/services2/NfeConsulta2", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.ms.gov.br/homologacao/services2/NfeRetAutorizacao", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.ms.gov.br/homologacao/services2/NfeStatusServico2", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.ms.gov.br/homologacao/services2/RecepcaoEvento", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.ms.gov.br/homologacao/services2/NfeInutilizacao2", autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://nfe.fazenda.ms.gov.br/producao/services2/CadConsultaCadastro2", autorizador.getConsultaCadastro(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.ms.gov.br/producao/services2/NfeAutorizacao", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.ms.gov.br/producao/services2/NfeConsulta2", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.ms.gov.br/producao/services2/NfeRetAutorizacao", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.ms.gov.br/producao/services2/NfeStatusServico2", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.ms.gov.br/producao/services2/RecepcaoEvento", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.ms.gov.br/producao/services2/NfeInutilizacao2", autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceMT() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.MT;
        Assert.assertEquals("https://homologacao.sefaz.mt.gov.br/nfews/v2/services/CadConsultaCadastro2?wsdl", autorizador.getConsultaCadastro(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.sefaz.mt.gov.br/nfews/v2/services/NfeAutorizacao?wsdl", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.sefaz.mt.gov.br/nfews/v2/services/NfeConsulta2?wsdl", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.sefaz.mt.gov.br/nfews/v2/services/NfeRetAutorizacao?wsdl", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.sefaz.mt.gov.br/nfews/v2/services/NfeStatusServico2?wsdl", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.sefaz.mt.gov.br/nfews/v2/services/RecepcaoEvento?wsdl", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.sefaz.mt.gov.br/nfews/v2/services/NfeInutilizacao2?wsdl", autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://nfe.sefaz.mt.gov.br/nfews/v2/services/CadConsultaCadastro2?wsdl", autorizador.getConsultaCadastro(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.mt.gov.br/nfews/v2/services/NfeAutorizacao?wsdl", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.mt.gov.br/nfews/v2/services/NfeConsulta2?wsdl", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.mt.gov.br/nfews/v2/services/NfeRetAutorizacao?wsdl", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.mt.gov.br/nfews/v2/services/NfeStatusServico2?wsdl", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.mt.gov.br/nfews/v2/services/RecepcaoEvento?wsdl", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.mt.gov.br/nfews/v2/services/NfeInutilizacao2?wsdl", autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServicePE() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.PE;
        Assert.assertEquals("https://nfehomolog.sefaz.pe.gov.br/nfe-service/services/NfeAutorizacao?wsdl", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfehomolog.sefaz.pe.gov.br/nfe-service/services/NfeConsulta2", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfehomolog.sefaz.pe.gov.br/nfe-service/services/NfeRetAutorizacao?wsdl", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfehomolog.sefaz.pe.gov.br/nfe-service/services/NfeStatusServico2", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfehomolog.sefaz.pe.gov.br/nfe-service/services/RecepcaoEvento", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfehomolog.sefaz.pe.gov.br/nfe-service/services/CadConsultaCadastro2", autorizador.getConsultaCadastro(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfehomolog.sefaz.pe.gov.br/nfe-service/services/NfeInutilizacao2", autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://nfe.sefaz.pe.gov.br/nfe-service/services/NfeAutorizacao?wsdl", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.pe.gov.br/nfe-service/services/NfeConsulta2", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.pe.gov.br/nfe-service/services/NfeRetAutorizacao?wsdl", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.pe.gov.br/nfe-service/services/NfeStatusServico2", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.pe.gov.br/nfe-service/services/RecepcaoEvento", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.pe.gov.br/nfe-service/services/CadConsultaCadastro2", autorizador.getConsultaCadastro(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefaz.pe.gov.br/nfe-service/services/NfeInutilizacao2", autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServicePR() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.PR;
        Assert.assertEquals("https://homologacao.nfe.fazenda.pr.gov.br/nfe/CadConsultaCadastro2?wsdl", autorizador.getConsultaCadastro(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.pr.gov.br/nfe/NFeAutorizacao3?wsdl", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.pr.gov.br/nfe/NFeConsulta3?wsdl", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.pr.gov.br/nfe/NFeRetAutorizacao3?wsdl", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.pr.gov.br/nfe/NFeStatusServico3?wsdl", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.pr.gov.br/nfe/NFeRecepcaoEvento?wsdl", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.pr.gov.br/nfe/NFeInutilizacao3?wsdl", autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://nfe2.fazenda.pr.gov.br/nfe/CadConsultaCadastro2?wsdl", autorizador.getConsultaCadastro(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.pr.gov.br/nfe/NFeAutorizacao3?wsdl", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.pr.gov.br/nfe/NFeConsulta3?wsdl", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.pr.gov.br/nfe/NFeRetAutorizacao3?wsdl", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.pr.gov.br/nfe/NFeStatusServico3?wsdl", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.pr.gov.br/nfe/NFeRecepcaoEvento?wsdl", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.pr.gov.br/nfe/NFeInutilizacao3?wsdl", autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO));

    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceRS() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.RS;
        Assert.assertEquals("https://cad.sefazrs.rs.gov.br/ws/cadconsultacadastro/cadconsultacadastro2.asmx", autorizador.getConsultaCadastro(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.sefazrs.rs.gov.br/ws/NfeAutorizacao/NFeAutorizacao.asmx", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.sefazrs.rs.gov.br/ws/NfeConsulta/NfeConsulta2.asmx", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.sefazrs.rs.gov.br/ws/NfeRetAutorizacao/NFeRetAutorizacao.asmx", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.sefazrs.rs.gov.br/ws/NfeStatusServico/NfeStatusServico2.asmx", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.sefazrs.rs.gov.br/ws/recepcaoevento/recepcaoevento.asmx", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.sefazrs.rs.gov.br/ws/nfeinutilizacao/nfeinutilizacao2.asmx", autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://cad.sefazrs.rs.gov.br/ws/cadconsultacadastro/cadconsultacadastro2.asmx", autorizador.getConsultaCadastro(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefazrs.rs.gov.br/ws/NfeAutorizacao/NFeAutorizacao.asmx", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefazrs.rs.gov.br/ws/NfeConsulta/NfeConsulta2.asmx", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefazrs.rs.gov.br/ws/NfeRetAutorizacao/NFeRetAutorizacao.asmx", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefazrs.rs.gov.br/ws/NfeStatusServico/NfeStatusServico2.asmx", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefazrs.rs.gov.br/ws/recepcaoevento/recepcaoevento.asmx", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.sefazrs.rs.gov.br/ws/nfeinutilizacao/nfeinutilizacao2.asmx", autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceSP() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.SP;
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/cadconsultacadastro2.asmx", autorizador.getConsultaCadastro(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/nfeautorizacao.asmx", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/nfeconsulta2.asmx", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/nferetautorizacao.asmx", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/nfestatusservico2.asmx", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/recepcaoevento.asmx", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://homologacao.nfe.fazenda.sp.gov.br/ws/nfeinutilizacao2.asmx", autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://nfe.fazenda.sp.gov.br/ws/cadconsultacadastro2.asmx", autorizador.getConsultaCadastro(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.sp.gov.br/ws/nfeautorizacao.asmx", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.sp.gov.br/ws/nfeconsulta2.asmx", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.sp.gov.br/ws/nferetautorizacao.asmx", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.sp.gov.br/ws/nfestatusservico2.asmx", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.sp.gov.br/ws/recepcaoevento.asmx", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.fazenda.sp.gov.br/ws/nfeinutilizacao2.asmx", autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceSCAN() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.SCAN;
        Assert.assertEquals("https://hom.svc.fazenda.gov.br/NfeAutorizacao/NfeAutorizacao.asmx", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.svc.fazenda.gov.br/NfeConsulta2/NfeConsulta2.asmx", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.svc.fazenda.gov.br/NfeRetAutorizacao/NfeRetAutorizacao.asmx", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.svc.fazenda.gov.br/NfeStatusServico2/NfeStatusServico2.asmx", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.svc.fazenda.gov.br/RecepcaoEvento/RecepcaoEvento.asmx", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://www.svc.fazenda.gov.br/NfeAutorizacao/NfeAutorizacao.asmx", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://www.svc.fazenda.gov.br/NfeConsulta2/NfeConsulta2.asmx", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://www.svc.fazenda.gov.br/NfeRetAutorizacao/NfeRetAutorizacao.asmx", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://www.svc.fazenda.gov.br/NfeStatusServico2/NfeStatusServico2.asmx", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://www.svc.fazenda.gov.br/RecepcaoEvento/RecepcaoEvento.asmx", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));

        try {
            autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO);
            Assert.fail("SCAN nao possui servico de inutilizacao");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO);
            Assert.fail("SCAN nao possui servico de inutilizacao");
        } catch (final UnsupportedOperationException e) {
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void deveLancarExcecaoCasoTenteObterServicoIndisponivelSCAN() {
        NFAutorizadorNFe31.SCAN.getConsultaCadastro(NFAmbiente.HOMOLOGACAO);
    }

    @Test
    public void naoDeveTerUFsAtreladaAoSCAN() {
        Assert.assertArrayEquals(new NFUnidadeFederativa[] {}, NFAutorizadorNFe31.SCAN.getUFs());
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceSVRS() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.SVRS;
        Assert.assertEquals("https://cad.svrs.rs.gov.br/ws/cadconsultacadastro/cadconsultacadastro2.asmx", autorizador.getConsultaCadastro(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.svrs.rs.gov.br/ws/NfeAutorizacao/NFeAutorizacao.asmx", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.svrs.rs.gov.br/ws/NfeConsulta/NfeConsulta2.asmx", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.svrs.rs.gov.br/ws/NfeRetAutorizacao/NFeRetAutorizacao.asmx", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.svrs.rs.gov.br/ws/NfeStatusServico/NfeStatusServico2.asmx", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.svrs.rs.gov.br/ws/recepcaoevento/recepcaoevento.asmx", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://nfe-homologacao.svrs.rs.gov.br/ws/nfeinutilizacao/nfeinutilizacao2.asmx", autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://cad.svrs.rs.gov.br/ws/cadconsultacadastro/cadconsultacadastro2.asmx", autorizador.getConsultaCadastro(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.svrs.rs.gov.br/ws/NfeAutorizacao/NFeAutorizacao.asmx", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.svrs.rs.gov.br/ws/NfeConsulta/NfeConsulta2.asmx", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.svrs.rs.gov.br/ws/NfeRetAutorizacao/NFeRetAutorizacao.asmx", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.svrs.rs.gov.br/ws/NfeStatusServico/NfeStatusServico2.asmx", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.svrs.rs.gov.br/ws/recepcaoevento/recepcaoevento.asmx", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://nfe.svrs.rs.gov.br/ws/nfeinutilizacao/nfeinutilizacao2.asmx", autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO));
    }

    @Test
    public void deveBuscarCorretamenteURLWebServiceSVAN() {
        final NFAutorizadorNFe31 autorizador = NFAutorizadorNFe31.SVAN;
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NfeAutorizacao/NfeAutorizacao.asmx", autorizador.getNfeAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NfeRetAutorizacao/NfeRetAutorizacao.asmx", autorizador.getNfeRetAutorizacao(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NfeConsulta2/NfeConsulta2.asmx", autorizador.getNfeConsultaProtocolo(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NfeStatusServico2/NfeStatusServico2.asmx", autorizador.getNfeStatusServico(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/RecepcaoEvento/RecepcaoEvento.asmx", autorizador.getRecepcaoEvento(NFAmbiente.HOMOLOGACAO));
        Assert.assertEquals("https://hom.sefazvirtual.fazenda.gov.br/NfeInutilizacao2/NfeInutilizacao2.asmx", autorizador.getNfeInutilizacao(NFAmbiente.HOMOLOGACAO));

        Assert.assertEquals("https://www.sefazvirtual.fazenda.gov.br/NfeAutorizacao/NfeAutorizacao.asmx", autorizador.getNfeAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://www.sefazvirtual.fazenda.gov.br/NfeRetAutorizacao/NfeRetAutorizacao.asmx", autorizador.getNfeRetAutorizacao(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://www.sefazvirtual.fazenda.gov.br/NfeConsulta2/NfeConsulta2.asmx", autorizador.getNfeConsultaProtocolo(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://www.sefazvirtual.fazenda.gov.br/NfeStatusServico2/NfeStatusServico2.asmx", autorizador.getNfeStatusServico(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://www.sefazvirtual.fazenda.gov.br/RecepcaoEvento/RecepcaoEvento.asmx", autorizador.getRecepcaoEvento(NFAmbiente.PRODUCAO));
        Assert.assertEquals("https://www.sefazvirtual.fazenda.gov.br/NfeInutilizacao2/NfeInutilizacao2.asmx", autorizador.getNfeInutilizacao(NFAmbiente.PRODUCAO));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void deveLancarExcecaoCasoTenteObterServicoIndisponivelSVAN() {
        NFAutorizadorNFe31.SVAN.getConsultaCadastro(NFAmbiente.HOMOLOGACAO);
    }

    @Test
    public void deveObterAsFederacoesQueSVANEhResponsavel() {
        Assert.assertTrue(Arrays.deepEquals(NFAutorizadorNFe31.SVAN.getUFs(), new NFUnidadeFederativa[] { NFUnidadeFederativa.MA, NFUnidadeFederativa.PA, NFUnidadeFederativa.PI }));
    }

    @Test
    public void deveObterAutorizadorPelaUF() {
        Assert.assertEquals(NFAutorizadorNFe31.SVRS, NFAutorizadorNFe31.valueOfCodigoUF(NFUnidadeFederativa.AC));
        Assert.assertEquals(NFAutorizadorNFe31.SVRS, NFAutorizadorNFe31.valueOfCodigoUF(NFUnidadeFederativa.SC));
        Assert.assertEquals(NFAutorizadorNFe31.SP, NFAutorizadorNFe31.valueOfCodigoUF(NFUnidadeFederativa.SP));
    }

    @Test
    public void deveObterNullCasoPasseUmaUFInvalida() {
        Assert.assertNull(NFAutorizadorNFe31.valueOfCodigoUF(null));
    }

    @Test
    public void deveObterAutorizadorDeChaveDeAcessoNFe() {
        Assert.assertEquals(NFAutorizadorNFe31.SVRS, NFAutorizadorNFe31.valueOfChaveAcesso("42306447535430986810252619468905605824735937"));
    }

    @Test
    public void deveObterSCANCasoEstejaEmContigencia() {
        Assert.assertEquals(NFAutorizadorNFe31.SCAN, NFAutorizadorNFe31.valueOfChaveAcesso("42306447535430986810259129468905605824735937"));
    }
}