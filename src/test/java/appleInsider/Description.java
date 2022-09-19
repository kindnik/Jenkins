package appleInsider;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Description {

    public Description() {
    }

    private final SelenideElement level = $x("//a[@class='title dropdown-link88']");
    private final SelenideElement levelJunior = $x("//a[text()='Junior']");
    private final SelenideElement chooseKurs = $x("//a[text()='Введение в Apache Maven']");

    protected KursApache searchJunior() {
        level.click();
        levelJunior.scrollTo().click();
        chooseKurs.click();

        return new KursApache();

    }
}
