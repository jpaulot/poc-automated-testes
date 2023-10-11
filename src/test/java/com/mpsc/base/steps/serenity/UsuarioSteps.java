package com.mpsc.base.steps.serenity;

import com.mpsc.base.pages.UsuarioPage;
import net.thucydides.core.annotations.Step;

import java.util.Map;

public class UsuarioSteps {
    UsuarioPage usuarioPage;

    @Step
    public void queAcessoOSistema() {
        usuarioPage.open();
    }

    @Step
    public void clicoEmNovoUsuario() {
        usuarioPage.clicoEmNovoUsuario();
    }

    @Step
    public void informoOsDadosDeUsuario() {
        usuarioPage.informoOsDadosDeUsuario();
    }

    @Step
    public void clicoEmCadastrar() {
        usuarioPage.clicoEmCadastrar();
    }

    @Step
    public void validaMensagem(String mensagem) {
        usuarioPage.validaMensagem(mensagem);
    }

    @Step
    public void efetuaLoginComNovoUsuario() {
        usuarioPage.efetuaLoginComNovoUsuario();
    }

    @Step
    public void validaLoginComNovoUsuario() {
        usuarioPage.validaLoginComNovoUsuario();
    }

    @Step
    public void informoOsDadosDeUsuarioNomeEmailSenha(String nome, String email, String senha) {
        usuarioPage.informoOsDadosDeUsuarioNomeEmailSenha(nome, email, senha);
    }

    public void efetuoLoginComOsDados(Map<String, String> dados) {
        usuarioPage.efetuoLoginComOsDados(dados);
    }
}
