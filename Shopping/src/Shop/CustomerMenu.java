package Shop;

import java.util.ArrayList;
import java.util.List;

public class CustomerMenu {
    private List<String> menuList;  // 회원 메뉴리스트
    private int select;             // 선택한 메뉴 인덱스번호
    Customer customer;

    public CustomerMenu() {
    }
    // Getter and Setter ---------------------------
    public List<String> getMenuList() {
        return menuList;
    }
    public void setMenuList(List<String> menuList) {
        this.menuList = menuList;
    }

    public int getSelect() {
        return select;
    }
    public void setSelect(int select) {
        this.select = select;
    }
    // ---------------------------------------------
    // User Declare Function
    /*
        1. 상품목록 조회
        2. 상품 검색
        3. 로그인
        4. 아이디 찾기
        5. 비밀번호 찾기
        6. 장바구니
        7. 주문내역조회
    */
    public void Run (int index){
        switch (index){
            case 0 : showProductList(); break;
            case 1 : {
                String s = "";
                searchProduct(s);
            } break;
            case 2 : logIn(); break;
            case 3 : findId(); break;
            case 4 : findPw(); break;
            case 5 : showWishlist(); break;
            case 6 : showOrderlist(); break;
        }
    }

    public void showProductList() {
    	ProductList prodList = new ProductList();
    	List<String> list = new ArrayList<String>();
    	list = prodList.getProductList();
    	System.out.println(list);
    }

    public void searchProduct (String product){

    }

    public void logIn() {   // 로그인

    }
    public String findId() {    // 아이디 찾기
        String s = "";
        return s;
    }
    public String findPw() {    // 비밀번호 찾기
        String s = "";
        return s;
    }

    public List<String> showWishlist() {    // 장바구니 보기
        List<String> s = new ArrayList<>();
        s.add("dd");
        return s;
    }

    public List<String> showOrderlist() {   // 주문내역 보기
        List<String> s = new ArrayList<>();
        s.add("dd");
        return s;
    }
}
