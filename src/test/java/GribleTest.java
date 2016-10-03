import Pages.DataStorages;
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
        DataStorages ds = product.openDataStorages();
        String catName = "Product"+ System.currentTimeMillis();
        ds.addCategory(catName);

    }

}
