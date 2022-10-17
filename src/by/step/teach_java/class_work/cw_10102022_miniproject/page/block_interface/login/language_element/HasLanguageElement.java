package by.step.teach_java.class_work.cw_10102022_miniproject.page.block_interface.login.language_element;

import by.step.teach_java.class_work.cw_10102022_miniproject.page.element.login.language_element.LanguageElement;

public interface HasLanguageElement {

    LanguageElement getLanguageElement();

    default void showLanguageElementSelector () {
        System.out.println(getLanguageElement().elementSelector);
    }
}
