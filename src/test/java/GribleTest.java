import Pages.Storages;
import Pages.Home;
import Pages.Product;
import org.junit.Test;

public class GribleTest {

    @Test
    public void firstTest(){
        Home home = new Home();
        home.open();
        String prodName = "Product"+ System.currentTimeMillis();
        home.addProduct(prodName);

        Product product = home.openProduct(prodName);
        Storages storages = product.openDataStorages();

        String catName = "Product"+ System.currentTimeMillis();
        storages.addCategory(catName);
        storages.addStorage(catName, catName+"stor");

    }

}
