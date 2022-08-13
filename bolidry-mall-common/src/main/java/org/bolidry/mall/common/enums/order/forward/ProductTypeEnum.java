package org.bolidry.mall.common.enums.order.forward;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 商品类型枚举
 * @author ZhuPengWei
 * @date 2022-08-13 13:44
 */
@Getter
public enum ProductTypeEnum {

    NORMAL_PRODUCT(10, "普通商品"),
    ADVANCE_PRODUCT(20, "预售商品"),
    ;

    Integer code;

    String desc;

    ProductTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (ProductTypeEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static ProductTypeEnum getByCode(Integer code) {
        for (ProductTypeEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (ProductTypeEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
