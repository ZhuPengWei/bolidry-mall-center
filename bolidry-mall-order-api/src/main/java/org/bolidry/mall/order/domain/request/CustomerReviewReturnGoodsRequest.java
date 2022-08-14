package org.bolidry.mall.order.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author ZhuPengWei
 * @date 2022-08-14 22:54
 */
@Data
public class CustomerReviewReturnGoodsRequest implements Serializable {

    /**
     * 售后ID
     */
    private String afterSaleId;

    /**
     * 客服ID
     */
    private String customerId;

    /**
     * 审核状态 1审核通过 2审核拒绝
     */
    private Integer auditStatus;

    /**
     * 售后支付单ID
     */
    private String afterSaleRefundId;

    private String orderId;

    /**
     * 审核信息描述
     */
    private String auditResultDesc;
}
