package org.bolidry.mall.order.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 预支付请求参数
 * @author ZhuPengWei
 * @date 2022-08-13 22:07
 */
@Data
public class PrePayOrderRequest implements Serializable {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 支付方式
     */
    private Integer payType;

}
