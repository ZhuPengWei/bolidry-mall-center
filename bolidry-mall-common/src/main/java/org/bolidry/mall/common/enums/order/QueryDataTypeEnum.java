package org.bolidry.mall.common.enums.order;

/**
 * 订单查询枚举
 * @author ZhuPengWei
 * @date 2022-08-13 14:10
 */
public enum QueryDataTypeEnum {

    // 订单基础
    BASE,
    // 订单条目
    ORDER_ITEM,
    // 订单费用明细
    ORDER_AMOUNT_DETAIL,
    // 订单支付
    PAYMENT,
    // 订单配送信息
    DELIVER,
    // 售后
    AFTER_SALE,
    // 售后明细
    AFTER_SALE_DETAIL,
    // 售后交易
    AFTER_SALE_PAY,
    // 渠道
    CHANNEL,
    // 费用
    AMOUNT,
    // 操作日志
    OPERATE_LOG,
    // 快照
    SNAPSHOT
}
