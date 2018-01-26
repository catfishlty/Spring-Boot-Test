package top.catfish.test2_shiro.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * Dependency apache commons-codec 1.10
 */
public class EncriptUtil {
    public static String MD5(String data) {
        return DigestUtils.md5Hex(data);
    }
    public static String SHA1(String data){
        return DigestUtils.sha1Hex(data);
    }
    public static String BASE64Encode(String data){
        byte[] b = Base64.encodeBase64(data.getBytes(), true);
        return new String(b);
    }
    public static String BASE64Decode(String data){
        byte[] b = Base64.decodeBase64(data.getBytes());
        return new String(b);
    }
    public static void main(String[] args) {
        String before = "666666";
        System.out.println(MD5(before) + ",长度是" + MD5(before).length());
    }

}
