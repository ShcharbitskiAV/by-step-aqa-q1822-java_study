package by.step.teach_java.class_work.cw_10102022_miniproject.page.block_interface.login;

import by.step.teach_java.class_work.cw_10102022_miniproject.page.element.login.LoginButtonElement;

public interface HasLoginButtonElement {

    LoginButtonElement getLoginButtonElement();

    default void showLoginButtonElementSelector () {
        System.out.println(getLoginButtonElement().elementSelector);
    }
}
