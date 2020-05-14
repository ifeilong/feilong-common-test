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
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

    @Override
    public String toString(){
        return "User [id=" + id + ", name=" + name + ", age=" + age + ", ageInt=" + ageInt + ", password=" + password + ", loves="
                        + Arrays.toString(loves) + ", date=" + date + ", money=" + money + ", attrMap=" + attrMap + ", nickNames="
                        + Arrays.toString(nickNames) + ", userInfo=" + userInfo + ", userAddresses=" + Arrays.toString(userAddresses)
                        + ", userAddresseList=" + userAddresseList + "]";
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((age == null) ? 0 : age.hashCode());
        result = prime * result + ageInt;
        result = prime * result + ((attrMap == null) ? 0 : attrMap.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + Arrays.hashCode(loves);
        result = prime * result + ((money == null) ? 0 : money.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Arrays.hashCode(nickNames);
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((userAddresseList == null) ? 0 : userAddresseList.hashCode());
        result = prime * result + Arrays.hashCode(userAddresses);
        result = prime * result + ((userInfo == null) ? 0 : userInfo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (age == null){
            if (other.age != null)
                return false;
        }else if (!age.equals(other.age))
            return false;
        if (ageInt != other.ageInt)
            return false;
        if (attrMap == null){
            if (other.attrMap != null)
                return false;
        }else if (!attrMap.equals(other.attrMap))
            return false;
        if (date == null){
            if (other.date != null)
                return false;
        }else if (!date.equals(other.date))
            return false;
        if (id == null){
            if (other.id != null)
                return false;
        }else if (!id.equals(other.id))
            return false;
        if (!Arrays.equals(loves, other.loves))
            return false;
        if (money == null){
            if (other.money != null)
                return false;
        }else if (!money.equals(other.money))
            return false;
        if (name == null){
            if (other.name != null)
                return false;
        }else if (!name.equals(other.name))
            return false;
        if (!Arrays.equals(nickNames, other.nickNames))
            return false;
        if (password == null){
            if (other.password != null)
                return false;
        }else if (!password.equals(other.password))
            return false;
        if (userAddresseList == null){
            if (other.userAddresseList != null)
                return false;
        }else if (!userAddresseList.equals(other.userAddresseList))
            return false;
        if (!Arrays.equals(userAddresses, other.userAddresses))
            return false;
        if (userInfo == null){
            if (other.userInfo != null)
                return false;
        }else if (!userInfo.equals(other.userInfo))
            return false;
        return true;
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