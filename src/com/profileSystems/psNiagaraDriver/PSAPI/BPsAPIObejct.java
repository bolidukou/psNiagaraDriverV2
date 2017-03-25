package com.profileSystems.psNiagaraDriver.PSAPI;


import javax.baja.sys.Type;
import javax.baja.util.Array;

public class BPsAPIObejct {
	public int UnitAddress;
	public String Payload;
	public Array Parameters;

	public byte[] ToByteArray() throws BPsException {
		String payload = this.toString();
		return BPsUtility.Encode(payload);
	}	
	
	public String toString(){
		return "" + UnitAddress + "|" + Payload + "|"
				+ BPsUtility.join(Parameters, ",");
	}

	public String GetStatusString(Type type){
	  for (int i = 0; i < this.Parameters.size(); i++)
    {
      String[] sValueArray = BPsUtility.splitString(this.Parameters.get(i).toString(), "#");
     
      if (sValueArray.length >= 2)
      {
        if (sValueArray[0].equalsIgnoreCase(type.toString()))
        {
          return sValueArray[1];
        }
      }
    }

    // not found
    return "";
	}
	
	public String GetStatusString(Type type, int slotNo){	  
    for (int i = 0; i < this.Parameters.size(); i++)
    {
      String[] sValueArray = BPsUtility.splitString(this.Parameters.get(i).toString(), "#");
      if (sValueArray.length >= 3)
      {
        if (sValueArray[0].equalsIgnoreCase(type.toString()) && sValueArray[1].equalsIgnoreCase("" + slotNo))
        {          
          return sValueArray[2];
        }
      }
    }

    // not found
    return "";  
  }
	
 	public static boolean Validate(byte[] data) {
		return BPsUtility.Validate(data);
	}

	public static BPsAPIObejct Parse(byte[] data) throws BPsException {

		String requestString = BPsUtility.Decode(data);
		return Parse(requestString);
	}
	
	public static BPsAPIObejct Parse(byte[] data, int datasize) throws BPsException {

		byte[] bFrameCopy = new byte[datasize];
		System.arraycopy(data, 0, bFrameCopy, 0, datasize);		
		return Parse(bFrameCopy);
	}	

	public static BPsAPIObejct Parse(String stringValue) throws BPsException {
		BPsAPIObejct obj = new BPsAPIObejct();
		obj.Parameters = new Array();

		String[] splits = BPsUtility.splitString(stringValue, "|");

		if (splits.length >= 2) {
			obj.UnitAddress = Integer.parseInt(splits[0]);
			obj.Payload = splits[1];

			if (splits.length > 2) {
				String[] params = BPsUtility.splitString(splits[2], ",");
				for (int i = 0; i < params.length; i++)
					obj.Parameters.add(params[i]);
			}
		} else
		{
			throw new BPsException("Decode failed: "+stringValue);
		}
		return obj;
	}	

	
}
