package rb.jin.robot.jice.vigortech.chat.robot.modules.system.user.entity;

import rb.jin.robot.jice.vigortech.chat.robot.common.model.BaseEntity;
import rb.jin.robot.jice.vigortech.chat.robot.modules.system.role.entiry.Role;

import java.io.Serializable;
import java.util.List;

public class User extends BaseEntity implements Serializable{
    /**
     * User: liangjinyin
     * Date: 2018-08-07
     * Time: 15:27
     */
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String email;
    /**
     * 用户的类型，，，移动端 或是公司内部 PC端
     */
    private String type;
    private String role;
    private List<Role> roleList;
    private Integer companyid;
    private Integer officeid;

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getOfficeid() {
        return officeid;
    }

    public void setOfficeid(Integer officeid) {
        this.officeid = officeid;
    }

    public List<Role> getRoleList(Integer id) {

        return roleList==null?SecurityUtils.getRoleListByUser(id):roleList;
        //return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
