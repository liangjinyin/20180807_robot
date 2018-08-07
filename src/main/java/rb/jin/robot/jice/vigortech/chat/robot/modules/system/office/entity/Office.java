package rb.jin.robot.jice.vigortech.chat.robot.modules.system.office.entity;

import rb.jin.robot.jice.vigortech.chat.robot.common.model.BaseEntity;

import java.io.Serializable;
import java.util.List;

public class Office extends BaseEntity implements Serializable {
    /**
     * User: liangjinyin
     * Date: 2018-08-07
     * Time: 16:44
     */
    private Integer id;
    private String name;
    private String type;
    private Integer parent; // 父级编号
    private String parentIds; // 所有父级编号
    private Integer expand;//是否有下级菜单，1 有，0 没有


    public Office(){
        super();
    }

    public Office(Integer id) {
        super();
        this.id = id;
    }



    public  Office(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }



    private List<String> childDeptList;// 快速添加子部门


    public String getParentIds() {
        return parentIds;
    }



    public Integer getExpand() {
        return expand;
    }

    public void setExpand(Integer expand) {
        this.expand = expand;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getChildDeptList() {
        return childDeptList;
    }

    public void setChildDeptList(List<String> childDeptList) {
        this.childDeptList = childDeptList;
    }
}
