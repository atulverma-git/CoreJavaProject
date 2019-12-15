package com.dao;

public class Employee {
	
	private int id;
	private String lName;
	private String fName;
	private int phoneNo;
	private String city;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the phoneNo
	 */
	public int getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", lName=" + lName + ", fName=" + fName + ", phoneNo=" + phoneNo + ", city="
				+ city + "]";
	}
	*/
}
