package com.zqx.page.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by adc333 on 2017/2/18.
 */
public class StringUtil {

    /**
     * 校验字符串是否是大于0的数字
     * @param string
     * @return
     */
    public static boolean isNum(String string){
        Pattern pattern = Pattern.compile("[1-9]{1}\\d*");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
