package Shop;

import java.util.List;

public class ManagerMenu {
    private List<String> menuList;  // 관리자 메뉴리스트
    private int select;             // 선택한 메뉴 인덱스번호

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

}
