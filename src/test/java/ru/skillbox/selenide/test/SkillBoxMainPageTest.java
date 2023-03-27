package ru.skillbox.selenide.test;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.skillbox.selenide.test.page.MainPage;

import static com.codeborne.selenide.Condition.text;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SkillBoxMainPageTest {

    @Autowired
    private MainPage mainPage;

    @Test
    void testGreetingUser() {

        SelenideElement greeting = mainPage.openPage()
            .inputName("Вася")
            .clickButton()
            .getGreeting();

        greeting.shouldHave(text("Привет, Вася!"));

    }

}
