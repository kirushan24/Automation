package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FaceBook;
import utils.TestBase;


public class FbTest extends TestBase {
    @Test(priority=1, enabled=true)
    public void fbtesting(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(FaceBook.isFacebookPageDisplayed(),"Facebook Page Is Not Display");
        FaceBook.setFirstname("Kirushan");
        FaceBook.setLastname("Sivanandam");
        FaceBook.setEmail("0775852302");
        softAssert.assertAll();


    }
}
