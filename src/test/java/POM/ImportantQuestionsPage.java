package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ImportantQuestionsPage {

    private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
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

    private final WebDriver driver;

    public ImportantQuestionsPage(WebDriver driver) {
        this.driver = driver;
    }
    public ImportantQuestionsPage open() {
        driver.get(PAGE_URL);
        return this;
          }
    public ImportantQuestionsPage clickHowManyQuestion() {
        driver.findElement(HOW_MANY_QUESTION).click();
        return this;
    }

    public ImportantQuestionsPage clickAboutFewScootersQuestion() {
        driver.findElement(ABOUT_A_FEW_SCOOTERS_QUESTION).click();
        return this;
    }

    public ImportantQuestionsPage clickAboutTimeOfRentalQuestion() {
        driver.findElement(ABOUT_TIME_OF_RENTAL_QUESTION).click();
        return this;
    }

    public ImportantQuestionsPage clickAboutRentTodayQuestion() {
        driver.findElement(ABOUT_RENT_TODAY_QUESTION).click();
        return this;
    }

    public ImportantQuestionsPage clickAboutReturnScooterQuestion() {
        driver.findElement(ABOUT_RETURN_SCOOTER_QUESTION).click();
        return this;
    }

    public ImportantQuestionsPage clickAboutChargerQuestion() {
        driver.findElement(ABOUT_CHARGER_QUESTION).click();
        return this;
    }

    public ImportantQuestionsPage clickAboutCancellationsQuestion() {
        driver.findElement(ABOUT_CANCELLATIONS_QUESTION).click();
        return this;
    }

    public ImportantQuestionsPage clickAboutDeliveryMkadQuestion() {
        driver.findElement(ABOUT_DELIVERY_MKAD_QUESTION).click();
        return this;
    }

    public boolean isImageNotFoundDisplayedHowMany() {
        WebElement notFoundImage =
                new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                        ExpectedConditions.visibilityOfElementLocated(ANSWER_HOW_MANY_QUESTION));
        return notFoundImage.isDisplayed();
    }

    public boolean isImageNotFoundDisplayedFewScooters() {
        WebElement notFoundImage =
                new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                        ExpectedConditions.visibilityOfElementLocated(ANSWER_ABOUT_A_FEW_SCOOTERS_QUESTION));
        return notFoundImage.isDisplayed();
    }

    public boolean isImageNotFoundDisplayedTimeOfRental() {
        WebElement notFoundImage =
                new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                        ExpectedConditions.visibilityOfElementLocated(ANSWER_ABOUT_TIME_OF_RENTAL_QUESTION));
        return notFoundImage.isDisplayed();
    }

    public boolean isImageNotFoundDisplayedRentToday() {
        WebElement notFoundImage =
                new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                        ExpectedConditions.visibilityOfElementLocated(ANSWER_ABOUT_RENT_TODAY_QUESTION));
        return notFoundImage.isDisplayed();
    }

    public boolean isImageNotFoundDisplayedReturnScooter() {
        WebElement notFoundImage =
                new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                        ExpectedConditions.visibilityOfElementLocated(ANSWER_ABOUT_RETURN_SCOOTER_QUESTION));
        return notFoundImage.isDisplayed();

    }

    public boolean isImageNotFoundDisplayedCharger() {
        WebElement notFoundImage =
                new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                        ExpectedConditions.visibilityOfElementLocated(ANSWER_ABOUT_CHARGER_QUESTION));
        return notFoundImage.isDisplayed();

    }

    public boolean isImageNotFoundDisplayedCancellations() {
        WebElement notFoundImage =
                new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                        ExpectedConditions.visibilityOfElementLocated(ANSWER_ABOUT_CANCELLATIONS_QUESTION));
        return notFoundImage.isDisplayed();

    }

    public boolean isImageNotFoundDisplayedDeliveryMkad() {
        WebElement notFoundImage =
                new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                        ExpectedConditions.visibilityOfElementLocated(ANSWER_ABOUT_DELIVERY_MKAD_QUESTION));
        return notFoundImage.isDisplayed();

    }
}