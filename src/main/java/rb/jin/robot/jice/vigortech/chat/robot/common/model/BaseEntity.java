package rb.jin.robot.jice.vigortech.chat.robot.common.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;
import rb.jin.robot.jice.vigortech.chat.robot.common.utils.DateUtils;
import rb.jin.robot.jice.vigortech.chat.robot.modules.system.user.entity.User;

import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable{
    /**
     * User: liangjinyin
     * Date: 2018-08-07
     * Time: 15:15
     */
    protected User createBy; // 创建者

    protected Date createDate; // 创建日期

    protected Date updateDate; // 更新日期

    protected String delFlag; // 删除标记（0：正常；1：删除；2：审核）

    protected String createDateString;

    protected String updateDateString;

    /**
     * 获取创建时间字符串
     *
     * @return yyyy-MM-dd HH:mm:ss
     */
    public String getCreateDateString() {
        if (createDate == null) {
            createDate = new Date();
        }
        return DateUtils.formatDateTime(createDate);
    }

    /**
     * 获取修改时间字符串
     *
     * @return yyyy-MM-dd HH:mm:ss
     */
    public String getUpdateDateString() {
        if (updateDate == null) {
            updateDate = new Date();
        }
        return DateUtils.formatDateTime(updateDate);
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


    public User getCreateBy() {
        return createBy;
    }

    public void setCreateBy(User createBy) {
        //TODO user = securityUtil.getUSer
        this.createBy = createBy;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @JsonIgnore
    @Length(min = 1, max = 1)
    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
