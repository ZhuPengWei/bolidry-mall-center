package org.bolidry.mall.common.enums.order.reverse;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 售后支付状态枚举
 * @author ZhuPengWei
 * @date 2022-08-13 14:20
 */
@Getter
public enum AfterSalePaymentStatusEnum {

    APPLYING(10, "申请中"),
    REFUNDING(20, "退款中"),
    REFUNDED(30, "退款成功"),
    FAILED(40, "退款失败"),
    ;

    Integer code;

    String desc;

    AfterSalePaymentStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (AfterSalePaymentStatusEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static AfterSalePaymentStatusEnum getByCode(Integer code) {
        for (AfterSalePaymentStatusEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (AfterSalePaymentStatusEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
