import POM.ImportantQuestionsPage;
import POM.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportantQuestionsTest {

    private WebDriver driver;
    // Куки. Банер перекрывает элементы
    private static final By COOKIE_BUTTON =
            By.xpath("//button[@class=\"App_CookieButton__3cvqF\"]");
    // Сколько это стоит? И как оплатить?
    private static final By HOW_MANY_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[1]/div[1]/div");
    // Поле с ответом о стоимости и способом оплаты
    private static final By ANSWER_HOW_MANY_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[1]/div[2]");
    // Хочу сразу несколько самокатов! Так можно?
    private static final By ABOUT_A_FEW_SCOOTERS_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[2]/div[1]");
    // Поле с ответом о нескольких самокатах
    private static final By ANSWER_ABOUT_A_FEW_SCOOTERS_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[2]/div[2]");
    // Как рассчитывается время аренды?
    private static final By ABOUT_TIME_OF_RENTAL_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[3]/div[1]/div");
    //Поле с ответом о расчете времени аренды
    private static final By ANSWER_ABOUT_TIME_OF_RENTAL_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[3]/div[2]");
    // Можно ли заказать самокат прямо на сегодня?
    private static final By ABOUT_RENT_TODAY_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[4]/div[1]");
    // Поле с ответом о аренде сегодня
    private static final By ANSWER_ABOUT_RENT_TODAY_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[4]/div[2]");
    // Можно ли продлить заказ или вернуть самокат раньше?
    private static final By ABOUT_RETURN_SCOOTER_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[5]/div[1]");
    // Поле с ответом о продлении аренды
    private static final By ANSWER_ABOUT_RETURN_SCOOTER_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[5]/div[2]");
    // Вы привозите зарядку вместе с самокатом?
    private static final By ABOUT_CHARGER_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[6]/div[1]");
    // Поле с ответом про зарядное устройство
    private static final By ANSWER_ABOUT_CHARGER_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[6]/div[2]");
    // Можно ли отменить заказ?
    private static final By ABOUT_CANCELLATIONS_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[7]/div[1]");
    // Поле с ответом про отмену заказа
    private static final By ANSWER_ABOUT_CANCELLATIONS_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[7]/div[2]");
    // Я живу за МКАДом, привезёте?
    private static final By ABOUT_DELIVERY_MKAD_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[8]/div[1]");
    //Поле с ответом про аренду за МКАДом
    private static final By ANSWER_ABOUT_DELIVERY_MKAD_QUESTION =
            By.xpath("html/body/div/div/div/div[5]/div[2]/div/div[8]/div[2]");

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(COOKIE_BUTTON).click();
    }

    @Test
    public void FoundDisplayedHowMany() {
        ImportantQuestionsPage ImportantQuestionsPage = new ImportantQuestionsPage(driver);
        ImportantQuestionsPage.open();
        ImportantQuestionsPage.clickHowManyQuestion();
        Assert.assertTrue(ImportantQuestionsPage.isImageNotFoundDisplayedHowMany());
    }
    @Test
    public void FoundDisplayedFewScooters() {
        ImportantQuestionsPage ImportantQuestionsPage = new ImportantQuestionsPage(driver);
        ImportantQuestionsPage.open();
        ImportantQuestionsPage.clickAboutFewScootersQuestion();
        Assert.assertTrue(ImportantQuestionsPage.isImageNotFoundDisplayedFewScooters());
    }
    @Test
    public void FoundDisplayedTimeOfRental() {
        ImportantQuestionsPage ImportantQuestionsPage = new ImportantQuestionsPage(driver);
        ImportantQuestionsPage.open();
        ImportantQuestionsPage.clickAboutTimeOfRentalQuestion();
        Assert.assertTrue(ImportantQuestionsPage.isImageNotFoundDisplayedTimeOfRental());
    }
    @Test
    public void FoundDisplayedRentToday() {
        ImportantQuestionsPage ImportantQuestionsPage = new ImportantQuestionsPage(driver);
        ImportantQuestionsPage.open();
        ImportantQuestionsPage.clickAboutRentTodayQuestion();
        Assert.assertTrue(ImportantQuestionsPage.isImageNotFoundDisplayedRentToday());
    }
    @Test
    public void FoundDisplayedReturnScooter() {
        ImportantQuestionsPage ImportantQuestionsPage = new ImportantQuestionsPage(driver);
        ImportantQuestionsPage.open();
        ImportantQuestionsPage.clickAboutReturnScooterQuestion();
        Assert.assertTrue(ImportantQuestionsPage.isImageNotFoundDisplayedReturnScooter());
    }
    @Test
    public void FoundDisplayedCharger() {
        ImportantQuestionsPage ImportantQuestionsPage = new ImportantQuestionsPage(driver);
        ImportantQuestionsPage.open();
        ImportantQuestionsPage.clickAboutChargerQuestion();
        Assert.assertTrue(ImportantQuestionsPage.isImageNotFoundDisplayedCharger());
    }
    @Test
    public void FoundDisplayedCancellations() {
        ImportantQuestionsPage ImportantQuestionsPage = new ImportantQuestionsPage(driver);
        ImportantQuestionsPage.open();
        ImportantQuestionsPage.clickAboutCancellationsQuestion();
        Assert.assertTrue(ImportantQuestionsPage.isImageNotFoundDisplayedCancellations());
    }
    @Test
    public void FoundDisplayedDeliveryMkad() {
        ImportantQuestionsPage ImportantQuestionsPage = new ImportantQuestionsPage(driver);
        ImportantQuestionsPage.open();
        ImportantQuestionsPage.clickAboutDeliveryMkadQuestion();
        Assert.assertTrue(ImportantQuestionsPage.isImageNotFoundDisplayedDeliveryMkad());
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}

