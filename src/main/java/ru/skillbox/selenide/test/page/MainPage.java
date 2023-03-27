package ru.skillbox.selenide.test.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Component
public class MainPage {

    private static final String URL = "https://lm.skillbox.ru/qa_tester/module01/";

    public MainPage openPage() {
        open(URL);
        return this;
    }

    public MainPage inputName(String name) {
        $(By.className("custom-form__field")).setValue(name);
        return this;
    }

    public MainPage clickButton() {
        $(By.xpath("//button[@type='submit']")).click();
        return this;
    }

    public SelenideElement getGreeting() {
        return $(By.xpath("//p[@class='start-screen__res container']"));
    }
}
