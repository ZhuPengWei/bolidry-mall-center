package org.bolidry.mall.order.service.impl;

import org.bolidry.mall.common.enums.order.OrderNoTypeEnum;
import org.bolidry.mall.common.utils.ParamCheckUtil;
import org.bolidry.mall.order.domain.dto.GenOrderIdDTO;
import org.bolidry.mall.order.domain.request.GenOrderIdRequest;
import org.bolidry.mall.order.service.OrderNoService;
import org.bolidry.mall.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单相关业务层实现类
 * @author ZhuPengWei
 * @date 2022-08-15 11:00
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderNoService orderNoService;


    @Override
    public GenOrderIdDTO genOrderNo(GenOrderIdRequest genOrderIdRequest) {

        // 参数校验
        ParamCheckUtil.checkObjectNotEmpty(genOrderIdRequest.getBusinessIdentifier());
        ParamCheckUtil.checkStrNotBlank(genOrderIdRequest.getUserId());

        // 生成订单号
        String orderId = orderNoService.genOrderId(OrderNoTypeEnum.SALE_ORDER.getCode(),
                genOrderIdRequest.getBusinessIdentifier(),
                genOrderIdRequest.getUserId());

        return GenOrderIdDTO.build(orderId);
    }
}
