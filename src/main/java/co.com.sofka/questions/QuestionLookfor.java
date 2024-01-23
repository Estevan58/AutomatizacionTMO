package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.ui.LookforUI.MANGA;

public class QuestionLookfor implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MANGA.resolveFor(actor).getText();
    }
    static public QuestionLookfor questionLookfor(){
        return new QuestionLookfor();
    }
}
