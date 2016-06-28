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

/**
 * 
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 1.7.3
 */
public class Property{

    private Long   id;

    private String name;

    private String value;

    /**
     * @param id
     * @param name
     * @param value
     */
    public Property(Long id, String name, String value){
        super();
        this.id = id;
        this.name = name;
        this.value = value;
    }

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
     * @return the value
     */
    public String getValue(){
        return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(String value){
        this.value = value;
    }
}
