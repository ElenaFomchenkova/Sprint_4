package ru.yandex.uipattern;

import org.junit.Test;
import ru.yandex.uipattern.page.MainPage;
 
import static org.junit.Assert.assertEquals;

public class QuestionsTest extends BaseTest {

    @Test
    public void testFirstQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.waitClickable(mainPage.getCookies())
                .clickCookies().scroll()
                .waitClickable(mainPage.getFirstQuestion())
                .clickElement(mainPage.getFirstQuestion());
        String actual = mainPage.getElementText(mainPage.getFirstText());
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertEquals(actual, expected);

    }

    @Test
    public void testSecondQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.waitClickable(mainPage.getCookies())
                .clickCookies().scroll()
                .waitClickable(mainPage.getSecondQuestion())
                .clickElement(mainPage.getSecondQuestion());
        String actual = mainPage.getElementText(mainPage.getSecondText());
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        assertEquals(actual, expected);

    }

    @Test
    public void testThirdQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.waitClickable(mainPage.getCookies())
                .clickCookies().scroll()
                .waitClickable(mainPage.getThirdQuestion())
                .clickElement(mainPage.getThirdQuestion());
        String actual = mainPage.getElementText(mainPage.getThirdText());
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals(actual, expected);

    }

    @Test
    public void testFourthQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.waitClickable(mainPage.getCookies())
                .clickCookies().scroll()
                .waitClickable(mainPage.getFourthQuestion())
                .clickElement(mainPage.getFourthQuestion());
        String actual = mainPage.getElementText(mainPage.getFourthText());
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        assertEquals(actual, expected);

    }

    @Test
    public void testFifthQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.waitClickable(mainPage.getCookies())
                .clickCookies().scroll()
                .waitClickable(mainPage.getFifthQuestion())
                .clickElement(mainPage.getFifthQuestion());
        String actual = mainPage.getElementText(mainPage.getFifthText());
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        assertEquals(actual, expected);

    }

    @Test
    public void testSixthQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.waitClickable(mainPage.getCookies())
                .clickCookies().scroll()
                .waitClickable(mainPage.getSixthQuestion())
                .clickElement(mainPage.getSixthQuestion());
        String actual = mainPage.getElementText(mainPage.getSixthText());
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        assertEquals(actual, expected);

    }

    @Test
    public void testSeventhQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.waitClickable(mainPage.getCookies())
                .clickCookies().scroll()
                .waitClickable(mainPage.getSeventhQuestion())
                .clickElement(mainPage.getSeventhQuestion());
        String actual = mainPage.getElementText(mainPage.getSeventhText());
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        assertEquals(actual, expected);

    }

    @Test
    public void testEighthQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.waitClickable(mainPage.getCookies())
                .clickCookies().scroll()
                .waitClickable(mainPage.getEighthQuestion())
                .clickElement(mainPage.getEighthQuestion());
        String actual = mainPage.getElementText(mainPage.getEighthText());
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertEquals(actual, expected);

    }


}
