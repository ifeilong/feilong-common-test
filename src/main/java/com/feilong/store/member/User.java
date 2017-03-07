/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.store.member;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class User.
 * 
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @version 1.0 2011-11-28 下午03:05:56
 */
public class User implements Comparable<User>{

    /** The id. */
    private Long                id               = 0L;

    /** The name. */
    private String              name             = "feilong";

    /** 年龄. */
    private Integer             age;

    /** 年龄int. */
    private int                 ageInt;

    /** The password. */
    private String              password;

    /** The loves. */
    private String[]            loves;

    /** The date. */
    private Date                date;

    /** The money. */
    private BigDecimal          money;

    /** 动态属性map. */
    private Map<String, String> attrMap;

    /** 昵称. */
    private String[]            nickNames;

    /** The user info. */
    private UserInfo            userInfo         = new UserInfo();

    /** The user addresses. */
    private UserAddress[]       userAddresses;

    /** The user addresse list. */
    private List<UserAddress>   userAddresseList = new ArrayList<>();

    /**
     * Instantiates a new user.
     */
    public User(){
        super();
    }

    /**
     * @param id
     * @param name
     */
    public User(Long id, String name){
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * The Constructor.
     *
     * @param name
     *            the name
     */
    public User(String name){
        super();
        this.name = name;
    }

    /**
     * The Constructor.
     *
     * @param name
     *            the name
     * @param age
     *            the age
     */
    public User(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    /**
     * The Constructor.
     *
     * @param id
     *            the id
     * @param age
     *            the age
     */
    public User(Long id, Integer age){
        this.id = id;
        this.age = age;
    }

    /**
     * Instantiates a new user.
     * 
     * @param id
     *            the id
     */
    public User(Long id){
        super();
        this.id = id;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName(){
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param name
     *            the name to set
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public Long getId(){
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the id to set
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Gets the loves.
     * 
     * @return the loves
     */
    public String[] getLoves(){
        return loves;
    }

    /**
     * Sets the loves.
     * 
     * @param loves
     *            the loves to set
     */
    public void setLoves(String[] loves){
        this.loves = loves;
    }

    /**
     * Gets the user info.
     * 
     * @return the userInfo
     */
    public UserInfo getUserInfo(){
        return userInfo;
    }

    /**
     * Sets the user info.
     * 
     * @param userInfo
     *            the userInfo to set
     */
    public void setUserInfo(UserInfo userInfo){
        this.userInfo = userInfo;
    }

    /**
     * Gets the date.
     * 
     * @return the date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets the date.
     * 
     * @param date
     *            the date to set
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Gets the money.
     * 
     * @return the money
     */
    public BigDecimal getMoney(){
        return money;
    }

    /**
     * Sets the money.
     * 
     * @param money
     *            the money to set
     */
    public void setMoney(BigDecimal money){
        this.money = money;
    }

    /**
     * Gets the user addresses.
     * 
     * @return the userAddresses
     */
    public UserAddress[] getUserAddresses(){
        return userAddresses;
    }

    /**
     * Sets the user addresses.
     * 
     * @param userAddresses
     *            the userAddresses to set
     */
    public void setUserAddresses(UserAddress[] userAddresses){
        this.userAddresses = userAddresses;
    }

    /**
     * Gets the user addresse list.
     * 
     * @return the userAddresseList
     */
    public List<UserAddress> getUserAddresseList(){
        return userAddresseList;
    }

    /**
     * Sets the user addresse list.
     * 
     * @param userAddresseList
     *            the userAddresseList to set
     */
    public void setUserAddresseList(List<UserAddress> userAddresseList){
        this.userAddresseList = userAddresseList;
    }

    /**
     * Gets the attr map.
     * 
     * @return the attrMap
     */
    public Map<String, String> getAttrMap(){
        return attrMap;
    }

    /**
     * 设置 attr map.
     * 
     * @param attrMap
     *            the attrMap to set
     */
    public void setAttrMap(Map<String, String> attrMap){
        this.attrMap = attrMap;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString(){
        //不要使用 MULTI_LINE_STYLE
        //see https://github.com/venusdrogon/feilong-core/issues/204
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj){
        return EqualsBuilder.reflectionEquals(this, obj, "id");
    }

    /**
     * 获得 年龄.
     *
     * @return the age
     */
    public Integer getAge(){
        return age;
    }

    /**
     * 设置 年龄.
     *
     * @param age
     *            the age to set
     */
    public void setAge(Integer age){
        this.age = age;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(User o){
        return 0;
    }

    /**
     * 获得 password.
     *
     * @return the password
     */
    public String getPassword(){
        return password;
    }

    /**
     * 设置 password.
     *
     * @param password
     *            the password to set
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * 获得 昵称.
     *
     * @return the nickNames
     */
    public String[] getNickNames(){
        return nickNames;
    }

    /**
     * 设置 昵称.
     *
     * @param nickNames
     *            the nickNames to set
     */
    public void setNickNames(String[] nickNames){
        this.nickNames = nickNames;
    }

    /**
     * 获得 年龄int.
     *
     * @return the ageInt
     */
    public int getAgeInt(){
        return ageInt;
    }

    /**
     * 设置 年龄int.
     *
     * @param ageInt
     *            the ageInt to set
     */
    public void setAgeInt(int ageInt){
        this.ageInt = ageInt;
    }
}