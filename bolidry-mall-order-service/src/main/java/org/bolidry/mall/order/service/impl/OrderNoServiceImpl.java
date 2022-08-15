package org.bolidry.mall.order.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.BooleanUtil;
import org.bolidry.mall.common.utils.StrUtils;
import org.bolidry.mall.order.service.OrderNoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 订单号相关的业务层
 * @author ZhuPengWei
 * @date 2022-08-15 13:30
 */
@Service
public class OrderNoServiceImpl implements OrderNoService {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private static final String orderNoKey ="bolidry.mall.order.orderNoKeyPrefix";


    @Override
    public String genOrderId(Integer orderNoType, Integer businessIdentifier, String userId) {

        String formatData = "yyyyMMddHHmmss";

        // 1~2 是订单类型 10代表正向链路的订单号,20代表逆向链路生成的订单号
        return StrUtils.fixedLengthStr(String.valueOf(orderNoType), 2)

                // 3~4 中间两位是业务线标志
                + StrUtils.fixedLengthStr(String.valueOf(businessIdentifier), 2)

                // 5~16位12位为yyyyMMddHHmmss
                + DateUtil.format(new Date(), formatData)

                // 17-25位为为redis自增数字,截取后9位,不足补0,自增key存活时间为1天,共5位
                + redisNumAutoIncr()

                // 26-30为用户ID后5位,不足以0补位
                + StrUtils.fixedLengthStr(userId, 5);
    }

    private String redisNumAutoIncr() {
        Long orderNumber =1L;
        if(BooleanUtil.isTrue(stringRedisTemplate.hasKey(orderNoKey))){
            orderNumber = stringRedisTemplate.opsForValue().increment(orderNoKey);
        }else {
            stringRedisTemplate.opsForValue().set(orderNoKey, String.valueOf(orderNumber), 1, TimeUnit.DAYS);
        }
        return StrUtils.fixedLengthStr(String.valueOf(orderNumber),9 );
    }

}
