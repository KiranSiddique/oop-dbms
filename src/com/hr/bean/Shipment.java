package com.hr.bean;

import java.util.Date;

public class Shipment {
	private Date  ARRIVAL_DATE ;
	private  Date SHIP_DATE;
	private  static int  pack_id;
	private String  DEST_CITY; 
	private String Send_city ;
	public Date getARRIVAL_DATE() {
		return ARRIVAL_DATE;
	}
	public void setARRIVAL_DATE(Date aRRIVAL_DATE) {
		ARRIVAL_DATE = aRRIVAL_DATE;
	}
	public Date getSHIP_DATE() {
		return SHIP_DATE;
	}
	public void setSHIP_DATE(Date sHIP_DATE) {
		SHIP_DATE = sHIP_DATE;
	}
	public int getPack_id() {
		return pack_id;
	}
	public static void setPack_id(int pac_id) {
		pack_id = pac_id;
	}
	public String getDEST_CITY() {
		return DEST_CITY;
	}
	public void setDEST_CITY(String dEST_CITY) {
		DEST_CITY = dEST_CITY;
	}
	public String getSend_city() {
		return Send_city;
	}
	public void setSend_city(String send_city) {
		Send_city = send_city;
	}
	
	
}
