package org.bolidry.mall.common.enums.order.reverse;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 售后申请原因枚举
 * @author ZhuPengWei
 * @date 2022-08-13 14:20
 */
@Getter
public enum AfterSaleReasonEnum {

    ITEM_NUM(10, "商品数量原因"),
    ITEM_QUALITY(20, "商品质量原因"),
    ITEM_PACKAGE(30, "商品包装原因"),
    LOGISTICS(40, "物流原因"),
    DELIVERY(50, "快递员原因"),
    USER(60, "用户自己原因"),
    ITEM_PRICE(70, "商品价格原因"),
    CANCEL(80, "取消订单"),
    FORCED_CANCELLATION(90, "平台强制取消订单"),
    DISHONOR(100, "拒收"),
    OTHER(999, "其他"),
    ;

    Integer code;

    String desc;

    AfterSaleReasonEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Map<Integer, String> toMap() {
        Map<Integer, String> map = new HashMap<>(16);
        for (AfterSaleReasonEnum element : values()) {
            map.put(element.getCode(), element.getDesc());
        }
        return map;
    }

    public static AfterSaleReasonEnum getByCode(Integer code) {
        for (AfterSaleReasonEnum element : values()) {
            if (code.equals(element.getCode())) {
                return element;
            }
        }
        return null;
    }

    public static Set<Integer> allowableValues() {
        Set<Integer> allowableValues = new HashSet<>(values().length);
        for (AfterSaleReasonEnum orderTypeEnum : values()) {
            allowableValues.add(orderTypeEnum.getCode());
        }
        return allowableValues;
    }
}
