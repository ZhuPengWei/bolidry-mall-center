package org.bolidry.mall.common.enums.order.reverse;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 售后类型枚举
 * @author ZhuPengWei
 * @date 2022-08-13 14:25
 */
@Getter
public enum AfterSaleTypeEnum {

    ALL_REFUND(10, "售后全额退款"),
    TIMEOUT_NO_PAY(20, "超时未支付"),
    USER_CANCEL(30, "用户自主取消"),
    CUSTOMER_CANCEL(40, "授权客服取消"),
    AFTER_SALE_REFUND_ALL_GOODS(50, "先退货后退款,全部退货"),
    AFTER_SALE_REFUND(60, "先退货后退款,已退款"),
    REFUND(70, "直接退款"),
    LACK_REFUND(80, "缺品退款"),
    REFUNDED(90, "已退款"),
    ;

    Integer code;
    String desc;

    AfterSaleTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (AfterSaleTypeEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static AfterSaleTypeEnum getByCode(Integer code) {
        for (AfterSaleTypeEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (AfterSaleTypeEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
