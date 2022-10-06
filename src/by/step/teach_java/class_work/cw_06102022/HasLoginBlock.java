package by.step.teach_java.class_work.cw_06102022;

import by.step.teach_java.class_work.cw_06102022.login_block.CancelButton;
import by.step.teach_java.class_work.cw_06102022.login_block.Loginblock;

public interface HasLoginBlock {

    Loginblock getLoginblock ();

    default void verifyCancelButton () {
        if (getLoginblock().cancelButton.getNumber() == 2) {
            System.out.println("Correctly!");
        }
        else {
            System.out.println("Mistake!");
        }
    }

    default void verifyOpenButton () {
        if (getLoginblock().openButton.getNumber() == 2) {
            System.out.println("Correctly!");
        }
        else {
            System.out.println("Mistake!");
        }
    }

}
