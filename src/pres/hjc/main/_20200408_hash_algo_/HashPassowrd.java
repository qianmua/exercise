package pres.hjc.main._20200408_hash_algo_;

import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/8
 * @time 17:14
 */
public class HashPassowrd {

    public static String encreptUrl(String url){
        try {
            byte[] salt = "JKDSPnBKYJ2E7kEg9mYSteK4AXE8ywUB96y8gjDFhfy".getBytes("UTF-8");
            String checkSalt = "C2NkXy3ECJn9AcMB976DnBKYJ2E7kEg9mYSte";
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            messageDigest.update(salt);
            byte[] bytes = url.getBytes("UTF-8");
            byte[] encryptUrl = messageDigest.digest(bytes);
            String semiFinishedProducts = new String(Base64.encode(encryptUrl));
            //加密url的长度我设置的6位. 加密的url取三位。剩下三位分别给静态盐1位和动态盐2位
            String urlKey = semiFinishedProducts.substring(0,4);
            //位置可以在0-32位之间。这里可以选择位置。但是解密的时候就必须用同样的位置
            String staticSalt = md5Util(urlKey+checkSalt).substring(5,6);
            String dynaSalt = md5Util(""+ UUID.randomUUID()).substring(6,9);
            String encrypted = urlKey+staticSalt+dynaSalt;
            //标记量。用来加强短链接检查.这里输出查看下
            String sig = md5Util(encrypted);
//            String domain = "www.baidu.com/";
//            String subDomain = "demo/";
            String encryptedUrl = /*domain+subDomain+*/encrypted;
            //把 sig ,encryptedUrl ,originalUrl,key。存到数据库
            return encryptedUrl;
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String getOriginUrl(String encrpetUrl,String sig){
        encrpetUrl = encrpetUrl.substring(encrpetUrl.lastIndexOf("/")+1);
        String key = encrpetUrl.substring(0,4);
        String staticSalt = encrpetUrl.substring(4,5);
        //和上面的检查盐一样
        String checkSalt = "C2NkXy3ECJn9AcMB976DnBKYJ2E7kEg9mYSte";
        //静态盐检查
        String correctStaticSalt = md5Util(key+checkSalt).substring(5,6);
        if (!staticSalt.equals(correctStaticSalt)){
            System.out.println(1);
            return "error";
        }
        String correctSig = md5Util(encrpetUrl);
        if (!sig.equals(correctSig)){
            return "error";
        }
        //检查完毕。 没问题就通过key查询数据库。拿到原始url
        System.out.println(encrpetUrl);
        return correctSig;
    }

    public static String md5Util(String semiFinishedProducts){
        MessageDigest lDigest = null;
        try {
            lDigest = MessageDigest.getInstance("MD5");
            lDigest.update(semiFinishedProducts.getBytes());
            BigInteger lHashInt = new BigInteger(1, lDigest.digest());
            return String.format("%1$032X", lHashInt);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "ft/main?test=good&watch=100";
        String vara = encreptUrl(str);
        System.out.println(vara);
        str = md5Util(vara);
        vara = getOriginUrl(vara,str);
        //E10ADC3949BA59ABBE56E057F20F883E
    }
}
