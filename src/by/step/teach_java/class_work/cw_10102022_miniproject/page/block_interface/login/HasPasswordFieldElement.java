package by.step.teach_java.class_work.cw_10102022_miniproject.page.block_interface.login;

import by.step.teach_java.class_work.cw_10102022_miniproject.page.element.login.PasswordFieldElement;

public interface HasPasswordFieldElement {
    PasswordFieldElement getPasswordFieldElement();

    default void showPasswordFieldElementSelector () {
        System.out.println(getPasswordFieldElement().elementSelector);
    }
}
