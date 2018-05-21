package com.ais.api;

/**
 * @author Jagruthi Prabhudev
 * Encrypt and decrypt the USC-ID
 */
 
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;


public class encryptDecrypt {
  static String IV = "AAAAAAAAAAAAAAAA"; 
  static String encryptionKey = "0123456789abcdef";
  static int Tlength =16;
 
 /**
 Returns the encrypted USC-ID from Student
 **/
  public static byte[] encrypt(Student  s) throws Exception {
	  
	  plaintext = s.getUscId(); 
	  int plength = plaintext.length();
      if(plength < Tlength){
          
          for(int i=0; i < (Tlength-plength);i++){ 
              
              plaintext += "\0";
          }
       plainText = plaintext;
      }
    Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
    SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
    cipher.init(Cipher.ENCRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
    return cipher.doFinal(plainText.getBytes("UTF-8"));
  }
  
 /**
 Returns the decrypted USC-ID from Student
 **/
  public static String decrypt(byte[] cipherText) throws Exception{

    Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
    SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
    cipher.init(Cipher.DECRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
    return new String(cipher.doFinal(cipherText),"UTF-8");
  }
}
