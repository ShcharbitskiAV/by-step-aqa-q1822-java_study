package by.step.teach_java.class_work.cw_10102022_miniproject.page.element.login.language_element;

import by.step.teach_java.class_work.cw_10102022_miniproject.annotation.Element;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.element.Link;

@Element(elementName = "Language element")

public class LanguageElement extends Link {

    public LanguageElement(String elementSelector) {
        super(elementSelector);
    }
}
