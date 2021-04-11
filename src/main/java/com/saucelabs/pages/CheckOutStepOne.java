package com.saucelabs.pages;
import com.saucelabs.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.saucelabs.base.BasePage.driver;

public class CheckOutStepOne {

    @FindBy(xpath="//div[@class = 'inventory_item_name']")
    private static WebElement itemName;

    @FindBy(xpath = "//*[@id='cart_contents_container']/div/div[2]/a[2]")
    public static WebElement checkOutBtn;

    public CheckOutStepOne()
    {
        PageFactory.initElements(driver, this);
    }

    public static void clickOnCheckout(){
        HelperMethods.doClick(checkOutBtn);
    }

    public static String getItemName(){
        return HelperMethods.doGetText(itemName);
    }

}
