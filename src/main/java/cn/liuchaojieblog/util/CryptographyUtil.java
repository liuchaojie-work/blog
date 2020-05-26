package cn.liuchaojieblog.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * md5加密
 */
public class CryptographyUtil {

    public static String md5(String str, String salt ){
        return new Md5Hash(str, salt).toString();
    }
    public static void main(String[] args){
        System.out.println(md5("1","java123456"));
    }
}
