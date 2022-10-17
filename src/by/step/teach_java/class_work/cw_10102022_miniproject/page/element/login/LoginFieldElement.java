package by.step.teach_java.class_work.cw_10102022_miniproject.page.element.login;

import by.step.teach_java.class_work.cw_10102022_miniproject.annotation.Element;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.element.Input;

@Element(elementName = "Login field element")

public class LoginFieldElement extends Input {

    public LoginFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
