package ru.yandex.uipattern;

import org.junit.Test;
import ru.yandex.uipattern.page.MainPage;
import ru.yandex.uipattern.page.OrderPage;
import ru.yandex.uipattern.page.OrderSecondPage;

import static org.junit.Assert.assertTrue;
 
public class OrderLowerButtonTest extends BaseTest{
    @Test
    public void testFirstLowerButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.waitClickable(mainPage.getCookies())
                .clickCookies()
                .scrollToMiddle()
                .clickOrderButton(mainPage.getLowerOrderButton());
        OrderPage orderPage = new OrderPage(driver);
        orderPage.clickElement(orderPage.getNameInput())
                .typeInput(orderPage.getNameInput(), "Анастасия")
                .clickElement(orderPage.getSurnameInput())
                .typeInput(orderPage.getSurnameInput(), "Петрова")
                .clickElement(orderPage.getAdressInput())
                .typeInput(orderPage.getAdressInput(), "Новосибирск")
                .clickElement(orderPage.getMetroStationInput())
                .typeInput(orderPage.getMetroStationInput(), "Белорусская")
                .clickElement(orderPage.getMetroStation())
                .clickElement(orderPage.getPhoneNumberInput())
                .typeInput(orderPage.getPhoneNumberInput(), "11111111141")
                .clickElement(orderPage.getFurtherButton());
        OrderSecondPage orderSecondPage = new OrderSecondPage(driver);
        boolean result = orderSecondPage.clickElement(orderSecondPage.getWhenBringScooterInput())
                .clickElement(orderSecondPage.getPickDate())
                .clickElement(orderSecondPage.getOpenMenu())
                .clickElement(orderSecondPage.getChooseMenu())
                .clickElement(orderSecondPage.getFinalOrderButton())
                .clickElement(orderSecondPage.getYesButton())
                .isDisplayedOrderCreatedBlock();
        assertTrue(result);
    }


    @Test
    public void testSecondLowerButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.waitClickable(mainPage.getCookies())
                .clickCookies()
                .scrollToMiddle()
                .clickOrderButton(mainPage.getLowerOrderButton());
        OrderPage orderPage = new OrderPage(driver);
        orderPage.clickElement(orderPage.getNameInput())
                .typeInput(orderPage.getNameInput(), "Василиса")
                .clickElement(orderPage.getSurnameInput())
                .typeInput(orderPage.getSurnameInput(), "Прекрасная")
                .clickElement(orderPage.getAdressInput())
                .typeInput(orderPage.getAdressInput(), "Тверь")
                .clickElement(orderPage.getMetroStationInput())
                .typeInput(orderPage.getMetroStationInput(), "Белорусская")
                .clickElement(orderPage.getMetroStation())
                .clickElement(orderPage.getPhoneNumberInput())
                .typeInput(orderPage.getPhoneNumberInput(), "77777777775")
                .clickElement(orderPage.getFurtherButton());
        OrderSecondPage orderSecondPage = new OrderSecondPage(driver);
        boolean result = orderSecondPage.clickElement(orderSecondPage.getWhenBringScooterInput())
                .clickElement(orderSecondPage.getPickDate())
                .clickElement(orderSecondPage.getOpenMenu())
                .clickElement(orderSecondPage.getChooseMenu())
                .clickElement(orderSecondPage.getFinalOrderButton())
                .clickElement(orderSecondPage.getYesButton())
                .isDisplayedOrderCreatedBlock();
        assertTrue(result);
    }
}
