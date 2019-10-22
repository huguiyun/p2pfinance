package com.p2p.sys.utils.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2019-10-22 12:23:55
 */
public class User implements Serializable {
    private static final long serialVersionUID = -95665637172395216L;
    //用户ID,主键
    private Integer userId;
    //用户账号
    private String userName;
    //用户密码=MD5+盐加密
    private String password;
    //盐
    private String salt;
    //创建日期
    private Date createdate;
    //用户标识: 0 不可用 1 可用
    private Integer userFlag;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(Integer userFlag) {
        this.userFlag = userFlag;
    }

}