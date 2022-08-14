package org.bolidry.mall.order.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建订单DTO
 * @author ZhuPengWei
 * @date 2022-08-13 20:46
 */
@Data
public class CreateOrderDTO implements Serializable {

    /**
     * 订单ID
     */
    private String orderId;

}
