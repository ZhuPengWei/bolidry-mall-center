package org.bolidry.mall.order.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 订单返回参数DTO
 * @author ZhuPengWei
 * @date 2022-08-13 20:05
 */
@Data
public class GenOrderIdDTO implements Serializable {

    private String orderId;

}
