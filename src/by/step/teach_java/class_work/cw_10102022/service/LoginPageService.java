package by.step.teach_java.class_work.cw_10102022.service;

import by.step.teach_java.class_work.cw_10102022.annotation.Service;
import by.step.teach_java.class_work.cw_10102022.page.LoginPage;
import by.step.teach_java.class_work.cw_10102022.service.service_interface.HasLoginPage;

@Service(serviceName = "Login page service")

public class LoginPageService extends BaseService implements HasLoginPage {

    private LoginPage loginPage = new LoginPage();

    @Override
    public LoginPage getLoginPage() {
        return loginPage;
    }
}
