package Shop;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<String> productList;  // 상품 리스트

    public ProductList() {
        productList = new ArrayList<>();
    }

    // Getter and Setter ---------------------------
    public List<String> getProductList() {
        return productList;
    }
    public void setProductList(List<String> productList) {
        this.productList = productList;
    }
    // ---------------------------------------------

    public void Add(String name){
        productList.add(name);
    }
    public void registProduct (String name){
        productList.add(name);
    }
}
