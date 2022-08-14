package org.bolidry.mall.order.api;

import org.bolidry.mall.common.core.JsonResult;
import org.bolidry.mall.order.domain.request.*;

/**
 * 逆向链路API
 * @author ZhuPengWei
 * @date 2022-08-13 20:04
 */
public interface AfterSaleApi {


    /**
     * 取消订单
     * @param cancelOrderRequest 取消订单的请求
     * @return 是否取消订单成功
     */
    JsonResult<Boolean> cancelOrder(CancelOrderRequest cancelOrderRequest);


    /**
     * 支付退款回调
     * @param paymentRefundCallbackRequest 退款回调请求
     * @return 是否回调成功
     */
    JsonResult<Boolean> paymentRefundCallback(PaymentRefundCallbackRequest paymentRefundCallbackRequest);


    /**
     * 处理售后申请
     * @param returnGoodsOrderRequest 处理售后申请请求
     * @return 是否申请成功
     */
    JsonResult<Boolean> processApplyAfterSale(ReturnGoodsOrderRequest returnGoodsOrderRequest);


    /**
     * 接收客服审核结果入口
     * @param customerReviewReturnGoodsRequest  接收客服审核结果请求
     * @return 审核结果
     */
    JsonResult<Boolean> receiveCustomerAuditResult(CustomerReviewReturnGoodsRequest customerReviewReturnGoodsRequest);


    /**
     * 用户撤销售后申请
     * @param revokeAfterSaleRequest 用户撤销售后申请请求
     * @return 撤销结果
     */
    JsonResult<Boolean> revokeAfterSale(RevokeAfterSaleRequest revokeAfterSaleRequest);
}
