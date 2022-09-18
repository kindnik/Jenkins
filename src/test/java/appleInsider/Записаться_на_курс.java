package appleInsider;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.Wait;

import static com.codeborne.selenide.Selenide.$x;

public class Записаться_на_курс {

    public Записаться_на_курс() {
        SelenideElement nameForm = $x("//span[@class='el-dialog__title']");
        Assertions.assertEquals("Записаться на курс", nameForm.getText(), "Неверная форма");
    }

    public enum ПоляФормы {
        ФИО("ФИО"),
        КОМПАНИЯ("Компания"),
        MAIL("E-mail"),
        ТЕЛЕФОН("Телефон"),
        ГОРОД("Город");

        private String имя_поля;

        ПоляФормы(String имя_поля) {
            this.имя_поля = имя_поля;
        }
    }

    protected Записаться_на_курс filNewData(ПоляФормы nameField, String value) {
        SelenideElement field = $x("//label[text()='" + nameField.имя_поля + "']/ancestor::div[@class='el-col el-col-8 el-col-xs-24']//input");
        field.setValue(value);
        Assertions.assertEquals(value, field.getValue(), "Неверно заполнено поле");
        return this;
    }

    protected Записаться_на_курс fieldRole() {
        SelenideElement field = $x("//label[text()='Должность/Роль']/ancestor::div[@class='el-col el-col-8 el-col-xs-24']//input");
        field.click();
        $x("//span[text()='Аналитик данных']").scrollTo().shouldBe(Condition.visible).click();
        return this;
    }

    protected Записаться_на_курс choseSize(Size size) {
        return this;
    }

    protected Записаться_на_курс choseSity(String область, String город) {
        return this;
    }




}

