package org.bolidry.mall.common.enums.order.reverse;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 售后来源
 * @author ZhuPengWei
 * @date 2022-08-13 14:20
 */
@Getter
public enum AfterSaleApplySourceEnum {

    USER_APPLY(10, "用户申请退款"),
    SYSTEM(20, "系统自动退款"),
    CUSTOM_APPLY(30, "客服申请退款"),
    USER_REFUND_GOODS(40, "用户申请退货"),
    ;

    Integer code;

    String desc;

    AfterSaleApplySourceEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (AfterSaleApplySourceEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static AfterSaleApplySourceEnum getByCode(Integer code) {
        for (AfterSaleApplySourceEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (AfterSaleApplySourceEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
