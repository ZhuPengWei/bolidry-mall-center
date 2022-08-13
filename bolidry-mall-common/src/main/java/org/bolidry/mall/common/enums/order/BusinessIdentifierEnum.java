package org.bolidry.mall.common.enums.order;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 业务线枚举
 * @author ZhuPengWei
 * @date 2022-08-13 13:32
 */
@Getter
public enum BusinessIdentifierEnum {


    SELF_MALL(1, "自营商城");

    Integer code;

    String desc;

    BusinessIdentifierEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }



    public static Map<Integer,String> toMap(){
        Map<Integer, String> map = new HashMap<>(16);
        for (BusinessIdentifierEnum element : values() ){
            map.put(element.getCode(),element.getDesc());
        }
        return map;
    }

    public static BusinessIdentifierEnum getByCode(Integer code){
        for(BusinessIdentifierEnum element : values()){
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (BusinessIdentifierEnum businessIdentifierEnum : values()) {
            allowableValues.add(businessIdentifierEnum.getCode());
        }
        return allowableValues;
    }
}
