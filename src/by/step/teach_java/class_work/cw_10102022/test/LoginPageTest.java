import by.step.teach_java.class_work.cw_10102022.service.LoginPageService;

public class LoginPageTest {

    private LoginPageService loginPageService = new LoginPageService();

    public static void main(String[] args) {
        LoginPageTest test = new LoginPageTest();
        test.checkLoginButton();
        test.checkLoginField();
        test.checkPasswordField();
        test.checkRecoverPassword();
        test.checkLanguageElement();
        test.checkTitleLanguageElement();
    }

    public void checkPasswordField () {
        loginPageService.getLoginPage().getLoginFormBlock().showPasswordFieldElementSelector();
    }

    public void checkLoginField () {
        loginPageService.getLoginPage().getLoginFormBlock().showLoginFieldElementSelector();
    }

    public void checkLoginButton () {
        loginPageService.getLoginPage().getLoginFormBlock().showLoginButtonElementSelector();
    }

    public void checkRecoverPassword () {
        loginPageService.getLoginPage().getLoginFormBlock().showRecoverPasswordElementSelector();
    }

    public void checkLanguageElement () {
        loginPageService.getLoginPage().getLanguageBlock().showLanguageElementSelector();
    }

    public void checkTitleLanguageElement () {
        loginPageService.getLoginPage().getLanguageBlock().showTitleLanguageElementSelector();
    }
}
