package Widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ConfirmationDialog {

    private SelenideElement widget = $("#noty_top_layout_container");

    public void createDirectory(){
        widget.$(".btn-primary").click();
    }

}
