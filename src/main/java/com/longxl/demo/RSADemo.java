package com.longxl.demo;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import java.security.*;
import java.security.interfaces.*;
import java.security.spec.*;
import java.util.HashMap;
import java.util.Map;

public class RSADemo {
    private static final String CHARSET = "utf-8";
    private static final String ALGORITHM = "RSA";
    //    private static String str = null;
    private static String PublicKey = null, PrivateKey = null;

    public RSADemo() {
    }

    /**
     * 给你的明文套上箱子或者拿下箱子。只不过现在没有上锁也没有解锁。
     *
     * @param STR        要给小丽的信
     * @param publicKey  公钥（解密用）
     * @param privateKey 私钥 （加密用）
     */
    public RSADemo(String STR, String publicKey, String privateKey) {
//        str = STR;
        PublicKey = publicKey;
        PrivateKey = privateKey;
    }

    /**
     * 创建一个钥匙对。公钥给小丽用来解密，私钥给自己用来加密。
     *
     * @param keySize 秘钥的长度。应是64的倍数。
     * @return 带公钥和私钥Map->HashMap。
     * @throws NoSuchAlgorithmException
     * @throws MyException
     */
    public final Map<String, String> createKeys(int keySize) throws NoSuchAlgorithmException,
            MyException {
        if (keySize % 64 != 0) throw new MyException(100, "秘钥长度应是64的倍数！");
        KeyPairGenerator kpg = KeyPairGenerator.getInstance(ALGORITHM);
        kpg.initialize(keySize);
        KeyPair keypair = kpg.generateKeyPair();
        Key publicKey = keypair.getPublic();
        String publicKeySTR = Base64.encodeBase64URLSafeString(publicKey.getEncoded());
        Key privateKey = keypair.getPrivate();
        String privateKeySTR = Base64.encodeBase64URLSafeString(privateKey.getEncoded());
        Map<String, String> map = new HashMap<>();
        map.put("publicKey", publicKeySTR);
        map.put("privateKey", privateKeySTR);
        return map;
    }

    private RSAPublicKey getPublicKey(String publicKey) throws NoSuchAlgorithmException,
            InvalidKeySpecException {
        KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(Base64.decodeBase64(publicKey));
        RSAPublicKey key = (RSAPublicKey) keyFactory.generatePublic(x509KeySpec);
        return key;
    }

    private RSAPrivateKey getPrivateKey(String privateKey) throws NoSuchAlgorithmException,
            InvalidKeySpecException {
        KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(Base64.decodeBase64(privateKey));
        RSAPrivateKey key = (RSAPrivateKey) keyFactory.generatePrivate(pkcs8KeySpec);
        return key;
    }

    /**
     * 小明给箱子上锁。
     *
     * @return 正常则成功上锁，否则锁不上。
     * @throws MyException
     * @throws Exception
     */
    public String Encrypt(String content) throws MyException,
            Exception {
        if (PrivateKey.length() == 0 || PrivateKey == null) throw new MyException(101, "私钥为空");
        RSAPrivateKey privateKey = getPrivateKey(PrivateKey);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        return Base64.encodeBase64String(cipher.doFinal(content.getBytes()));
    }

    /**
     * 小丽给箱子解锁。
     *
     * @return 正常则成功解锁，否则解不了。
     * @throws MyException
     * @throws Exception
     */
    public String Decrypt(String content) throws MyException,
            Exception {
        if (PublicKey.length() == 0 || PublicKey == null) throw new MyException(102, "公钥为空");
        Cipher cipher = Cipher.getInstance(ALGORITHM);
//        byte[] encryptding = new Base64().decode(str.getBytes());
        byte[] encryptding = new Base64().decode(content.getBytes());
        RSAPublicKey publickey = getPublicKey(PublicKey);
        cipher.init(Cipher.DECRYPT_MODE, publickey);
        return new String(cipher.doFinal(encryptding));
    }

    public static void main(String[] args) {
        try {
            Logger logger = LoggerFactory.getLogger(Slf4jAndLog4j2Demo.class);
            RSADemo rsaDemo = new RSADemo();
            Map<String, String> map = rsaDemo.createKeys(1024);
            PublicKey = map.get("publicKey");
            PrivateKey = map.get("privateKey");
            logger.info("public key:{},privateKey:{}", PublicKey, PrivateKey);
            String str1 = rsaDemo.Encrypt("今晚一起吃饭，好吗？");
            logger.info("加密后得到str1:{}", str1);
            String str2 = rsaDemo.Decrypt(str1);
            logger.info("解密后得到str1:{}", str2);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
