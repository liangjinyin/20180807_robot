package rb.jin.robot.jice.vigortech.chat.robot.modules.system.menu.entity;

import rb.jin.robot.jice.vigortech.chat.robot.common.model.BaseEntity;

import java.io.Serializable;
import java.util.List;

public class Menu extends BaseEntity implements Serializable {
    /**
     * User: liangjinyin
     * Date: 2018-08-07
     * Time: 16:44
     */
    private String id;
    private String name;
    private int checked = 0;
    private boolean hasSubMenus = false;
    private List<Menu> subMenus;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getChecked() {
        return checked;
    }
    public void setChecked(int checked) {
        this.checked = checked;
    }
    public boolean isHasSubMenus() {
        return hasSubMenus;
    }
    public void setHasSubMenus(boolean hasSubMenus) {
        this.hasSubMenus = hasSubMenus;
    }
    public List<Menu> getSubMenus() {
        return subMenus;
    }
    public void setSubMenus(List<Menu> subMenus) {
        this.subMenus = subMenus;
    }
}
