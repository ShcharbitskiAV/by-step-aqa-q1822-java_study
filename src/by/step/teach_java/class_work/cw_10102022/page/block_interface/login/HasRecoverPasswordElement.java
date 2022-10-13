package by.step.teach_java.class_work.cw_10102022.page.block_interface.login;

import by.step.teach_java.class_work.cw_10102022.page.element.login.RecoverPasswordElement;

public interface HasRecoverPasswordElement {
    RecoverPasswordElement getRecoverPasswordElement();

    default void showRecoverPasswordElementSelector () {
        System.out.println(getRecoverPasswordElement().elementSelector);
    }
}
