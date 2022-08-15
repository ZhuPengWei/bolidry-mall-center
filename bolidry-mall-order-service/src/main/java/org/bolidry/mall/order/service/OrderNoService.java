package org.bolidry.mall.order.service;

/**
 * 订单号相关的业务层
 * @author ZhuPengWei
 * @date 2022-08-15 13:30
 */
public interface OrderNoService {


    /**
     * 生成订单号
     *
     * 订单号为30位
     * 1~2 是订单类型 10代表正向链路的订单号,20代表逆向链路生成的订单号
     * 3~4 中间两位是业务线标志
     * 5~16位12位为yyyyMMddHHmmss
     * 17-25位为为redis自增数字,截取后9位,不足补0,自增key存活时间为1天,共5位
     * 26-30为用户ID后5位,不足以0补位
     *
     * @param orderNoType 订单号类型
     * @param businessIdentifier 业务线标志
     * @param userId 用户ID
     * @return 订单号
     */
    String genOrderId(Integer orderNoType, Integer businessIdentifier, String userId);

}
