package com.hr.bean;

public class Package {
	private String SEND_ID;
	private String REC_ID ;
    private static String WEIGHT; 
    private String DESCRIPTION ;
    private static String pack_id;
	public String getSEND_ID() {
		return SEND_ID;
	}
	public void setSEND_ID(String string) {
		SEND_ID = string;
	}
	public String getREC_ID() {
		return REC_ID;
	}
	public void setREC_ID(String string) {
		REC_ID = string;
	}
	public static String getWEIGHT() {
		return WEIGHT;
	}
	public void setWEIGHT(String d) {
		WEIGHT = d;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public static String getPack_id() {
		return pack_id;
	}
	public void setPack_id(String string) {
		Package.pack_id = string;
	}
	
    
}
	