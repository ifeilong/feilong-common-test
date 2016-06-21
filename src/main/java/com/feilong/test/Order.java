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
package com.feilong.test;

/**
 * The Class Order.
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @version 1.0 Jan 26, 2013 2:42:00 PM
 */
public class Order{

    /** The code. */
    private String code;

    /** The member id. */
    private String memberID;

    /** The merchant_order_code. */
    private String merchant_order_code;

    /**
     * 获得 code.
     *
     * @return the code
     */
    public String getCode(){
        return code;
    }

    /**
     * 设置 code.
     *
     * @param code
     *            the code to set
     */
    public void setCode(String code){
        this.code = code;
    }

    /**
     * 获得 member id.
     *
     * @return the memberID
     */
    public String getMemberID(){
        return memberID;
    }

    /**
     * 设置 member id.
     *
     * @param memberID
     *            the memberID to set
     */
    public void setMemberID(String memberID){
        this.memberID = memberID;
    }

    /**
     * 获得 merchant_order_code.
     *
     * @return the merchant_order_code1
     */
    public String getMerchant_order_code(){
        return merchant_order_code;
    }

    /**
     * 设置 merchant_order_code.
     *
     * @param merchant_order_code
     *            the merchant_order_code1 to set
     */
    public void setMerchant_order_code(String merchant_order_code){
        this.merchant_order_code = merchant_order_code;
    }

}
