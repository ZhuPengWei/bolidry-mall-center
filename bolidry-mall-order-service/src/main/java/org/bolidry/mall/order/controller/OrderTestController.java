package org.bolidry.mall.order.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.bolidry.mall.common.core.JsonResult;
import org.bolidry.mall.order.api.OrderApi;
import org.bolidry.mall.order.domain.dto.GenOrderIdDTO;
import org.bolidry.mall.order.domain.request.GenOrderIdRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ZhuPengWei
 * @date 2022-08-15 14:17
 */
@RestController
@RequestMapping("/order/test")
public class OrderTestController {

    @DubboReference(version = "1.0.0",retries = 0)
    private OrderApi orderApi;

    /**
     * 测试生成新的订单号
     */
    @PostMapping("/genOrderId")
    public JsonResult<GenOrderIdDTO> genOrderId(@RequestBody GenOrderIdRequest genOrderIdRequest) {
        return orderApi.genOrderNo(genOrderIdRequest);
    }

}
