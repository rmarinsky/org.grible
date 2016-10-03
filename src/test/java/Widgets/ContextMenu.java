package Widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ContextMenu {

    private SelenideElement conMenu;

    public ContextMenu(SelenideElement element){
        this.conMenu = element;
    }

    public ContextMenu openContextMenu() {
        conMenu.contextClick();
        return this;
    }

    public void selectItem(String name) {
        $(byText(name)).click();
    }
}
