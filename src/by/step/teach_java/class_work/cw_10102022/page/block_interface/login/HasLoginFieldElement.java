package by.step.teach_java.class_work.cw_10102022.page.block_interface.login;

import by.step.teach_java.class_work.cw_10102022.page.element.login.LoginFieldElement;

public interface HasLoginFieldElement {

    LoginFieldElement getLoginFieldElement();

    default void showLoginFieldElementSelector () {
        System.out.println(getLoginFieldElement().elementSelector);
    }
}
