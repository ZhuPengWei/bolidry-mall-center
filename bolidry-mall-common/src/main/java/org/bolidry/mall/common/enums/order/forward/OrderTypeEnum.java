package org.bolidry.mall.common.enums.order.forward;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 订单类型枚举
 * @author ZhuPengWei
 * @date 2022-08-13 13:44
 */
@Getter
public enum OrderTypeEnum {

    NORMAL(1, "自营商城"),
    UNKNOWN(999,"其他");

    Integer code;

    String desc;

    OrderTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer,String> toMap(){
        Map<Integer, String> map = new HashMap<>(16);
        for (OrderTypeEnum element : values() ){
            map.put(element.getCode(),element.getDesc());
        }
        return map;
    }

    public static OrderTypeEnum getByCode(Integer code){
        for(OrderTypeEnum element : values()){
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (OrderTypeEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
