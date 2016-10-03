package Pages;

import Widgets.ContextMenu;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Storages {

    public void addCategory(String userName){
        $(".icon-button-text").click();
        $(".category-name").setValue(userName);
        $("#dialog-btn-add-category").click();
    }

    public void addStorage(String category, String storage){
        new ContextMenu($$(".category-item").findBy(Condition.exactText(category))).
            openContextMenu().selectItem("Add storage");
        $(".data-item-name").setValue(storage);
        $(".data-storage-class-name").setValue(storage);
        $("#dialog-btn-add-data-item").click();
    }

}
