package utils;

import org.testng.asserts.SoftAssert;

public class CommonMethods {

    /************************
     * Soft assert object   *
     * **********************
     */

    public static SoftAssert soft_assert = null;

    public static SoftAssert softAssert() {
        if (soft_assert == null) {
            soft_assert = new SoftAssert();
        }
        return soft_assert;
    }

}
