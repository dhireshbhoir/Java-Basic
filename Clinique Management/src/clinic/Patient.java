/*
  file name:Patient.java
  Created by:Dhiresh Bhoir
  Create Date:-20-10-2016
  Purpose:To set and get all the Patient Related details 
*/
package clinic;

public class Patient
{
	private String patientName;
	private int patientId;
	private long mobileNo;
	private int patientAge;
	
	
	public String getPatientName()
	{
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
}