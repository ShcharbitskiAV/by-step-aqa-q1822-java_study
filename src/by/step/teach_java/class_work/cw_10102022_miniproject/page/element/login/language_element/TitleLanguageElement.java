package by.step.teach_java.class_work.cw_10102022_miniproject.page.element.login.language_element;

import by.step.teach_java.class_work.cw_10102022_miniproject.annotation.Element;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.element.Label;

@Element(elementName = "title language element")

public class TitleLanguageElement extends Label {

    public TitleLanguageElement(String elementSelector) {
        super(elementSelector);
    }
}
