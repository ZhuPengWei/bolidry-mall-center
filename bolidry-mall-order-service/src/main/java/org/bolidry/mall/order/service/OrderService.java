package org.bolidry.mall.order.service;

import org.bolidry.mall.order.domain.dto.GenOrderIdDTO;
import org.bolidry.mall.order.domain.request.GenOrderIdRequest;
import org.springframework.stereotype.Service;

/**
 * 订单相关的业务层接口
 * @author ZhuPengWei
 * @date 2022-08-15 10:58
 */
public interface OrderService {


    /**
     * 生成订单号
     * @param genOrderIdRequest 生成订单号入参
     * @return 订单号
     */
    GenOrderIdDTO genOrderNo(GenOrderIdRequest genOrderIdRequest);
}
