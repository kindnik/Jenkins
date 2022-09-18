package appleInsider;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class KursApache {

    public KursApache() {
    }

    SelenideElement buttonЗаписаться_курс = $x("//div[@class='course-detail__offer']//span[text()='Записаться на курс']");

    protected Записаться_на_курс clickButton() {
        buttonЗаписаться_курс.click();
        return new Записаться_на_курс();
    }
}

