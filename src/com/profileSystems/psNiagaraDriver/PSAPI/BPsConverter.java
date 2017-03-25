package com.profileSystems.psNiagaraDriver.PSAPI;

import java.io.UnsupportedEncodingException;

//import org.apache.commons.codec.binary.Base64;

/**
 * @author wzhou Converter utility class
 */
public final class BPsConverter {

	/**
	 * @param value
	 * @return
	 */
	public static byte[] ToByteArray(int value) {
		return new byte[] {
		        (byte) (value >> 24),
		        (byte) (value >> 16),
		        (byte) (value >> 8),
		        (byte) value};
	}

	/**
	 * @param byteArray
	 * @return
	 */
	public static int ToInt(byte[] byteArray) {
		return byteArray[0] << 24 | (byteArray[1] & 0xFF) << 16
				| (byteArray[2] & 0xFF) << 8 | (byteArray[3] & 0xFF);
	}

	/**
	 * @param byteArray
	 * @return
	 */
	public static int ToInt(byte[] byteArray, int startIndex) {
		return byteArray[startIndex+0] << 24 | (byteArray[startIndex+1] & 0xFF) << 16
				| (byteArray[startIndex+2] & 0xFF) << 8 | (byteArray[startIndex+3] & 0xFF);
	}

	/**
	 * @param stringValue
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static byte[] ToByteArray(String stringValue)
			throws UnsupportedEncodingException {
		return stringValue.getBytes("US-ASCII");
	}

	/**
	 * @param ba
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String ToString(byte[] ba)
			throws UnsupportedEncodingException {
		return new String(ba, "US-ASCII");
	}

	/**
	 * @param ba
	 * @return
	 */
	public static String ToString(byte[] b, int startIndex, int count) {

		String result = "";
		count += startIndex;
		while (startIndex < count) {
			result += (char) b[startIndex];
			startIndex++;
		}
		return result;
	}

		/**
	 * @param arrays
	 * @return
	 */
	public static byte[] Concat(byte[] array1, byte[] array2) {
		// Determine the length of the result array
		int totalLength = array1.length + array2.length;

		// create the result array
		byte[] result = new byte[totalLength];

		System.arraycopy(array1, 0, result, 0, array1.length);
		System.arraycopy(array2, 0, result, array1.length, array2.length);

		return result;
	}

	/**
	 * @param arrays
	 * @return
	 */
	public static byte[] Concat(byte[] array1, byte[] array2, byte[] array3,
			byte[] array4) {
		// Determine the length of the result array
		int totalLength = array1.length + array2.length + array3.length
				+ array4.length;

		// create the result array
		byte[] result = new byte[totalLength];

		int currentPos = 0;
		System.arraycopy(array1, 0, result, currentPos, array1.length);

		currentPos += array1.length;
		System.arraycopy(array2, 0, result, currentPos, array2.length);

		currentPos += array2.length;
		System.arraycopy(array3, 0, result, currentPos, array3.length);

		currentPos += array3.length;
		System.arraycopy(array4, 0, result, currentPos, array4.length);

		return result;
	}
	
	public static byte[] GetFrameCopy(byte[] frameBytes, int frameSize)
	{
		
		byte[] bFrameCopy = new byte[frameSize];
		System.arraycopy(frameBytes, 0, bFrameCopy, 0, frameSize);
		return bFrameCopy;
		
	}
}
