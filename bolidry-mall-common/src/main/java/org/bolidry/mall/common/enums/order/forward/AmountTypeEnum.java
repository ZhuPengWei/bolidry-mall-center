package org.bolidry.mall.common.enums.order.forward;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 费用类型枚举
 * @author ZhuPengWei
 * @date 2022-08-13 13:44
 */
@Getter
public enum AmountTypeEnum {

    ORIGIN_PAY_AMOUNT(10, "订单支付原价"),
    COUPON_DISCOUNT_AMOUNT(20, "优惠券抵扣金额"),
    SHIPPING_AMOUNT(30, "运费"),
    BOX_AMOUNT(40, "包装费"),
    REAL_PAY(50, "实付金额"),
    OTHER_AMOUNT(999, "其他费用"),
    ;

    Integer code;

    String desc;

    AmountTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (AmountTypeEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static AmountTypeEnum getByCode(Integer code) {
        for (AmountTypeEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (AmountTypeEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
