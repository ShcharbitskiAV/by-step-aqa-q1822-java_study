package by.step.teach_java.class_work.cw_10102022.page.block.login;

import by.step.teach_java.class_work.cw_10102022.annotation.Block;
import by.step.teach_java.class_work.cw_10102022.page.block.BaseBlock;
import by.step.teach_java.class_work.cw_10102022.page.element.login.LoginButtonElement;
import by.step.teach_java.class_work.cw_10102022.page.element.login.LoginFieldElement;
import by.step.teach_java.class_work.cw_10102022.page.element.login.PasswordFieldElement;
import by.step.teach_java.class_work.cw_10102022.page.element.login.RecoverPasswordElement;

@Block(blockName = "Login form block")

public class LoginFormBlock extends BaseBlock {

    private LoginButtonElement loginButtonElement = new LoginButtonElement("Selector for Login Button");
    private LoginFieldElement loginFieldElement = new LoginFieldElement("Selector for Login input");
    private PasswordFieldElement passwordFieldElement = new PasswordFieldElement("Selector for Password input");
    private RecoverPasswordElement recoverPasswordElement = new RecoverPasswordElement("Selector for recover link");


}
