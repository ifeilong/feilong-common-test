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

import static java.math.BigDecimal.ZERO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 购物车里面的每行明细.
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 */
public class ShoppingCartLineSubViewCommand implements Serializable{

    /** The Constant serialVersionUID. */
    private static final long                            serialVersionUID = -7646174960209578056L;

    /**
     * 购物车行的唯一标识,如果是会员购物车, 如果是游客的购物车,那么自己算出id,以便对这个id进行删除/修改.
     */
    private Long                                         id;

    /** 状态. */
    private Status                                       status;

    //---------------------------------------------------------------

    /** 添加时间,此处的时间通常用于页面购物车行的排序,仅此而已. */
    private Date                                         addTime;

    /**
     * 哪一个组,以往相同sku添加到购物车,那么购物车是一行记录,数量是2;
     * <p>
     * 但是我们要实现,两行记录,每行的数量是1, 因为可能其中的一个sku是bundle里面的,另外一个不是
     * </p>
     * 此处主要是为了区分按组显示.
     */
    private Integer                                      group;

    //---------------------------------------------------------------

    /** 买的什么商品id. */
    private Long                                         itemId;

    /** 买的什么商品code. */
    private String                                       itemCode;

    /** 商品名称是什么. */
    private String                                       itemName;

    /** 买的哪个sku. */
    private Long                                         skuId;

    /** 外部编码 是扣减库存以及和后端对接数据的核心参数. */
    private String                                       extentionCode;

    /** 数量几个. */
    private Integer                                      quantity;

    /**
     * 库存数量.
     * 
     */
    private Integer                                      stock;

    //**************************************************************

    /** 商品图片. */
    private String                                       itemPic;

    //---------------------------------------------------------------

    /**
     * 是否选中,主要用来渲染view里面的checkbox checked状态.
     * 
     */
    private boolean                                      checked;

    /**
     * 是否是赠品.
     * 
     */
    private boolean                                      isGift;

    //------------------------价格信息---------------------------------------

    /** 销售价. */
    private BigDecimal                                   salePrice;

    /** 吊牌价(原单价). */
    private BigDecimal                                   listPrice;

    /** 购物车行 金额小计 *. */
    private BigDecimal                                   subTotalAmt      = ZERO;

    //---------------------------------------------------------------

    /**
     * 对应的包装信息.
     * 
     * @since 5.3.2.13
     */
    private List<ShoppingCartLinePackageInfoViewCommand> shoppingCartLinePackageInfoViewCommandList;

    //---------------------------------------------------------------

    /**
     * Instantiates a new shopping cart line sub view command.
     */
    public ShoppingCartLineSubViewCommand(){
        super();
    }

    /**
     * Instantiates a new shopping cart line sub view command.
     *
     * @param id
     *            the id
     * @param status
     *            the status
     * @param addTime
     *            the add time
     */
    public ShoppingCartLineSubViewCommand(Long id, Status status, Date addTime){
        super();
        this.id = id;
        this.status = status;
        this.addTime = addTime;
    }

    //---------------------------------------------------------------

    /**
     * 获得 购物车行 金额小计 *.
     *
     * @return the 购物车行 金额小计 *
     */
    public BigDecimal getSubTotalAmt(){
        return subTotalAmt;
    }

    /**
     * 设置 购物车行 金额小计 *.
     *
     * @param subTotalAmt
     *            the new 购物车行 金额小计 *
     */
    public void setSubTotalAmt(BigDecimal subTotalAmt){
        this.subTotalAmt = subTotalAmt;
    }

    /**
     * 获得 购物车行的唯一标识,如果是会员购物车,那么此处的 如果是游客的购物车,那么自己算出id,以便对这个id进行删除/修改.
     *
     * @return the id
     */
    public Long getId(){
        return id;
    }

    /**
     * 设置 购物车行的唯一标识,如果是会员购物车,那么此处的 如果是游客的购物车,那么自己算出id,以便对这个id进行删除/修改.
     *
     * @param id
     *            the id to set
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * 获得 添加时间,此处的时间通常用于页面购物车行的排序,仅此而已.
     *
     * @return the addTime
     */
    public Date getAddTime(){
        return addTime;
    }

    /**
     * 设置 添加时间,此处的时间通常用于页面购物车行的排序,仅此而已.
     *
     * @param addTime
     *            the addTime to set
     */
    public void setAddTime(Date addTime){
        this.addTime = addTime;
    }

    /**
     * 获得 买的什么商品id.
     *
     * @return the itemId
     */
    public Long getItemId(){
        return itemId;
    }

    /**
     * 设置 买的什么商品id.
     *
     * @param itemId
     *            the itemId to set
     */
    public void setItemId(Long itemId){
        this.itemId = itemId;
    }

    /**
     * 获得 买的什么商品code.
     *
     * @return the itemCode
     */
    public String getItemCode(){
        return itemCode;
    }

    /**
     * 设置 买的什么商品code.
     *
     * @param itemCode
     *            the itemCode to set
     */
    public void setItemCode(String itemCode){
        this.itemCode = itemCode;
    }

    /**
     * 获得 商品名称是什么.
     *
     * @return the itemName
     */
    public String getItemName(){
        return itemName;
    }

    /**
     * 设置 商品名称是什么.
     *
     * @param itemName
     *            the itemName to set
     */
    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    /**
     * 获得 买的哪个sku.
     *
     * @return the skuId
     */
    public Long getSkuId(){
        return skuId;
    }

    /**
     * 设置 买的哪个sku.
     *
     * @param skuId
     *            the skuId to set
     */
    public void setSkuId(Long skuId){
        this.skuId = skuId;
    }

    /**
     * 获得 外部编码 是扣减库存以及和后端对接数据的核心参数.
     *
     * @return the extentionCode
     */
    public String getExtentionCode(){
        return extentionCode;
    }

    /**
     * 设置 外部编码 是扣减库存以及和后端对接数据的核心参数.
     *
     * @param extentionCode
     *            the extentionCode to set
     */
    public void setExtentionCode(String extentionCode){
        this.extentionCode = extentionCode;
    }

    /**
     * 获得 数量几个.
     *
     * @return the quantity
     */
    public Integer getQuantity(){
        return quantity;
    }

    /**
     * 设置 数量几个.
     *
     * @param quantity
     *            the quantity to set
     */
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    /**
     * 获得 商品图片.
     *
     * @return the itemPic
     */
    public String getItemPic(){
        return itemPic;
    }

    /**
     * 设置 商品图片.
     *
     * @param itemPic
     *            the itemPic to set
     */
    public void setItemPic(String itemPic){
        this.itemPic = itemPic;
    }

    /**
     * 获得 是否选中,主要用来渲染view里面的checkbox checked状态.
     *
     * @return the checked
     */
    public boolean getChecked(){
        return checked;
    }

    /**
     * 设置 是否选中,主要用来渲染view里面的checkbox checked状态.
     *
     * @param checked
     *            the checked to set
     */
    public void setChecked(boolean checked){
        this.checked = checked;
    }

    /**
     * 获得 是否是赠品.
     *
     * @return the isGift
     */
    public boolean getIsGift(){
        return isGift;
    }

    /**
     * 设置 是否是赠品.
     *
     * @param isGift
     *            the isGift to set
     */
    public void setIsGift(boolean isGift){
        this.isGift = isGift;
    }

    /**
     * 获得 销售价.
     *
     * @return the salePrice
     */
    public BigDecimal getSalePrice(){
        return salePrice;
    }

    /**
     * 设置 销售价.
     *
     * @param salePrice
     *            the salePrice to set
     */
    public void setSalePrice(BigDecimal salePrice){
        this.salePrice = salePrice;
    }

    /**
     * 获得 吊牌价(原单价).
     *
     * @return the listPrice
     */
    public BigDecimal getListPrice(){
        return listPrice;
    }

    /**
     * 设置 吊牌价(原单价).
     *
     * @param listPrice
     *            the listPrice to set
     */
    public void setListPrice(BigDecimal listPrice){
        this.listPrice = listPrice;
    }

    /**
     * 获得 哪一个组,以往相同sku添加到购物车,那么购物车是一行记录,数量是2;
     * <p>
     * 但是我们要实现,两行记录,每行的数量是1, 因为可能其中的一个sku是bundle里面的,另外一个不是
     * </p>
     * 此处主要是为了区分按组显示.
     *
     * @return the group
     */
    public Integer getGroup(){
        return group;
    }

    /**
     * 设置 哪一个组,以往相同sku添加到购物车,那么购物车是一行记录,数量是2;
     * <p>
     * 但是我们要实现,两行记录,每行的数量是1, 因为可能其中的一个sku是bundle里面的,另外一个不是
     * </p>
     * 此处主要是为了区分按组显示.
     *
     * @param group
     *            the group to set
     */
    public void setGroup(Integer group){
        this.group = group;
    }

    /**
     * 获得 状态.
     *
     * @return the status
     */
    public Status getStatus(){
        return status;
    }

    /**
     * 设置 状态.
     *
     * @param status
     *            the status to set
     */
    public void setStatus(Status status){
        this.status = status;
    }

    /**
     * 获得 库存数量.
     *
     * @return the stock
     * @since 5.3.1.8
     */
    public Integer getStock(){
        return stock;
    }

    /**
     * 设置 库存数量.
     *
     * @param stock
     *            the stock to set
     * @since 5.3.1.8
     */
    public void setStock(Integer stock){
        this.stock = stock;
    }

    @Override
    public String toString(){
        return "ShoppingCartLineSubViewCommand [id=" + id + ", status=" + status + ", addTime=" + addTime + ", group=" + group + ", itemId="
                        + itemId + ", itemCode=" + itemCode + ", itemName=" + itemName + ", skuId=" + skuId + ", extentionCode="
                        + extentionCode + ", quantity=" + quantity + ", stock=" + stock + ", itemPic=" + itemPic + ", checked=" + checked
                        + ", isGift=" + isGift + ", salePrice=" + salePrice + ", listPrice=" + listPrice + ", subTotalAmt=" + subTotalAmt
                        + ", shoppingCartLinePackageInfoViewCommandList=" + shoppingCartLinePackageInfoViewCommandList + "]";
    }

    /**
     * 获得 对应的包装信息.
     *
     * @return the shoppingCartLinePackageInfoViewCommandList
     */
    public List<ShoppingCartLinePackageInfoViewCommand> getShoppingCartLinePackageInfoViewCommandList(){
        return shoppingCartLinePackageInfoViewCommandList;
    }

    /**
     * 设置 对应的包装信息.
     *
     * @param shoppingCartLinePackageInfoViewCommandList
     *            the shoppingCartLinePackageInfoViewCommandList to set
     */
    public void setShoppingCartLinePackageInfoViewCommandList(
                    List<ShoppingCartLinePackageInfoViewCommand> shoppingCartLinePackageInfoViewCommandList){
        this.shoppingCartLinePackageInfoViewCommandList = shoppingCartLinePackageInfoViewCommandList;
    }
}
