package Shop;

import java.util.ArrayList;
import java.util.List;

public class ManageProduct {
    ProductList productlist;

    public ManageProduct() {
        productlist = new ProductList();
    }

    public List showProductList(){
        List<String> list = new ArrayList<>();
        list = productlist.getProductList();
        return list;
    }

    public void registProduct (String name){
        productlist.Add(name);
    }
}
