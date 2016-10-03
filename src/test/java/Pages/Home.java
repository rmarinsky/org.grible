package Pages;

import Widgets.ConfirmationDialog;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Home {

    public void open() {
        Selenide.open("");
    }

    public void addProduct(String name){
        $("#btn-add-product").click();
        $(".product-name").setValue(name);
        $(".product-path").setValue(name);
        $("#dialog-btn-add-product").click();
        new ConfirmationDialog().createDirectory();
    }

    public Product openProduct(String name) {
        $(byText(name)).click();
        return new Product();
    }
}
