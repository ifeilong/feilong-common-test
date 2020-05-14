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
package com.feilong.store.shoppingcart;

import java.io.Serializable;

/**
 * 店铺相关信息.
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 */
public class ShopSubViewCommand implements Serializable{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6821779119675014922L;

    /** 店铺的id. */
    private Long              id;

    /**
     * 店铺的名称
     */
    private String            name;

    /**
     * 店铺的code, 冗余,通常在购物车页面不会用这个值.
     */
    private String            code;

    /** 状态, . */
    private Integer           lifecycle;

    //---------------------------------------------------------------
    /**
     * Instantiates a new shop sub view command.
     */
    public ShopSubViewCommand(){
        super();
    }

    /**
     * Instantiates a new shop sub view command.
     *
     * @param id
     *            the id
     * @param name
     *            the name
     * @param code
     *            the code
     * @param lifecycle
     *            the lifecycle
     */
    public ShopSubViewCommand(Long id, String name, String code, Integer lifecycle){
        super();
        this.id = id;
        this.name = name;
        this.code = code;
        this.lifecycle = lifecycle;
    }

    //---------------------------------------------------------------

    /**
     * 获得 店铺的id.
     *
     * @return the id
     */
    public Long getId(){
        return id;
    }

    /**
     * 设置 店铺的id.
     *
     * @param id
     *            the id to set
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * 店铺的名称
     *
     * @return the name
     */
    public String getName(){
        return name;
    }

    /**
     * 店铺的名称
     *
     * @param name
     *            the name to set
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * 店铺的code,冗余,通常在购物车页面不会用这个值.
     * 
     * @return the code
     */
    public String getCode(){
        return code;
    }

    /**
     * 店铺的code,,冗余,通常在购物车页面不会用这个值.
     *
     * @param code
     *            the code to set
     */
    public void setCode(String code){
        this.code = code;
    }

    /**
     * 状态
     *
     * @return the lifecycle
     */
    public Integer getLifecycle(){
        return lifecycle;
    }

    /**
     * 状态
     *
     * @param lifecycle
     *            the lifecycle to set
     */
    public void setLifecycle(Integer lifecycle){
        this.lifecycle = lifecycle;
    }

    @Override
    public String toString(){
        return "ShopSubViewCommand [id=" + id + ", name=" + name + ", code=" + code + ", lifecycle=" + lifecycle + "]";
    }

}
