
package ru.yandex.uipattern.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import java.time.Duration;

public class MainPage {

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.get(pageUrl);
    }

    WebDriver driver;
    public final String pageUrl = "https://qa-scooter.praktikum-services.ru/";
    //Первый вопрос
    @FindBy(id = "accordion__heading-0")
    private WebElement firstQuestion;
    //Второй вопрос
    @FindBy(id = "accordion__heading-1")
    private WebElement secondQuestion;
    //Третий вопрос
    @FindBy(id = "accordion__heading-2")
    private WebElement thirdQuestion;
    //Четвертый вопрос
    @FindBy(id = "accordion__heading-3")
    private WebElement fourthQuestion;
    //Пятый вопрос
    @FindBy(id = "accordion__heading-4")
    private WebElement fifthQuestion;
    //Шестой вопрос
    @FindBy(id = "accordion__heading-5")
    private WebElement sixthQuestion;
    //Седьмой вопрос
    @FindBy(id = "accordion__heading-6")
    private WebElement seventhQuestion;
    //Восьмой вопрос
    @FindBy(id = "accordion__heading-7")
    private WebElement eighthQuestion;

    //Первый ответ
    @FindBy(css = "#accordion__panel-0 > p")
    private WebElement firstText;
    //Второй ответ
    @FindBy(css = "#accordion__panel-1 > p")
    private WebElement secondText;
    //Третий ответ
    @FindBy(css = "#accordion__panel-2 > p")
    private WebElement thirdText;
    //Четвертый ответ
    @FindBy(css = "#accordion__panel-3 > p")
    private WebElement fourthText;
    //Пятый ответ
    @FindBy(css = "#accordion__panel-4 > p")
    private WebElement fifthText;
    //Шестой ответ
    @FindBy(css = "#accordion__panel-5 > p")
    private WebElement sixthText;
    //Седьмой ответ
    @FindBy(css = "#accordion__panel-6 > p")
    private WebElement seventhText;
    //Восьмой ответ
    @FindBy(css = "#accordion__panel-7 > p")
    private WebElement eighthText;

    //Верхняя кнопка Заказать
    @FindBy(css = ".Header_Nav__AGCXC > .Button_Button__ra12g")
    private WebElement upperOrderButton;

    //Нижняя кнопка Заказать
    @FindBy(xpath = ".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']")
    private WebElement lowerOrderButton;
    // Кнопка подтверждения кук
    @FindBy(className = "App_CookieButton__3cvqF")
    private WebElement cookies;

    // Кликаем на подтверждение кук
    public MainPage clickCookies() {
        cookies.click();
        return this;
    }

    public MainPage clickElement(WebElement element) { //клик на любой веб.элемент
        element.click();
        return this;
    }

    public OrderPage clickOrderButton(WebElement element) { //клик на кнопку заказа с переходом на другую страницу
        element.click();
        return new OrderPage(driver);
    }

    //Получаем текст элемента
    public String getElementText(WebElement element) {
        return element.getText();
    }

    //листаем до конца страницы
    public MainPage scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)", "");
        return this;
    }

    //листаем до середины страницы
    public MainPage scrollToMiddle() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");
        return this;
    }

    public MainPage waitClickable(WebElement element) { //ждем, пока элемент станет кликабельным
        new WebDriverWait(driver, Duration.ofSeconds(100))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public WebElement getFirstQuestion() {
        return firstQuestion;
    }

    public WebElement getSecondQuestion() {
        return secondQuestion;
    }

    public WebElement getThirdQuestion() {
        return thirdQuestion;
    }

    public WebElement getFourthQuestion() {
        return fourthQuestion;
    }

    public WebElement getFifthQuestion() {
        return fifthQuestion;
    }

    public WebElement getSixthQuestion() {
        return sixthQuestion;
    }

    public WebElement getSeventhQuestion() {
        return seventhQuestion;
    }

    public WebElement getEighthQuestion() {
        return eighthQuestion;
    }

    public WebElement getFirstText() {
        return firstText;
    }

    public WebElement getSecondText() {
        return secondText;
    }

    public WebElement getThirdText() {
        return thirdText;
    }

    public WebElement getFourthText() {
        return fourthText;
    }

    public WebElement getFifthText() {
        return fifthText;
    }

    public WebElement getSixthText() {
        return sixthText;
    }

    public WebElement getSeventhText() {
        return seventhText;
    }

    public WebElement getEighthText() {
        return eighthText;
    }


    public WebElement getCookies() {
        return cookies;
    }

    public WebElement getUpperOrderButton() {
        return upperOrderButton;
    }

    public WebElement getLowerOrderButton() {
        return lowerOrderButton;
    }
}

