package Pages;

import static com.codeborne.selenide.Selenide.$;

public class DataStorages {

    public void addCategory(String userName){
        $(".icon-button-text").click();
        $(".category-name").setValue(userName);
    }

}
