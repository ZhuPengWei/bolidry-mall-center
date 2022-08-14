package org.bolidry.mall.order.service;

import org.bolidry.mall.order.domain.dto.WmsShipDTO;

/**
 * 订单履约业务层接口
 * @author ZhuPengWei
 * @date 2022-08-13 22:55
 */
public interface OrderFulfillService {


    /**
     * 触发订单履约
     * @param orderId 订单ID
     */
    void triggerOrderFulfill(String orderId);

    /**
     * 通知订单物流配送结果接口
     */
    void informOrderWmsShipResult(WmsShipDTO wmsShipDTO);

}
