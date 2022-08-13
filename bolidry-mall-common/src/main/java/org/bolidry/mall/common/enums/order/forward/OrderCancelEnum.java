package org.bolidry.mall.common.enums.order.forward;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 订单取消类型枚举
 * @author ZhuPengWei
 * @date 2022-08-13 14:48
 */
@Getter
public enum OrderCancelEnum {

    USER_CANCELED(0, "用户手动取消"),
    TIMEOUT_CANCELED(1, "超时未支付自动取消"),
    CUSTOMER_CANCELED(2, "用户授权客服取消"),
    ;

    Integer code;
    String desc;

    OrderCancelEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (OrderCancelEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static OrderCancelEnum getByCode(Integer code) {
        for (OrderCancelEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (OrderCancelEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
