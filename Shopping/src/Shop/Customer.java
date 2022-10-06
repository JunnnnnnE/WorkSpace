package Shop;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String id;  // 회원아이디
    private String pw;  // 회원비밀번호
    private String name;    // 회원이름
    private String address; // 회원주소
    private String phoneNumber; // 회원 휴대폰번호
    private String email;   // 회원 이메일
    private List<String> wishList;  // 회원 장바구니 리스트
    private List<String> orderList; // 회원 주문리스트
    private int orderCount; // 회원 주문수량
    private int memNo;
    
    public Customer () {}
    public Customer (String id, String pw, String name, String address, String phone, String email) {
    	this.id = id;
    	this.pw = pw;
    	this.name = name;
    	this.address = address;
    	this.phoneNumber = phone;
    	this.email = email;
    	wishList = new ArrayList<String>();
    	orderList = new ArrayList<String>();
    	orderCount = 0;
    	memNo = -1;
    }

    // Getter and Setter ---------------------------
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getWishList() {
        return wishList;
    }
    public void setWishList(List<String> wishList) {
        this.wishList = wishList;
    }

    public List<String> getOrderList() {
        return orderList;
    }
    public void setOrderList(List<String> orderList) {
        this.orderList = orderList;
    }

    public int getOrderCount() {
        return orderCount;
    }
    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public int getMemNo() {
        return memNo;
    }
    public void setMemNo(int memNo) {
        this.memNo = memNo;
    }

    // ---------------------------------------------
}
