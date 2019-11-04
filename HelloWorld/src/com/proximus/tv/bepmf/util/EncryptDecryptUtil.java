/***************************************************************************
 *  Copyright (C) Belgacom 2017
 *
 *  The reproduction, transmission or use of this document  or its contents
 *  is not  permitted without  prior express written consent of Belgacom.
 *  Offenders will be liable for damages. All rights, including  but not 
 *  limited to rights created by patent grant or registration of a utility
 *  model or design, are reserved.
 *
 *  Belgacom reserves the right to modify technical specifications and features.
 *
 *  Technical specifications and features are binding only in so far as they
 *  are specifically and expressly agreed upon in a written contract.
 *
 **************************************************************************/
package com.proximus.tv.bepmf.util;

import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;




/**
 * This class is used to encrypt/decrypt data with Base64 encoding.
 * 
 * @author Nidhi.Jain
 *
 */
public class EncryptDecryptUtil {
	
	/**
	 * This method is used to encode the given string with Base64 encoding.
	 * 
	 * @param {@unencryptedString
	 * 			String}
	 * @return String
	 */
	public static String encrypt(byte[] unencryptedString) {
		
		String encrptedString = null;
		try {
			encrptedString = Base64.encodeBase64String(unencryptedString);
			

		} catch (Exception e) {
			
		}
		
		return encrptedString;
	}

	/**
	 * This method is used to encode the given string with Base64 encoding.
	 * 
	 * @param {@encryptedString
	 * 			String}
	 * @return String
	 */
	public static String decrypt(String encryptedString) {
		
		String decryptedText = null;
		try {
			byte[] encryptedText = Base64.decodeBase64(encryptedString);
			decryptedText = new String(encryptedText);
			
		} catch (Exception e) {
			
			
		}
	
		return decryptedText;
	}

	/**
	 * This main method implementation is provided to generate auth headers for
	 * testing purpose.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		String encryptedBytes = "";
		if(args.length >1){
			encryptedBytes = encodePassword(args[1]);
		}
		String str = args[0] + ":" + encryptedBytes;
		String encrypted = encrypt(str.getBytes());
		String decrypted = decrypt(encrypted);
		System.out.println("Basic Header : " + encrypted);

	}

	/**
	 * This method is used to encode password using MD5.
	 * 
	 * @param {@password
	 * 			String}
	 * @return String
	 * @throws NoSuchAlgorithmException
	 */
	public static String encodePassword(String password) throws NoSuchAlgorithmException {
	
		byte[] passowrdByteArray = password.getBytes();
		String encodedPassword = DigestUtils.md5Hex(passowrdByteArray);
		return encodedPassword;
	}

}