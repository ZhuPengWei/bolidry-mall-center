package org.bolidry.mall.common.enums.order.forward;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 支付类型枚举
 * @author ZhuPengWei
 * @date 2022-08-13 13:44
 */
@Getter
public enum PayTypeEnum {

    WECHAT_PAY(10, "微信支付"),
    ALI_PAY(20, "支付宝支付"),
    ;

    Integer code;

    String desc;

    PayTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (PayTypeEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static PayTypeEnum getByCode(Integer code) {
        for (PayTypeEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (PayTypeEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
