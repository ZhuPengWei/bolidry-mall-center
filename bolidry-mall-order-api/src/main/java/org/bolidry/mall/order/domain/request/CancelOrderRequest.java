package org.bolidry.mall.order.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author ZhuPengWei
 * @date 2022-08-14 22:12
 */
@Data
public class CancelOrderRequest implements Serializable {

    private String orderId;

    private String userId;


    /**
     *  0-用户手动取消 1-超时取消 2-客服授权取消
     */
    private Integer orderCancelType;
}
