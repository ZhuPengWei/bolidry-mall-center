package org.bolidry.mall.common.enums.order.forward;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 配送方式枚举
 * @author ZhuPengWei
 * @date 2022-08-13 13:44
 */
@Getter
public enum DeliveryTypeEnum {

    NULL(0, "不需要配送"),
    SELF(1, "自主配送"),
    ;

    Integer code;
    String desc;

    DeliveryTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (DeliveryTypeEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static DeliveryTypeEnum getByCode(Integer code) {
        for (DeliveryTypeEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (DeliveryTypeEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
