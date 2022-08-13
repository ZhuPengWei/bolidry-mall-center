package org.bolidry.mall.common.enums.order.forward;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 支付状态枚举
 * @author ZhuPengWei
 * @date 2022-08-13 13:44
 */
@Getter
public enum PayStatusEnum {

    WECHAT_PAY(10, "未支付"),
    ALI_PAY(20, "已支付"),
    ;

    Integer code;

    String desc;

    PayStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (PayStatusEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static PayStatusEnum getByCode(Integer code) {
        for (PayStatusEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (PayStatusEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
