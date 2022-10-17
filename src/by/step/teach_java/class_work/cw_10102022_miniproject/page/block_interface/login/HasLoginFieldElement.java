package by.step.teach_java.class_work.cw_10102022_miniproject.page.block_interface.login;

import by.step.teach_java.class_work.cw_10102022_miniproject.page.element.login.LoginFieldElement;

public interface HasLoginFieldElement {

    LoginFieldElement getLoginFieldElement();

    default void showLoginFieldElementSelector () {
        System.out.println(getLoginFieldElement().elementSelector);
    }
}
