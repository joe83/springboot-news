package com.random.account.utils;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.util.Random;

/**
 * 工具类
 */
public class TextUtils {
    /**
     * 判断字符串是否为空
     *
     * @param @param  str
     * @param @return
     * @return boolean
     * @throws
     * @Title: isEmpty
     * @Description:
     */
    public static boolean isEmpty(String str) {
        if (str == null || str.trim().length() == 0 || "".equals(str)) {
            return true;
        }
        return false;
    }

    public static String getSalt() {
        Random ranGen = new Random();
        byte[] aesKey = new byte[5];
        ranGen.nextBytes(aesKey);
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < aesKey.length; i++) {
            String hex = Integer.toHexString(0xff & aesKey[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    /**
     * 利用MD5进行加密
     *
     * @param password
     * @return
     */
    public static String EncoderByMd5(String password) {
        try {
            //确定计算方法
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            //加密后的字符串
            String newstr = base64en.encode(md5.digest(password.getBytes("utf-8")));
            return newstr;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
