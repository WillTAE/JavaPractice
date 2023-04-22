/*public class EpamTestInterview extends BasePage {
    //Login form: login and password fields, forgot password link, "Ok" button. Basic Page class is already implemented. You need to develop Page Object for this login form.

    public WebElement loginText = By.id("login");
    public WebElement loginPassword = By.id("password");
    public WebElement okButton = By.id("okButton");
    public WebElement forgotPasswordLink = By.id("forgotPassword");

    public void loginCredentials(){
        loginText.clear();
        loginText.sendKeys("william");

        loginPassword.clear();
        loginPassword.sendKeys("abcd1234");

        wait.until(ExpectedConditions.elementToBeClickable(okButton));

        okButton.click();
    }

    public void setNewPass(String pass){

    }

    public ForgotPass forgotPassword(String newPass){
        forgotPasswordLink.click();
        ForgotPass = new ForgotPass();
        newPass = ForgotPass.rememberPassword();
        return newPass;
    }




}*/

