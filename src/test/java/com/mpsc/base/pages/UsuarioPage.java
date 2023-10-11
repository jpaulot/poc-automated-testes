package com.mpsc.base.pages;

import com.github.javafaker.Faker;
import com.mpsc.base.datamodel.datamodel.DataUsuario;
import lombok.SneakyThrows;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

import java.util.Map;

@DefaultUrl("https://seubarriga.wcaquino.me/login")
public class UsuarioPage extends BasePage {
    @FindBy(linkText = "Novo usuário?")
    WebElementFacade btnNovoUsuario;

    @FindBy(id = "nome")
    WebElementFacade inputNome;

    @FindBy(id = "email")
    WebElementFacade inputEmail;

    @FindBy(id = "senha")
    WebElementFacade inputSenha;

    @FindBy(xpath = "//*[@type='submit']")
    WebElementFacade btnCadastrarOuEntrar;

    @FindBy(xpath = "//div[@role='alert']")
    WebElementFacade msgAlerta;



    public void clicoEmNovoUsuario() {
        btnNovoUsuario.click();
    }


    public void geraDadosDeUsuario() {
        Faker faker = new Faker();

        DataUsuario.setNome(faker.name().fullName());
        DataUsuario.setEmail(faker.internet().emailAddress());
        DataUsuario.setSenha(faker.internet().password());

    }
    public void informoOsDadosDeUsuario() {
        geraDadosDeUsuario();
        inputNome.sendKeys(DataUsuario.getNome());
        inputEmail.sendKeys(DataUsuario.getEmail());
        inputSenha.sendKeys(DataUsuario.getSenha());
    }


    public void clicoEmCadastrar() {
        btnCadastrarOuEntrar.click();
    }

    @SneakyThrows
    public void validaMensagem(String mensagem) {
        Assert.assertEquals(mensagem, msgAlerta.getText());
        espera(3000);
    }

    @SneakyThrows
    public void efetuaLoginComNovoUsuario() {
        inputEmail.sendKeys(DataUsuario.email);
        inputSenha.sendKeys(DataUsuario.senha);
        btnCadastrarOuEntrar.click();
        espera(3000);
    }

    @SneakyThrows
    public void validaLoginComNovoUsuario() {
        Assert.assertEquals(msgAlerta.getText(), "Bem vindo, "+DataUsuario.nome+"!");
        espera(3000);
    }

    public void informoOsDadosDeUsuarioNomeEmailSenha(String nome, String email, String senha) {
        inputNome.sendKeys(nome);
        inputEmail.sendKeys(email);
        inputSenha.sendKeys(senha);
    }

    @SneakyThrows
    public void efetuoLoginComOsDados(Map<String, String> dados) {
        inputEmail.sendKeys(dados.get("email"));
        inputSenha.sendKeys(dados.get("senha"));
        btnCadastrarOuEntrar.click();
        espera(3000);
    }
}
