package Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowPage {
    Scanner sc;
    NomemberMenu nomemberMenu;
    CustomerMenu customerMenu;
    Manager manager;
    ProductList productlist;

    public ShowPage() {
        sc = new Scanner(System.in);
        nomemberMenu = new NomemberMenu();
        customerMenu = new CustomerMenu();
        manager = new Manager();
        productlist = new ProductList();
    }

    // User Declare..
    public void showWelcomePage(){
        System.out.println("**************************");
        System.out.println();
        System.out.println("어서오세요 온라인 과일가게입니다.");
        System.out.println("신선한 과일을 집에서 주문하세요!");
        System.out.println();
        System.out.println("**************************");
        selectUser();
    };

    public void selectUser () {
        System.out.println("회원정보를 선택하세요.");
        System.out.println("1. 비회원");
        System.out.println("2. 회원");
        System.out.println("3. 관리자");
        int index = sc.nextInt() - 1;
        switch(index) {
            case 0 : showNomemberMenu(); break;
            case 1 : showmemberMenu();   break;
            case 2 : showManagerMenu();  break;
            default: break;
        }
    }
    public void showNomemberMenu () {
        System.out.println("비회원 페이지입니다.");
        System.out.println("원하는 메뉴를 선택해주세요.");
        System.out.println("1. 상품목록 조회");
        System.out.println("2. 상품 검색");
        System.out.println("3. 회원가입");
        int index = sc.nextInt();
        
        switch(index) {
        	case 1: showProductList(); break;
        	case 2: findProduct(); break;
        	case 3: showRegistPage(); break;
        	default : break;
        }
    }
    
    public void showProductList() {		// 상품목록 조회
    	List<String> list = new ArrayList<String>();
    	list = productlist.getProductList();
    	System.out.println("** 현재 구매가능한 전체상품 리스트입니다 **");
    	System.out.println(list);
    }
    
    public void findProduct () {
    	System.out.println("상품 검색 페이지입니다.");
    	System.out.println("찾으시는 상품명을 입력해주세요.");
    	String name = sc.next();
    	
    	if (productlist.findProduct(name) != null) {
    		Product product = new Product();
    		product = productlist.findProduct(name);
    		System.out.println("상품명 : " + product.getName());
    		System.out.println("가격 : " + product.getPrice());
    		System.out.println("구매가능수량 : " + product.getStock());
    	} 
    	else {
    		System.out.println("찾으시는 상품이 존재하지 않습니다.");
    	}
    }
    
    public void showRegistPage () {		// 회원가입
    	System.out.println("회원가입 페이지 입니다.");
    	System.out.print("아이디 : ");
    	String id = sc.next();
    	System.out.print("비밀번호 : ");
    	String pw = sc.next();
    	System.out.print("이름 : ");
    	String name = sc.next();
    	System.out.print("주소 : ");
    	String address = sc.next();
    	System.out.print("휴대폰번호 : ");
    	String phone = sc.next();
    	System.out.print("이메일 : ");
    	String email = sc.next();
    	Customer cus = new Customer(id, pw, name, address, phone, email);
    	
    	System.out.println("id : " + id);
    	System.out.println("pw : " + pw);
    	System.out.println("name : " + name);
    	System.out.println("address : " + address);
    	System.out.println("phone : " + phone);
    	System.out.println("email : " + email);
    	System.out.print("입력한 정보로 가입하시겠습니까? (y/n)");
    	String s = sc.next();
    	
    	if (s.toUpperCase().equals("Y")) {
    		manager.addMember(cus);
    		System.out.println("가입이 완료되었습니다.");
    	} else {
    		System.out.println("가입을 취소합니다.");
    	}
    }
    
    
    public void showmemberMenu () {
        System.out.println("회원 페이지입니다.");
        System.out.println("원하는 메뉴를 선택해주세요.");
        System.out.println("1. 상품목록 조회");
        System.out.println("2. 상품 검색");
        System.out.println("3. 로그인");
        System.out.println("4. 아이디 찾기");
        System.out.println("5. 비밀번호 찾기");
        System.out.println("6. 장바구니");
        System.out.println("7. 주문내역조회");
        int index = sc.nextInt();

        switch (index){
	    	case 1: showProductList(); break;
	    	case 2: findProduct(); break;
//            case 3 : logIn(); break;
//            case 4 : findId(); break;
//            case 5 : findPw(); break;
//            case 6 : showWishlist(); break;
//            case 7 : showOrderlist(); break;
        }
    }
    
    public void logIn (){
    	System.out.println("로그인 페이지 입니다.");
    	System.out.print("회원 id :");
    	String id = sc.next();
    	System.out.print("회원 pw :");
    	String pw = sc.next();
    	
    	int memNo = manager.checkMemberlist(id, pw);	// id / pw 비정상일경우 -1, 정상일경우 memNo return 하는함수
    	if (memNo != -1) {
    		System.out.println(manager.getMemberName(memNo) + " 님 환영합니다.");
    	} else {
    		System.out.println("아이디 또는 비밀번호가 올바르지 않거나, 등록되지 않은 정보입니다.");
    	}
    	
    }

    public void showManagerMenu () {

    }
}
