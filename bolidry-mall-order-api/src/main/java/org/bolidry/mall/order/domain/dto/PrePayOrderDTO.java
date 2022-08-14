package org.bolidry.mall.order.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * 预支付响应参数
 * @author ZhuPengWei
 * @date 2022-08-13 22:07
 */
@Data
public class PrePayOrderDTO implements Serializable {

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 支付系统交易单号
     */
    private String outTradeNo;

    /**
     * 支付类型
     */
    private Integer payType;

    /**
     * 支付系统返回的信息
     * 不同的支付方式，返回的内容会不一样
     */
    private Map<String, Object> payData;

}
