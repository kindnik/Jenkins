package appleInsider;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@type='text'][@class='search-main']");

    public MainPage(String url) {
        Selenide.open(url);
    }

    protected SearchPage search(String searchString) {
        textBoxInput.click();
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}
