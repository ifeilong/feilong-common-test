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
package com.feilong.store.item;

import java.util.List;

/**
 * 
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 1.7.3
 */
public class Item{

    private Long           id;

    private String         name;

    private List<Property> propertyList;

    /**
     * @return the id
     */
    public Long getId(){
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName(){
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * @return the propertyList
     */
    public List<Property> getPropertyList(){
        return propertyList;
    }

    /**
     * @param propertyList
     *            the propertyList to set
     */
    public void setPropertyList(List<Property> propertyList){
        this.propertyList = propertyList;
    }

}
