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

import java.util.Date;

/**
 * The Class Person.
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @version 1.0 Jan 26, 2013 2:42:00 PM
 */
public class Person{

    /** The name. */
    private String name;

    /** The date attr. */
    private Date   dateAttr;

    /**
     * 获得 name.
     *
     * @return the name
     */
    public String getName(){
        return name;
    }

    /**
     * 设置 name.
     *
     * @param name
     *            the name to set
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * 获得 date attr.
     *
     * @return the dateAttr
     */
    public Date getDateAttr(){
        return dateAttr;
    }

    /**
     * 设置 date attr.
     *
     * @param dateAttr
     *            the dateAttr to set
     */
    public void setDateAttr(Date dateAttr){
        this.dateAttr = dateAttr;
    }
}
