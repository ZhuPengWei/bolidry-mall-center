package org.bolidry.mall.common.enums.order.reverse;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 售后明细
 * @author ZhuPengWei
 * @date 2022-08-13 14:20
 */
@Getter
public enum AfterSaleDetailEnum {

    ITEM(1, "普通商品"),
    COUPON(2, "优惠券"),
    FREIGHT(3, "运费"),
    ;

    Integer code;

    String desc;

    AfterSaleDetailEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (AfterSaleDetailEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static AfterSaleDetailEnum getByCode(Integer code) {
        for (AfterSaleDetailEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (AfterSaleDetailEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
