package Shop;

import java.util.Scanner;

public class ShowPage {
//    private int index;  // 선택한 메뉴번호 return 하기위함.
    Scanner sc;
    CustomerMenu customerMenu;

    public ShowPage() {
//        index = -1;
        sc = new Scanner(System.in);
        customerMenu = new CustomerMenu();
    }

    // getter --------------
//    public int getIndex() {
//        return index;
//    }
    // ---------------------
    // User Declare..
    public void showWelcomePage(){
        System.out.println("어서오세요");
        System.out.println("메롱");
        selectUser();
    };

    public void selectUser () {
        System.out.println("회원정보를 선택하세요.");
        System.out.println("1. 비회원");
        System.out.println("2. 회원");
        System.out.println("3. 관리자");
        int index = sc.nextInt();
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
        customerMenu.Run(index);
    }

    public void showManagerMenu () {

    }
}
