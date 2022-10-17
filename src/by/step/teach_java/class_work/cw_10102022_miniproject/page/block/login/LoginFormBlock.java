package by.step.teach_java.class_work.cw_10102022_miniproject.page.block.login;

import by.step.teach_java.class_work.cw_10102022_miniproject.annotation.Block;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.block.BaseBlock;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.block_interface.login.HasLoginButtonElement;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.block_interface.login.HasLoginFieldElement;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.block_interface.login.HasPasswordFieldElement;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.block_interface.login.HasRecoverPasswordElement;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.element.login.LoginButtonElement;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.element.login.LoginFieldElement;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.element.login.PasswordFieldElement;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.element.login.RecoverPasswordElement;

@Block(blockName = "Login form block")

public class LoginFormBlock extends BaseBlock implements HasLoginButtonElement, HasLoginFieldElement, HasPasswordFieldElement, HasRecoverPasswordElement {

    private LoginButtonElement loginButtonElement = new LoginButtonElement("Selector for Login Button");
    private LoginFieldElement loginFieldElement = new LoginFieldElement("Selector for Login input");
    private PasswordFieldElement passwordFieldElement = new PasswordFieldElement("Selector for Password input");
    private RecoverPasswordElement recoverPasswordElement = new RecoverPasswordElement("Selector for recover link");


    @Override
    public LoginButtonElement getLoginButtonElement() {
        return loginButtonElement;
    }

    @Override
    public LoginFieldElement getLoginFieldElement() {
        return loginFieldElement;
    }

    @Override
    public PasswordFieldElement getPasswordFieldElement() {
        return passwordFieldElement;
    }

    @Override
    public RecoverPasswordElement getRecoverPasswordElement() {
        return recoverPasswordElement;
    }
}
