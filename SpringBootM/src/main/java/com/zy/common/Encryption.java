package com.zy.common;

import org.apache.tomcat.util.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

public class Encryption {
    public String encryptionMethon(String passWord){
        String enPassWord;
        try{
            byte[] encodeBase64 = Base64.encodeBase64(passWord.getBytes("UTF-8"));
            enPassWord = encodeBase64.toString();
        } catch(UnsupportedEncodingException e){
            e.printStackTrace();
            enPassWord = "";
            return enPassWord;
        }
        return enPassWord;
    }
}
