package org.bolidry.mall.order.api;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.bolidry.mall.common.core.JsonResult;
import org.bolidry.mall.common.exception.BaseBisException;
import org.bolidry.mall.order.domain.dto.*;
import org.bolidry.mall.order.domain.request.*;
import org.bolidry.mall.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ZhuPengWei
 * @date 2022-08-15 10:56
 */
@DubboService(version = "1.0.0", interfaceClass = OrderApi.class, retries = 0)
@Slf4j
public class OrderApiImpl implements OrderApi {

    @Autowired
    private OrderService orderService;

    @Override
    public JsonResult<GenOrderIdDTO> genOrderNo(GenOrderIdRequest genOrderIdRequest) {
        try {
            // 生成订单ID
            GenOrderIdDTO genOrderIdDTO = orderService.genOrderNo(genOrderIdRequest);

            return JsonResult.buildSuccess(genOrderIdDTO);

        }catch (BaseBisException baseBisException){
            log.error("[订单系统]生成订单号接口出现了业务异常:{}", baseBisException.getErrorMessage());
            return JsonResult.buildError(baseBisException.getErrorCode(), baseBisException.getErrorMessage());

        }catch (Exception e) {
            log.error("[订单系统]生成订单号接口系统异常:{}", e.getMessage());
            return JsonResult.buildError(e.getMessage());

        }
    }

    @Override
    public JsonResult<CreateOrderDTO> createOrder(CreateOrderRequest createOrderRequest) {
        return null;
    }

    @Override
    public JsonResult<PrePayOrderDTO> prePayOrder(PrePayOrderRequest prePayOrderRequest) {
        return null;
    }

    @Override
    public JsonResult<Boolean> payCallBack(PayCallBackRequest payCallBackRequest) {
        return null;
    }

    @Override
    public JsonResult<RemoveOrdersDTO> removeOrders(RemoveOrdersRequest removeOrderRequest) {
        return null;
    }

    @Override
    public JsonResult<AdjustDeliveryAddressDTO> adjustDeliveryAddress(AdjustDeliveryAddressRequest adjustDeliveryAddressRequest) {
        return null;
    }
}
