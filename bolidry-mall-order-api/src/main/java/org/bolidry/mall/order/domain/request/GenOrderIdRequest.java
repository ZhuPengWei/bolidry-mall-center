package org.bolidry.mall.order.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ZhuPengWei
 * @date 2022-08-13 20:13
 */
@Data
public class GenOrderIdRequest implements Serializable {

    /**
     * 业务线标志
     */
    private Integer businessIdentifier;


    /**
     * 用户ID
     */
    private String userId;


}
