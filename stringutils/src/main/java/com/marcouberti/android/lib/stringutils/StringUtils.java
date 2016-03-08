package com.marcouberti.android.lib.stringutils;

/**
 * Created by Marco Uberti on 08/03/16.
 */
public class StringUtils {
    public static String concat(String string1,String string2) {
        if(string1 == null) string1 = "";
        if(string2 == null) string2 = "";
        StringBuffer buff = new StringBuffer(string1);
        buff.append(string2);
        return buff.toString();
    }
}
