package Shop;

public class Product {
    private String name;    // 상품명
    private int price;  // 상품가격
    private int stock;  // 재고

    public Product () {
    	
    }
    
    public Product (String name, int price, int stock) {	// 생성자
    	this.name  = name;
    	this.price = price;
    	this.stock = stock;
    }
    
    // Getter and Setter ---------------------------
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    // ---------------------------------------------
}
