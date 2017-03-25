package com.profileSystems.psNiagaraDriver.PSAPI;

import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

import javax.baja.util.Array;

/**
 * @author wzhou
 * 
 *         API Communication protocol utility class
 * 
 */
public final class BPsUtility {

	// Bytes XXXX XXXX XXXXXXXX XXXX
	// Format Start Length Data End

	public static final int PACKET_START_MAGIC = 0x02;
	public static final int PACKET_END_MAGIC = 0x04;

	/**
	 * Encode data string to byte array
	 * 
	 * @param stringValue
	 * @return
	 * @throws BPsException
	 */
	public static final byte[] Encode(String stringValue) throws BPsException {
		try {
			return BPsConverter.Concat(
					BPsConverter.ToByteArray(PACKET_START_MAGIC),
					BPsConverter.ToByteArray(stringValue.length()),
					BPsConverter.ToByteArray(stringValue),
					BPsConverter.ToByteArray(PACKET_END_MAGIC));
		} catch (UnsupportedEncodingException e) {
			throw new BPsException("Encode failed: ." + e.getMessage());
		}
	}

	/**
	 * Encode data string to byte array
	 * 
	 * @param stringValue
	 * @return
	 * @throws BPsException
	 */
	public static final byte[] Encode(int unitAddress, String payload)
			throws BPsException {
		return Encode("" + unitAddress +"|" +payload);
	}

	/**
	 * Decode byte array data to string
	 * 
	 * @param byteArray
	 * @return
	 * @throws BPsException
	 */
	public static final String Decode(byte[] byteArray) throws BPsException {
		if (byteArray.length <= 12) // magic start 4 + end 4 + length 4
		{
			throw new BPsException("Decode failed: invalid length.");
		}

		int magicStart = BPsConverter.ToInt(byteArray, 0);
		int magicEnd = BPsConverter.ToInt(byteArray, byteArray.length - 4);
		if (magicStart != PACKET_START_MAGIC || magicEnd != PACKET_END_MAGIC) {
			throw new BPsException("Decode failed: invalid data.");
		}

		int length = BPsConverter.ToInt(byteArray, 4);
		if ((length + 12) != byteArray.length) {
			throw new BPsException("Decode failed: invalid data.");
		}

		return BPsConverter.ToString(byteArray, 8, length);
	}

	/**
	 * validate package
	 * 
	 * @param byteArray
	 * @return
	 */
	public static final boolean Validate(byte[] byteArray) {
		if (byteArray.length <= 12) // magic start 4 + end 4 + length 4
			return false;

		int magicStart = BPsConverter.ToInt(byteArray, 0);

		if (magicStart != PACKET_START_MAGIC)
			return false;

		int magicEnd = BPsConverter.ToInt(byteArray, byteArray.length - 4);
		if (magicEnd != PACKET_END_MAGIC)
			return false;

		int length = BPsConverter.ToInt(byteArray, 4);
		if ((length + 12) != byteArray.length)
			return false;

		return true;
	}

	/**
	 * validate package
	 * 
	 * @param byteArray
	 * @return
	 */
	public static final boolean isStartOfFrame(byte[] byteArray) {
		if (byteArray.length < 4) // magic start 4
			return false;

		int magicStart = BPsConverter.ToInt(byteArray, 0);

		return magicStart == PACKET_START_MAGIC;
	}

	
	public static String join(Array s, String delimiter) {

		if (s == null || s.isEmpty())
			return "";

		String builder = s.get(0).toString();
		for (int i = 1; i < s.size(); i++) {
			builder += (delimiter);
			builder += s.get(i).toString();
		}
		return builder;
	}

  public static String[] splitString(String stringValue, String delimiter) {

		int numValues = 0;
		StringTokenizer t = new StringTokenizer(stringValue, delimiter);
		while (t.hasMoreTokens()) {
			numValues = numValues + 1;
			// Consumes the token to allow us to loop to the next one
			t.nextToken();
		}
		String[] splits = new String[numValues];
		int offset = 0;
		// Loops again through all of the substrings that are between commas
		// In the comma delimited string
		t = new StringTokenizer(stringValue, delimiter);
		while (t.hasMoreTokens()) {
			splits[offset] = t.nextToken();
			offset = offset + 1;
		}

		return splits;
	}
	
}
