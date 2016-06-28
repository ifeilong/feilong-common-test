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
package com.feilong.store.order;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 1.7.2
 */
public class OrderLine implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long              id;

    //**************************************************

    /** 订单id. */
    private Long              orderId;

    /** sku表中的id. */
    private Long              skuId;

    /** 商品数量. */
    private Integer           count;

    //**************************************************
    private Long              itemId;

    //**************************************************

    /** 原销售单价,吊牌价. */
    private BigDecimal        MSRP;

    /** 现销售单价. */
    private BigDecimal        salePrice;

    /** 行小计 行小计=现销售单价X数量-折扣. */
    private BigDecimal        subtotal;

    /** 折扣-包含整单优惠分摊. */
    private BigDecimal        discount;

    /** 折扣单价-不包含整单优惠分摊. */
    private BigDecimal        discountPrice;

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
     * @return the orderId
     */
    public Long getOrderId(){
        return orderId;
    }

    /**
     * @param orderId
     *            the orderId to set
     */
    public void setOrderId(Long orderId){
        this.orderId = orderId;
    }

    /**
     * @return the skuId
     */
    public Long getSkuId(){
        return skuId;
    }

    /**
     * @param skuId
     *            the skuId to set
     */
    public void setSkuId(Long skuId){
        this.skuId = skuId;
    }

    /**
     * @return the count
     */
    public Integer getCount(){
        return count;
    }

    /**
     * @param count
     *            the count to set
     */
    public void setCount(Integer count){
        this.count = count;
    }

    /**
     * @return the itemId
     */
    public Long getItemId(){
        return itemId;
    }

    /**
     * @param itemId
     *            the itemId to set
     */
    public void setItemId(Long itemId){
        this.itemId = itemId;
    }

    /**
     * @return the mSRP
     */
    public BigDecimal getMSRP(){
        return MSRP;
    }

    /**
     * @param mSRP
     *            the mSRP to set
     */
    public void setMSRP(BigDecimal mSRP){
        MSRP = mSRP;
    }

    /**
     * @return the salePrice
     */
    public BigDecimal getSalePrice(){
        return salePrice;
    }

    /**
     * @param salePrice
     *            the salePrice to set
     */
    public void setSalePrice(BigDecimal salePrice){
        this.salePrice = salePrice;
    }

    /**
     * @return the subtotal
     */
    public BigDecimal getSubtotal(){
        return subtotal;
    }

    /**
     * @param subtotal
     *            the subtotal to set
     */
    public void setSubtotal(BigDecimal subtotal){
        this.subtotal = subtotal;
    }

    /**
     * @return the discount
     */
    public BigDecimal getDiscount(){
        return discount;
    }

    /**
     * @param discount
     *            the discount to set
     */
    public void setDiscount(BigDecimal discount){
        this.discount = discount;
    }

    /**
     * @return the discountPrice
     */
    public BigDecimal getDiscountPrice(){
        return discountPrice;
    }

    /**
     * @param discountPrice
     *            the discountPrice to set
     */
    public void setDiscountPrice(BigDecimal discountPrice){
        this.discountPrice = discountPrice;
    }

}
