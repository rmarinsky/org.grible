package Widgets;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$$;

public class Entity {

    private String name;

    public Entity(String name){
        this.name = name;
    }

    public void open(){
        $$(".table-cell").findBy(Condition.exactText(this.name)).click();
    }

}
