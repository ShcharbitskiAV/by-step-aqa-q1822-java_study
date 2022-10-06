package by.step.teach_java.class_work.cw_06102022;

import by.step.teach_java.class_work.cw_06102022.registration_block.Registrationblock;

public interface HasRegistrationBlock {

    Registrationblock getRegistrationblock();

    default void verifyCreateButton () {
        if (getRegistrationblock().createButton.getNumber() == 2) {
            System.out.println("Correctly!");
        }
        else {
            System.out.println("Mistake!");
        }
    }

    default void verifyNextButton () {
        if (getRegistrationblock().nextButton.getNumber() == 2) {
            System.out.println("Correctly!");
        }
        else {
            System.out.println("Mistake!");
        }
    }

}
