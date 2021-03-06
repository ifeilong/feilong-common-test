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
 * The Class Property.
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 1.7.3
 */
public class Property{

    /** The id. */
    private Long   id;

    /** The name. */
    private String name;

    /** The value. */
    private String value;

    /**
     * Instantiates a new property.
     *
     * @param id
     *            the id
     * @param name
     *            the name
     * @param value
     *            the value
     */
    public Property(Long id, String name, String value){
        super();
        this.id = id;
        this.name = name;
        this.value = value;
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
     * Gets the value.
     *
     * @return the value
     */
    public String getValue(){
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value
     *            the value to set
     */
    public void setValue(String value){
        this.value = value;
    }
}
