package org.bolidry.mall.common.enums.order.forward;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 订单状态枚举
 * @author ZhuPengWei
 * @date 2022-08-13 13:44
 */
@Getter
public enum OrderStatusEnum {

    NULL(999, "未知"),
    CREATED(10, "已创建"),
    PAID(20, "已支付"),
    FULFILL(30, "已履约"),
    OUT_STOCK(40, "出库"),
    DELIVERY(50, "配送中"),
    SIGNED(60, "已签收"),
    CANCELED(70, "已取消"),
    REFUSED(80, "已拒收"),
    INVALID(90, "无效订单"),
    ;

    Integer code;

    String desc;

    OrderStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (OrderStatusEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static OrderStatusEnum getByCode(Integer code) {
        for (OrderStatusEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (OrderStatusEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
