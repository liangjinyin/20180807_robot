package rb.jin.robot.jice.vigortech.chat.robot.modules.system.role.entiry;

import org.assertj.core.util.Lists;
import rb.jin.robot.jice.vigortech.chat.robot.common.model.BaseEntity;
import rb.jin.robot.jice.vigortech.chat.robot.modules.system.menu.entity.Menu;
import rb.jin.robot.jice.vigortech.chat.robot.modules.system.office.entity.Office;

import java.io.Serializable;
import java.util.List;

public class Role extends BaseEntity implements Serializable {
    /**
     * User: liangjinyin
     * Date: 2018-08-07
     * Time: 15:33
     */
    private Integer id;
    private String enName;//英文名称
    private String name;
    private String dataScope;//数据范围dateScope
    private List<Menu> menuList = Lists.newArrayList(); // 拥有菜单列表
    private List<Office> officeList = Lists.newArrayList(); // 按明细设置数据范围


    public Role(){
        super();
    }

    public Role(Integer id, String enName, String name, String dataScope) {
        super();
        this.id = id;
        this.enName = enName;
        this.name = name;
        this.dataScope = dataScope;
    }

    // 数据范围（1：所有数据；2：所在公司数据；3：所在部门数据；5：仅本人数据；9：按明细设置）
    public static final String DATA_SCOPE_ALL = "1";
    public static final String DATA_SCOPE_COMPANY = "2";
    public static final String DATA_SCOPE_OFFICE = "3";
    public static final String DATA_SCOPE_SELF = "5";
    public static final String DATA_SCOPE_CUSTOM = "9";


    public Role(Integer id){
        this.id = id;
    }



    public String getEnName() {
        return enName;
    }



    public void setEnName(String enName) {
        this.enName = enName;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getDataScope() {
        return dataScope;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope==null?Role.DATA_SCOPE_SELF:dataScope;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public List<Office> getOfficeList() {
        return officeList;
    }

    public void setOfficeList(List<Office> officeList) {
        this.officeList = officeList;
    }
}
