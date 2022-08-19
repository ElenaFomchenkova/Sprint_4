package ru.yandex.uipattern.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class OrderPage {

    WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //поле Имя
    @FindBy(xpath = ".//input[@placeholder='* Имя']")
    private WebElement nameInput;
    //поле Фамилия
    @FindBy(xpath = ".//input[@placeholder='* Фамилия']")
    private WebElement surnameInput;
    //поле Адрес
    @FindBy(xpath = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private WebElement adressInput;
    //поле Станция метро
    @FindBy(xpath = ".//input[@placeholder='* Станция метро']")
    private WebElement metroStationInput;
    //Станция метро
    @FindBy(xpath = ".//button[@value='29']")
    private WebElement metroStation;
    //поле Телефон
    @FindBy(xpath = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private WebElement phoneNumberInput;
    //кнопка Далее
    @FindBy(xpath = ".//button[@class ='Button_Button__ra12g Button_Middle__1CSJM']")
    private WebElement furtherButton;

    public OrderPage clickElement(WebElement element) {
        element.click();
        return this;
    }

    public OrderPage typeInput(WebElement element, String value) {
        element.sendKeys(value);
        return this;
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getSurnameInput() {
        return surnameInput;
    }

    public WebElement getAdressInput() {
        return adressInput;
    }

    public WebElement getMetroStationInput() {
        return metroStationInput;
    }

    public WebElement getPhoneNumberInput() {
        return phoneNumberInput;
    }

    public WebElement getMetroStation() {
        return metroStation;
    }

    public WebElement getFurtherButton() {
        return furtherButton;
    }

}
