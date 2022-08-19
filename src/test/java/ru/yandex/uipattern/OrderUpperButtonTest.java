package ru.yandex.uipattern;
 
import org.junit.Test;
import ru.yandex.uipattern.page.MainPage;
import ru.yandex.uipattern.page.OrderPage;
import ru.yandex.uipattern.page.OrderSecondPage;

import static org.junit.Assert.assertTrue;

public class OrderUpperButtonTest extends BaseTest{
    @Test
    public void testFirstUpperButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.waitClickable(mainPage.getCookies())
                .clickCookies()
                .clickOrderButton(mainPage.getUpperOrderButton());
        OrderPage orderPage = new OrderPage(driver);
        orderPage.clickElement(orderPage.getNameInput())
                .typeInput(orderPage.getNameInput(), "Елена")
                .clickElement(orderPage.getSurnameInput())
                .typeInput(orderPage.getSurnameInput(), "Фомченкова")
                .clickElement(orderPage.getAdressInput())
                .typeInput(orderPage.getAdressInput(), "Москва")
                .clickElement(orderPage.getMetroStationInput())
                .typeInput(orderPage.getMetroStationInput(), "Белорусская")
                .clickElement(orderPage.getMetroStation())
                .clickElement(orderPage.getPhoneNumberInput())
                .typeInput(orderPage.getPhoneNumberInput(), "88848888888")
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
    public void testSecondtUpperButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.waitClickable(mainPage.getCookies())
                .clickCookies()
                .clickOrderButton(mainPage.getUpperOrderButton());
        OrderPage orderPage = new OrderPage(driver);
        orderPage.clickElement(orderPage.getNameInput())
                .typeInput(orderPage.getNameInput(), "Ирина")
                .clickElement(orderPage.getSurnameInput())
                .typeInput(orderPage.getSurnameInput(), "Иванова")
                .clickElement(orderPage.getAdressInput())
                .typeInput(orderPage.getAdressInput(), "Хабаровск")
                .clickElement(orderPage.getMetroStationInput())
                .typeInput(orderPage.getMetroStationInput(), "Белорусская")
                .clickElement(orderPage.getMetroStation())
                .clickElement(orderPage.getPhoneNumberInput())
                .typeInput(orderPage.getPhoneNumberInput(), "66666664666")
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
