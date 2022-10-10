package by.step.teach_java.class_work.cw_10102022.page.element.login;

import by.step.teach_java.class_work.cw_10102022.annotation.Element;
import by.step.teach_java.class_work.cw_10102022.page.element.Link;

@Element(elementName = "Recover password element")

public class RecoverPasswordElement extends Link {

    public RecoverPasswordElement(String elementSelector) {
        super(elementSelector);
    }
}
