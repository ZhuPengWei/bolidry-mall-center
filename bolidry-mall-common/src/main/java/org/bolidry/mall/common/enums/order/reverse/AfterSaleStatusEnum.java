package org.bolidry.mall.common.enums.order.reverse;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 售后订单状态枚举
 * @author ZhuPengWei
 * @date 2022-08-13 14:20
 */
@Getter
public enum AfterSaleStatusEnum {

    COMMITTED(10, "提交申请"),
    REVIEW_PASS(20, "审核通过"),
    REVIEW_REJECTED(30, "审核拒绝"),
    REFUNDING(40, "退款中"),
    REFUNDED(50, "退款成功"),
    FAILED(60, "退款失败"),
    CLOSED(70, "已关闭"),
    REOPEN(80, "重新提交申请"),
    REVOKE(90, "撤销成功"),
    ;

    Integer code;

    String desc;

    AfterSaleStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (AfterSaleStatusEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static AfterSaleStatusEnum getByCode(Integer code) {
        for (AfterSaleStatusEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (AfterSaleStatusEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
