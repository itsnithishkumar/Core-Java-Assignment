package com.collectionframework7;

public class Parked_CarOwner_Details {
	
	String ownerName;
	String carModel;
	int carNo;
	String ownerMobileNo;
	String ownerAddress;
	public Parked_CarOwner_Details(String ownerName, String carModel, int carNo, String ownerMobileNo,
			String ownerAddress) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public String getOwnerMobileNo() {
		return ownerMobileNo;
	}
	public void setOwnerMobileNo(String ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	
	@Override
	public String toString() {
		return "Parked_Owner_Deatils [Name=" + ownerName + ", carModel=" + carModel + ", carNo=" + carNo + ", MobileNo="
				+ ownerMobileNo + ", Address=" + ownerAddress + "]";
	}

	

}
