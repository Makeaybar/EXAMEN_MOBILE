package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.ProductsScreen;
import io.cucumber.messages.types.Product;
import org.junit.Assert;

public class LoginSteps {

    LoginScreen loginScreen;
    ProductsScreen productsScreen;

    public void login(String user, String password){
        loginScreen.enterUser(user);
        loginScreen.enterPassword(password);
        loginScreen.clickLogin();
    }

    public void loginSuccess(){
        Assert.assertTrue("Visibilidad de título products", productsScreen.isProductDisplayed());
    }

    public void validateErrorMessage(String message){
        Assert.assertEquals("Mensaje de error", message, loginScreen.getErrorMessage());
    }

    public void prodcuto() {
        loginScreen.clickproducto();
    }
}
