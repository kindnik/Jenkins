package appleInsider;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    public SearchPage() {
    }

    private final SelenideElement kurs =$x("//a[text()='Java'][@class='search-phrase__link']");

    protected Description searchKurs() {
    //    kurs.shouldBe(Condition.visible).click();
        kurs.click();

        return new Description();
    }
}
