package ru.yandex.uipattern.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class OrderSecondPage {
    WebDriver driver;

    public OrderSecondPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //поле с датой
    @FindBy(xpath = ".//input[@placeholder='* Когда привезти самокат']")
    private WebElement whenBringScooterInput;
    //выбор даты
    @FindBy(xpath = ".//div[@class = 'react-datepicker__day react-datepicker__day--031']")
    private WebElement pickDate;
    //поле со сроком аренды
    @FindBy(css = "div.Dropdown-root")
    private WebElement openMenu;
    //выбор срока аренды
    @FindBy(xpath = ".//div[@class='Dropdown-option'][3]")
    private WebElement chooseMenu;
    //кнопка заказать
    @FindBy(xpath = ".//div[@class = 'Order_Buttons__1xGrp']/button[text() = 'Заказать']")
    private WebElement finalOrderButton;
    //кнопка Да
    @FindBy(xpath = ".//button[text90 = 'Да']")
    private WebElement yesButton;
    //окно с подтверждением заказа
    @FindBy(css = "div.Order_Modal__YZ-d3")
    private WebElement orderCreatedBlock;

    public OrderSecondPage clickElement(WebElement element) {
        element.click();
        return this;
    }

    public boolean isDisplayedOrderCreatedBlock() {
        return getOrderCreatedBlock().isDisplayed();
    }


    public WebElement getWhenBringScooterInput() {
        return whenBringScooterInput;
    }

    public WebElement getOpenMenu() {
        return openMenu;
    }

    public WebElement getChooseMenu() {
        return chooseMenu;
    }

    public WebElement getPickDate() {
        return pickDate;
    }

    public WebElement getFinalOrderButton() {
        return finalOrderButton;
    }


    public WebElement getYesButton() {
        return yesButton;
    }

    public WebElement getOrderCreatedBlock() {
        return orderCreatedBlock;
    }
}
