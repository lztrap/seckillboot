package com.imooc.miaosha.controller.viewobject;

/**
 * @ClassName UserVO
 * Created by zghgchao 2019/3/7 13:34
 **/
public class UserVO {
    private Integer id;

    private String name;

    private Byte gender;

    private Integer age;

    private String telphone;


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

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
