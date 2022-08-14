package org.bolidry.mall.order.api;

import org.bolidry.mall.common.core.JsonResult;
import org.bolidry.mall.order.domain.dto.*;
import org.bolidry.mall.order.domain.request.*;

/**
 * 正向链路订单API
 * @author ZhuPengWei
 * @date 2022-08-13 20:03
 */
public interface OrderApi {

    /**
     * 生成订单号接口
     * @param genOrderIdRequest 生成订单请求 包含业务线标志以及用户ID
     * @return 订单号
     */
    JsonResult<GenOrderIdDTO> genOrderNo(GenOrderIdRequest genOrderIdRequest);


    /**
     * 创建订单
     * @param createOrderRequest 创建订单的请求参数
     * @return 返回订单号
     */
    JsonResult<CreateOrderDTO> createOrder(CreateOrderRequest createOrderRequest);


    /**
     * 预支付接口
     * @param prePayOrderRequest 预支付的请求参数
     * @return 主要返回支付系统的交易号以及支付信息
     */
    JsonResult<PrePayOrderDTO> prePayOrder(PrePayOrderRequest prePayOrderRequest);


    /**
     * 支付回调接口
     * @param payCallBackRequest 支付回调接口
     * @return 是否回调成功
     */
    JsonResult<Boolean> payCallBack(PayCallBackRequest payCallBackRequest);


    /**
     * 删除订单接口
     * @param removeOrderRequest 删除订单请求
     * @return 删除成功的订单以及删除失败的订单
     */
    JsonResult<RemoveOrdersDTO> removeOrders(RemoveOrdersRequest removeOrderRequest);


    /**
     * 修改配送地址
     * @param adjustDeliveryAddressRequest 修改配送地址dto
     * @return 是否修改成功
     */
    JsonResult<AdjustDeliveryAddressDTO> adjustDeliveryAddress(AdjustDeliveryAddressRequest adjustDeliveryAddressRequest);
}
