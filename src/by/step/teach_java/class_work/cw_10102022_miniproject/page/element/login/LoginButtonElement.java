package by.step.teach_java.class_work.cw_10102022_miniproject.page.element.login;

import by.step.teach_java.class_work.cw_10102022_miniproject.annotation.Element;
import by.step.teach_java.class_work.cw_10102022_miniproject.page.element.Button;

@Element(elementName = "Login button element")

public class LoginButtonElement extends Button {

    public LoginButtonElement(String elementSelector) {
        super(elementSelector);
    }
}
