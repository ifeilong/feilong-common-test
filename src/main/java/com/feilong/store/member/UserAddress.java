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

/**
 * The Class UserAddress.
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @version 1.0 Jan 25, 2013 4:44:07 PM
 */
public class UserAddress{

    /** The address. */
    private String address;

    public UserAddress(){
        super();
    }

    public UserAddress(String address){
        super();
        this.address = address;
    }

    /**
     * 获得 address.
     *
     * @return the address
     */
    public String getAddress(){
        return address;
    }

    /**
     * 设置 address.
     *
     * @param address
     *            the address to set
     */
    public void setAddress(String address){
        this.address = address;
    }
}
