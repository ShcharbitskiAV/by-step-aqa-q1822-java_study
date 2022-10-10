package by.step.teach_java.class_work.cw_10102022.page.element.login.language_element;

import by.step.teach_java.class_work.cw_10102022.annotation.Element;
import by.step.teach_java.class_work.cw_10102022.page.element.Label;

@Element(elementName = "title language element")

public class TitleLanguageElement extends Label {

    public TitleLanguageElement(String elementSelector) {
        super(elementSelector);
    }
}
