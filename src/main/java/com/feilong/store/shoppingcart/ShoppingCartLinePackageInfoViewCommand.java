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
import java.math.BigDecimal;

/**
 * 包装信息.
 *
 */
public class ShoppingCartLinePackageInfoViewCommand implements Serializable{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3775036727184726521L;

    /** 对应的关联关系id. */
    private Long              shoppingCartLinePackageInfoId;

    /** 对应的包装信息id. */
    private Long              packageInfoId;

    /** 购物车行id. */
    private Long              shoppingCartLineId;

    //*****************************************************************

    /**
     * 包装类型：SCM定义的列表中选取.
     * 
     * <p>
     * reebok的特殊处理是要基于到商品行级别的，
     * </p>
     * 
     * <ul>
     * <li>specialType (1：需特殊处理核对 2：包裹填充物）（传1 如果reebok需要特殊处理）；</li>
     * <li>isSpecialPackaging（是否特殊包装（0：否 1：是））（传0 对于reebok）;</li>
     * <li>OrderLineGift（ type 50：特殊商品印刷 如果reebok需要特殊商品印刷 ;memo: recipeid）</li>
     * </ul>
     */
    private Integer           type;

    /**
     * 包装金额(不用纠结名字,和接口统一).
     *
     * @since 5.3.2.11
     */
    private BigDecimal        total;

    /**
     * 包装特征信息(可有可无).
     * 
     * <blockquote>
     * <p>
     * 和 type 字段一起起到辨识以及拆分订单行的作用,相同的 type 但是不同的featureInfo 那么会渲染成两行数据
     * </p>
     * 
     * <p>
     * 比如 reebok 有recipeid .
     * </p>
     * </blockquote>
     */
    private String            featureInfo;

    /**
     * 扩展信息 (JSON字符串格式).
     * 
     * <p>
     * 通常这个字段仅仅用于解析渲染
     * </p>
     * 
     * <p>
     * 对于 reebok而言,传递的是定制商品的信息, 比如 左脚写的xin 右脚文字 jin,格式每个store 可能都不一样,只要确保可以解析即可
     * </p>
     */
    private String            extendInfo;

    //******************************************************************************************
    /**
     * 获得 包装类型：SCM定义的列表中选取.
     * *
     * <p>
     * reebok的特殊处理是要基于到商品行级别的，
     * </p>
     * 
     * <ul>
     * <li>specialType (1：需特殊处理核对 2：包裹填充物）（传1 如果reebok需要特殊处理）；</li>
     * <li>isSpecialPackaging（是否特殊包装（0：否 1：是））（传0 对于reebok）;</li>
     * <li>OrderLineGift（ type 50：特殊商品印刷 如果reebok需要特殊商品印刷 ;memo: recipeid）</li>
     * </ul>
     * 
     * @return the type
     */
    public Integer getType(){
        return type;
    }

    /**
     * 设置 包装类型：SCM定义的列表中选取.
     * <p>
     * reebok的特殊处理是要基于到商品行级别的，
     * </p>
     * 
     * <ul>
     * <li>specialType (1：需特殊处理核对 2：包裹填充物）（传1 如果reebok需要特殊处理）；</li>
     * <li>isSpecialPackaging（是否特殊包装（0：否 1：是））（传0 对于reebok）;</li>
     * <li>OrderLineGift（ type 50：特殊商品印刷 如果reebok需要特殊商品印刷 ;memo: recipeid）</li>
     * </ul>
     * 
     * @param type
     *            the type to set
     */
    public void setType(Integer type){
        this.type = type;
    }

    /**
     * 获得 包装金额(不用纠结名字,和接口统一).
     *
     * @return the total
     */
    public BigDecimal getTotal(){
        return total;
    }

    /**
     * 设置 包装金额(不用纠结名字,和接口统一).
     *
     * @param total
     *            the total to set
     */
    public void setTotal(BigDecimal total){
        this.total = total;
    }

    /**
     * 获得 包装特征信息(可有可无).
     * 
     * <blockquote>
     * <p>
     * 和 type 字段一起起到辨识以及拆分订单行的作用,相同的 type 但是不同的featureInfo 那么会渲染成两行数据
     * </p>
     * 
     * <p>
     * 比如 reebok 有recipeid .
     * </p>
     * </blockquote>
     * 
     * @return the featureInfo
     */
    public String getFeatureInfo(){
        return featureInfo;
    }

    /**
     * 设置 包装特征信息(可有可无).
     * 
     * <blockquote>
     * <p>
     * 和 type 字段一起起到辨识以及拆分订单行的作用,相同的 type 但是不同的featureInfo 那么会渲染成两行数据
     * </p>
     * 
     * <p>
     * 比如 reebok 有recipeid .
     * </p>
     * </blockquote>
     * 
     * @param featureInfo
     *            the featureInfo to set
     */
    public void setFeatureInfo(String featureInfo){
        this.featureInfo = featureInfo;
    }

    /**
     * 获得 扩展信息 (JSON字符串格式).
     * 
     * <p>
     * 通常这个字段仅仅用于解析渲染
     * </p>
     * 
     * <p>
     * 对于 reebok而言,传递的是定制商品的信息, 比如 左脚写的xin 右脚文字 jin,格式每个store 可能都不一样,只要确保可以解析即可
     * </p>
     * 
     * @return the extendInfo
     */
    public String getExtendInfo(){
        return extendInfo;
    }

    /**
     * 设置 扩展信息 (JSON字符串格式).
     * 
     * <p>
     * 通常这个字段仅仅用于解析渲染
     * </p>
     * 
     * <p>
     * 对于 reebok而言,传递的是定制商品的信息, 比如 左脚写的xin 右脚文字 jin,格式每个store 可能都不一样,只要确保可以解析即可
     * </p>
     * 
     * @param extendInfo
     *            the extendInfo to set
     */
    public void setExtendInfo(String extendInfo){
        this.extendInfo = extendInfo;
    }

    /**
     * 获得 对应的包装信息id.
     *
     * @return the packageInfoId
     */
    public Long getPackageInfoId(){
        return packageInfoId;
    }

    /**
     * 设置 对应的包装信息id.
     *
     * @param packageInfoId
     *            the packageInfoId to set
     */
    public void setPackageInfoId(Long packageInfoId){
        this.packageInfoId = packageInfoId;
    }

    /**
     * 获得 购物车行id.
     *
     * @return the shoppingCartLineId
     */
    public Long getShoppingCartLineId(){
        return shoppingCartLineId;
    }

    /**
     * 设置 购物车行id.
     *
     * @param shoppingCartLineId
     *            the shoppingCartLineId to set
     */
    public void setShoppingCartLineId(Long shoppingCartLineId){
        this.shoppingCartLineId = shoppingCartLineId;
    }

    /**
     * 获得 对应的关联关系id.
     *
     * @return the shoppingCartLinePackageInfoId
     */
    public Long getShoppingCartLinePackageInfoId(){
        return shoppingCartLinePackageInfoId;
    }

    /**
     * 设置 对应的关联关系id.
     *
     * @param shoppingCartLinePackageInfoId
     *            the shoppingCartLinePackageInfoId to set
     */
    public void setShoppingCartLinePackageInfoId(Long shoppingCartLinePackageInfoId){
        this.shoppingCartLinePackageInfoId = shoppingCartLinePackageInfoId;
    }
}
