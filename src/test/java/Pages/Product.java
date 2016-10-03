package Pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Product {

    public Storages openDataStorages(){
        $(byText("Data Storages")).click();
        return new Storages();
    }

}
