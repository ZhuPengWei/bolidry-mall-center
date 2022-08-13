package org.bolidry.mall.common.enums.order;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 平台相关枚举
 * @author ZhuPengWei
 * @date 2022-08-13 13:44
 */
@Getter
public enum PlatformEnum {

    ISO(10, "苹果"),
    ANDROID(20, "安卓"),
    WX(30, "微信小程序"),
    ZFB(40, "支付宝小程序"),
    H5(50, "h5页面"),
    OTHER(999, "其他"),
    ;

    Integer code;

    String desc;

    PlatformEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (PlatformEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static PlatformEnum getByCode(Integer code) {
        for (PlatformEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (PlatformEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
