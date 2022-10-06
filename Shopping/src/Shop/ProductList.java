package Shop;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
	public final static int MAX_PRODUCT_NUM = 100;
	
    private List<String> list;  // 상품 리스트
    private Product[] product;

    public ProductList() {
    	product = new Product[MAX_PRODUCT_NUM];
    	list = new ArrayList<String>();
    	Add("딸기", 1000, 10);
    	Add("수박", 2000, 10);
    	Add("참외", 500, 10);
    }

    // Getter and Setter ---------------------------
    public List<String> getProductList() {	// 상품목록 조회
        return list;
    }
    // ---------------------------------------------
    
    public void Add(String name, int price, int stock){
    	product[list.size()] = new Product(name, price, stock);
    	list.add(name);
    }
    
    public Product findProduct(String name) {
    	for (int i=0; i<list.size(); i++) {
    		if (product[i].getName().equals(name)) return product[i];
    	}
    	return null;
    	
    }
}
