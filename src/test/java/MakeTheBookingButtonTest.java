import POM.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Parameterized.class)
public class MakeTheBookingButtonTest {
    // Куки. Банер перекрывает элементы
    private static final By COOKIE_BUTTON =
            By.xpath("//button[@class=\"App_CookieButton__3cvqF\"]");
    // Верхняя кнопка заказа
    private static final By ORDER_BUTTON_TOP =
            By.xpath("//button[@class=\"Button_Button__ra12g\"]");
    // Нижняя кнопка заказа
    private static final By ORDER_BUTTON_LOWER =
            By.xpath("//button[@class=\"Button_Button__ra12g Button_Middle__1CSJM\"]");
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
            By.ByCssSelector("div.Order_Form__17u6u > img");


    private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final String subway;
    private final String phone;
    private final String date;


    public MakeTheBookingButtonTest(String name, String surname, String address, String subway, String phone, String date) {

        this.name = name;
        this.surname = surname;
        this.address = address;
        this.subway = subway;
        this.phone = phone;
        this.date = date;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {

        return new Object[][]
                {{"Маша", "Лобанова", "Санкт-Петербург", "Цветной бульвар", "+79211231231", "25.03.2023"},
                {"Денис", "Рылько", "Москва", "Сокольники", "+79101231231", "26.03.2023"}};
          }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(COOKIE_BUTTON).click();
    }

    @Test
    public void checkGetOrderTopButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCheckCookieButton();
        mainPage.clickCheckOrderButtonTop();
        mainPage.enterName(name);
        mainPage.enterSurname(surname);
        mainPage.enterAddress(address);
        mainPage.enterSubway(subway + Keys.ARROW_DOWN + Keys.ENTER);
        mainPage.enterPhone(phone);
        mainPage.clickNextButton();
        mainPage.enterDate(date + Keys.ENTER);
        mainPage.clickPeriodOfRent();
        mainPage.clickSelectRentalPeriod();
        mainPage.clickBlackColor();
        mainPage.clickBookingButton();
        mainPage.clickOrderYes();
        Assert.assertTrue(mainPage.isImageNotFoundDisplayed());
    }
    @Test
    public void checkGetOrderLowerButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCheckCookieButton();
        mainPage.clickCheckOrderButtonLower();
        mainPage.enterName(name);
        mainPage.enterSurname(surname);
        mainPage.enterAddress(address);
        mainPage.enterSubway(subway + Keys.ARROW_DOWN + Keys.ENTER);
        mainPage.enterPhone(phone);
        mainPage.clickNextButton();
        mainPage.enterDate(date + Keys.ENTER);
        mainPage.clickPeriodOfRent();
        mainPage.clickSelectRentalPeriod();
        mainPage.clickBlackColor();
        mainPage.clickBookingButton();
        mainPage.clickOrderYes();
        Assert.assertTrue(mainPage.isImageNotFoundDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}



    //@Test
    //public void getOrder() {

     //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //   driver.findElement(ORDER_BUTTON_TOP).click();
      //  driver.findElement(NAME).sendKeys(name);
     //   driver.findElement(SURNAME).sendKeys(surname);
     //   driver.findElement(ADDRESS).sendKeys(address);
     //   driver.findElement(SUBWAY).sendKeys(subway + Keys.ARROW_DOWN, Keys.ENTER);
      //  driver.findElement(PHONE).sendKeys(phone);
      //  driver.findElement(NEXT_BUTTON).click();
      //  driver.findElement(DATE).sendKeys(date + Keys.ENTER);
      //  driver.findElement(PERIOD_OF_RENT).click();
      //  driver.findElement(SELECT_RENTAL_PERIOD).click();
      //  driver.findElement(BLACK_COLOR).click();
      //  driver.findElement(BOOKING_BUTTON).click();
  //  }

      //  ChromeOptions options = new ChromeOptions();
      // options.addArguments("--remote-allow-origins=*");
      //  driver = new ChromeDriver(options);

