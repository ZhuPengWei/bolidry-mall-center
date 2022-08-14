package org.bolidry.mall.order.domain.request;

import java.io.Serializable;

/**
 * 撤销售后申请请求
 * @author ZhuPengWei
 * @date 2022-08-14 23:05
 */
public class RevokeAfterSaleRequest implements Serializable {

    /**
     * 售后单ID
     */
    private String afterSaleId;
}
