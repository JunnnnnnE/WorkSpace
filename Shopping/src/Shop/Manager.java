package Shop;

public class Manager {
	public final static int MAX_MEMBER_NUM = 1000;
	
    private String id;  // 관리자 아이디
    private String pw;  // 관리자 비밀번호
    private Customer member[];
    private int numMember;

    public Manager () {
    	member = new Customer[MAX_MEMBER_NUM];
    	member[0] = new Customer("id1", "pw1", "name1", "addr1", "01012341234", "email1");
    	member[1] = new Customer("id2", "pw2", "name2", "addr2", "01012341234", "email2");
    	member[2] = new Customer("id3", "pw3", "name3", "addr3", "01012341234", "email3");
    	numMember = 3;
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
    // ---------------------------------------------
    
    public void addMember (Customer cus) {
    	if (numMember > MAX_MEMBER_NUM) return;
    	member[numMember] = cus;
    	member[numMember].setMemNo(numMember);    // 멤버번호로 관리하기위해 멤버생성시 번호자동부여.
    	numMember++;
    }
    
    public int checkMemberlist(String id, String pw) {
    	int memNo = -1;
    	for (int i=0; i<numMember; i++) {
    		if (member[i].getId().equals(id) &&	member[i].getPw().equals(pw)) { // id 와 비밀번호 일치하는지 확인.
    			memNo = i;    			
    		}
    	}
    	return memNo;
    }
    
    public String getMemberName(int no) {
    	return member[no].getName();    	
    } 
}
