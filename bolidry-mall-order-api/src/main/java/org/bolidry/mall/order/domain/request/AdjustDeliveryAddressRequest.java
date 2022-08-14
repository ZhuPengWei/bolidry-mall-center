package org.bolidry.mall.order.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 修改配送地址
 * @author ZhuPengWei
 * @date 2022-08-14 14:02
 */
@Data
public class AdjustDeliveryAddressRequest implements Serializable {


    private String orderId;

    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 街道
     */
    private String street;

    /**
     * 详细地址
     */
    private String detailAddress;

    /**
     * 经度
     */
    private String lon;

    /**
     * 纬度
     */
    private String lat;


}
