package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    // Куки. Банер перекрывает элементы
    private static final By COOKIE_BUTTON =
            By.xpath("//button[@class=\"App_CookieButton__3cvqF\"]");
    // Верхняя кнопка заказа
    private static final By ORDER_BUTTON_TOP =
            By.xpath("//button[@class=\"Button_Button__ra12g\"]");
    // Нижняя кнопка заказа
    private static final By ORDER_BUTTON_LOWER =
            By.xpath("//button[@class=\"Button_Button__ra12g Button_Middle__1CSJM\"]");
    // Поле "Имя"
    private static final By NAME =
            By.xpath("//input[@placeholder=\"* Имя\"]");
    // Поле "Фамилия"
    private static final By SURNAME =
            By.xpath("//input[@placeholder=\"* Фамилия\"]");
    // Поле "Адрес:куда привезти заказ"
    private static final By ADDRESS =
            By.xpath("//input[@placeholder=\"* Адрес: куда привезти заказ\"]");
    // Поле "Станция метро"
    private static final By SUBWAY =
            By.xpath("//input[@placeholder=\"* Станция метро\"]");
    // Поле "Телефон: на него позвонит курьер"
    private static final By PHONE =
            By.xpath("//input[@placeholder=\"* Телефон: на него позвонит курьер\"]");
    // Кнопка "Далее"
    private static final By NEXT_BUTTON =
            By.xpath("//button[@class=\"Button_Button__ra12g Button_Middle__1CSJM\"]");
    // Поле "Когда привезти самокат"
    private static final By DATE =
            By.xpath("//input[@placeholder=\"* Когда привезти самокат\"]");
    // Поле "Срок аренды"
    private static final By PERIOD_OF_RENT =
            By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]");
    // Выпадающее меню срока аренды
    private static final By SELECT_RENTAL_PERIOD =
            By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]");
    // Поле "Черный цвет самоката"
    private static final By BLACK_COLOR =
            By.xpath("//*[@id=\"black\"]");
    // Кнопка "Заказать"
    private static final By BOOKING_BUTTON =
            By.xpath("button[@class=\"Button_Button__ra12g Button_Middle__1CSJM\"]");
    // Кнопка "Да" в окне "Хотите оформить заказ?"
    private static final By ORDER_YES =
            By.xpath("button[@class=\"Button_Button__ra12g Button_Middle__1CSJM\"]");
    // Поле "Заказ оформлен"
    private static final By NOT_FOUND_IMAGE =
            By.ByCssSelector ("div.Order_Form__17u6u > img");
    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage open() {
        driver.get(PAGE_URL);
        return this;
    }

    public MainPage clickCheckCookieButton() {
        driver.findElement(COOKIE_BUTTON).click();
        return this;
    }

    public MainPage clickCheckOrderButtonTop() {
        driver.findElement(ORDER_BUTTON_TOP).click();
        return this;
    }

    public MainPage clickCheckOrderButtonLower() {
        driver.findElement(ORDER_BUTTON_LOWER).click();
        return this;
    }
    public MainPage enterName(String name) {
        driver.findElement(NAME).sendKeys();
        return this;
    }

    public MainPage enterSurname(String surname) {
        driver.findElement(SURNAME).sendKeys();
        return this;
    }

    public MainPage enterAddress(String address) {
        driver.findElement(ADDRESS).sendKeys();
        return this;
    }

    public MainPage enterSubway(String s) {
        driver.findElement(SUBWAY).sendKeys();
        return this;
    }

    public MainPage enterPhone(String phone) {
        driver.findElement(PHONE).sendKeys();
        return this;
    }

    public MainPage clickNextButton() {
        driver.findElement(NEXT_BUTTON).click();
        return this;
    }

    public MainPage enterDate(String s) {
        driver.findElement(DATE).sendKeys();
        return this;
    }

    public MainPage clickPeriodOfRent() {
        driver.findElement(PERIOD_OF_RENT).click();
        return this;
    }

    public MainPage clickSelectRentalPeriod() {
        driver.findElement(SELECT_RENTAL_PERIOD).click();
        return this;
    }

    public MainPage clickBlackColor() {
        driver.findElement(BLACK_COLOR).click();
        return this;
    }

    public MainPage clickBookingButton() {
        driver.findElement(BOOKING_BUTTON).click();
        return this;
    }

    public MainPage clickOrderYes() {
        driver.findElement(ORDER_YES).click();
        return this;
    }

    public boolean isImageNotFoundDisplayed() {
        WebElement notFoundImage =
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
        ExpectedConditions.visibilityOfElementLocated(NOT_FOUND_IMAGE));
        return notFoundImage.isDisplayed();
    }
}

