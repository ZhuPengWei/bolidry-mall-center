package org.bolidry.mall.common.utils;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import org.bolidry.mall.common.exception.BaseBisException;
import org.bolidry.mall.common.exception.CommonErrorCodeEnum;

/**
 * 参数检查工具类
 * @author ZhuPengWei
 * @date 2022-08-15 11:32
 */
public class ParamCheckUtil {

    /**
     * 检查object对象不能为空
     */
    public static void checkObjectNotEmpty(Object o) {
        if (ObjectUtil.isEmpty(o)) {
            throw new BaseBisException(CommonErrorCodeEnum.SERVER_ILLEGAL_ARGUMENT_ERROR);
        }
    }

    /**
     * 检查str不能为空
     */
    public static void checkStrNotBlank(String str) {
        if (StrUtil.isBlank(str)) {
            throw new BaseBisException(CommonErrorCodeEnum.SERVER_ILLEGAL_ARGUMENT_ERROR);
        }
    }

}
