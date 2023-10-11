package com.mpsc.base.steps.definitionSteps;

import com.mpsc.base.steps.serenity.UsuarioSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class DefinitionStepsUsuario {

    @Steps
    UsuarioSteps usuarioSteps;

    @Dado("^que acesso o sistema$")
    public void queAcessoOSistema() {
        usuarioSteps.queAcessoOSistema();
    }

    @E("clico em 'Novo Usuario?'")
    public void clicoEmNovoUsuario() {
        usuarioSteps.clicoEmNovoUsuario();
    }

    @E("informo os dados de usuario")
    public void informoOsDadosDeUsuario() {
        usuarioSteps.informoOsDadosDeUsuario();
    }

    @Quando("clico em 'Cadastrar'")
    public void clicoEmCadastrar() {
        usuarioSteps.clicoEmCadastrar();
    }

    @Então("o sistema deve apresentar a mensagem {string}")
    public void validaMensagem(String mensagem) {
        usuarioSteps.validaMensagem(mensagem);
    }

    @E("efetuo login com os dados registrados")
    public void efetuaLoginComNovoUsuario() {
        usuarioSteps.efetuaLoginComNovoUsuario();
    }

    @Então("o sistema deve apresentar a mensagem de boas vindas para o usuário cadastrado")
    public void validaLoginComNovoUsuario() {
        usuarioSteps.validaLoginComNovoUsuario();
    }

    @E("informo os dados de usuario {string}{string}{string}")
    public void informoOsDadosDeUsuarioNomeEmailSenha(String nome, String email, String senha) {
        usuarioSteps.informoOsDadosDeUsuarioNomeEmailSenha(nome, email, senha);
    }

    @Quando("efetuo login com os dados")
    public void efetuoLoginComOsDados(Map<String, String> dados) {
        usuarioSteps.efetuoLoginComOsDados(dados);
    }
}
