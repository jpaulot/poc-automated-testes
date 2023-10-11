package com.mpsc.base.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class BasePage extends PageObject {

    public void scrollAteElemento(WebElementFacade elemento) {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", elemento);
    }

    public void duploClique(WebElementFacade elemento) {
        Actions action = new Actions(ThucydidesWebDriverSupport.getDriver());
        action.doubleClick(elemento).perform();
    }

    public void espera(int milisegundos){
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
