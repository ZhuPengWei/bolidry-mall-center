package org.bolidry.mall.common.utils;

import cn.hutool.core.util.StrUtil;

/**
 * 字符串工具类
 * @author ZhuPengWei
 * @date 2022-08-15 13:39
 */
public class StrUtils {

    /**
     * @param str 字符串
     * @param length 长度
     * @return 返回固定长度的字符串 str长度不够前面补0 str长度>固定长度 从后往前截取  "abcd"取 "cd"
     */
    public static String fixedLengthStr(String str, int length) {
        if (StrUtil.isBlank(str) || length < 0) {
            return str;
        }

        if (str.length() >= length) {
            return str.substring(str.length() - length);
        }

        int zeroNum = length - str.length();

        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = 0; i < zeroNum; i++) {
            strBuilder.insert(0, "0");
        }
        return strBuilder.toString();
    }


}
