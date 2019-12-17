package pages;

import org.openqa.selenium.By;
import utils.PageBase;
import org.apache.log4j.Logger;



public class FaceBook extends PageBase {

    private static By HrFacebook=By.xpath("//*[@src=\"https://static.xx.fbcdn.net/rsrc.php/v3/yi/r/OBaVg52wtTZ.png\"]");
    private static By Firstname = By.xpath("//*[@id=\"u_0_m\"]");
    private static By Lastname = By.xpath("//*[@name=\"lastname\"]");
   // private static By Regemail = By.xpath("//*[@name=\"reg_email__\"]");
   private static By Email = By.xpath("//*[@name=\"reg_email__\"]");
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(FaceBook.class));


    public static void setFirstname(String mshan) {
        getDriver().findElement(Firstname).sendKeys(mshan);
        LOGGER.info("Entered FistName");

    }
    public static boolean isFacebookPageDisplayed() {
        return getDriver().findElement(HrFacebook).isDisplayed();

    }
    public static void setLastname(String nahs) {
        getDriver().findElement(Lastname).sendKeys(nahs);
        LOGGER.info("Entered lastName");
    }
    public static void waitFistname() {
        implicitWait(Firstname, 10);
    }

    public static void setEmail(String email) {
        getDriver().findElement(Email).sendKeys(email);

    }

}
