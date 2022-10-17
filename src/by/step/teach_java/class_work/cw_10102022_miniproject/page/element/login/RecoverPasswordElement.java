package by.step.teach_java.class_work.cw_10102022_miniproject.page.element.login;

import by.step.teach_java.class_work.cw_10102022_miniproject.annotation.Element;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.element.Link;

@Element(elementName = "Recover password element")

public class RecoverPasswordElement extends Link {

    public RecoverPasswordElement(String elementSelector) {
        super(elementSelector);
    }
}
