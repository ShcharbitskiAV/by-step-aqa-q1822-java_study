package by.step.teach_java.class_work.cw_10102022.page.element.login;

import by.step.teach_java.class_work.cw_10102022.annotation.Element;
import by.step.teach_java.class_work.cw_10102022.page.element.Input;

@Element(elementName = "Login field element")

public class LoginFieldElement extends Input {

    public LoginFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
