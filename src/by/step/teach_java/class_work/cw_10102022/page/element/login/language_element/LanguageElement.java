package by.step.teach_java.class_work.cw_10102022.page.element.login.language_element;

import by.step.teach_java.class_work.cw_10102022.annotation.Element;
import by.step.teach_java.class_work.cw_10102022.page.element.Link;

@Element(elementName = "Language element")

public class LanguageElement extends Link {

    public LanguageElement(String elementSelector) {
        super(elementSelector);
    }
}
