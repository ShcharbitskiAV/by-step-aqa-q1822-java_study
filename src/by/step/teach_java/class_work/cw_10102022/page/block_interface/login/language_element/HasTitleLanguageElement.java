package by.step.teach_java.class_work.cw_10102022.page.block_interface.login.language_element;

import by.step.teach_java.class_work.cw_10102022.page.element.login.language_element.TitleLanguageElement;

public interface HasTitleLanguageElement {

    TitleLanguageElement getTitleLanguageElement();

    default void showTitleLanguageElementSelector () {
        System.out.println(getTitleLanguageElement().elementSelector);
    }
}
