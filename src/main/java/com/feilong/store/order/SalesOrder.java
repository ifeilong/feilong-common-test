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
import java.util.Date;
import java.util.List;

import com.feilong.store.member.Member;

/**
 * The Class SalesOrder.
 * 
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @version 1.0.7 2014年6月24日 上午11:28:28
 * @since 1.0.7
 */
public class SalesOrder implements Serializable{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 288232184048495608L;

    //---------------------------------------------------------------

    /** The id. */
    private Long              id;

    /** The code. */
    private String            code;

    /** 物流状态. */
    private Integer           logisticsStatus;

    //---------------------------------------------------------------

    /** The price. */
    private BigDecimal        price;

    /** The create time. */
    private Date              createTime;

    /** The member. */
    private Member            member;

    /** The order line list. */
    private List<OrderLine>   orderLineList;

    //---------------------------------------------------------------

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
     * Gets the code.
     * 
     * @return the code
     */
    public String getCode(){
        return code;
    }

    /**
     * Sets the code.
     * 
     * @param code
     *            the code to set
     */
    public void setCode(String code){
        this.code = code;
    }

    /**
     * Gets the price.
     * 
     * @return the price
     */
    public BigDecimal getPrice(){
        return price;
    }

    /**
     * Sets the price.
     * 
     * @param price
     *            the price to set
     */
    public void setPrice(BigDecimal price){
        this.price = price;
    }

    /**
     * Gets the creates the time.
     * 
     * @return the createTime
     */
    public Date getCreateTime(){
        return createTime;
    }

    /**
     * Sets the creates the time.
     * 
     * @param createTime
     *            the createTime to set
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
     * Gets the member.
     * 
     * @return the member
     */
    public Member getMember(){
        return member;
    }

    /**
     * Sets the member.
     * 
     * @param member
     *            the member to set
     */
    public void setMember(Member member){
        this.member = member;
    }

    /**
     * Gets the order line list.
     *
     * @return the orderLineList
     */
    public List<OrderLine> getOrderLineList(){
        return orderLineList;
    }

    /**
     * Sets the order line list.
     *
     * @param orderLineList
     *            the orderLineList to set
     */
    public void setOrderLineList(List<OrderLine> orderLineList){
        this.orderLineList = orderLineList;
    }

    /**
     * 获得 物流状态.
     *
     * @return the logisticsStatus
     */
    public Integer getLogisticsStatus(){
        return logisticsStatus;
    }

    /**
     * 设置 物流状态.
     *
     * @param logisticsStatus
     *            the logisticsStatus to set
     */
    public void setLogisticsStatus(Integer logisticsStatus){
        this.logisticsStatus = logisticsStatus;
    }

}
