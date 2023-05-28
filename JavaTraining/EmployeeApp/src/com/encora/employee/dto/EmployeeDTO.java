package com.encora.employee.dto;

public class EmployeeDTO {
	private String employeeId;
	private String employeeName;
	private String select;
	private boolean pf;
	private boolean nps;
	private boolean gradutiy;
	private boolean mealCard;
	private boolean mediClaim;
	private String officeLocation;
	private String address;
	private String salary;

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public boolean isPf() {
		return pf;
	}

	public void setPf(boolean pf) {
		this.pf = pf;
	}

	public boolean isNps() {
		return nps;
	}

	public void setNps(boolean nps) {
		this.nps = nps;
	}

	public boolean isGradutiy() {
		return gradutiy;
	}

	public void setGradutiy(boolean gradutiy) {
		this.gradutiy = gradutiy;
	}

	public boolean isMealCard() {
		return mealCard;
	}

	public void setMealCard(boolean mealCard) {
		this.mealCard = mealCard;
	}

	public boolean isMediClaim() {
		return mediClaim;
	}

	public void setMediClaim(boolean mediClaim) {
		this.mediClaim = mediClaim;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", select=" + select
				+ ", pf=" + pf + ", nps=" + nps + ", gradutiy=" + gradutiy + ", mealCard=" + mealCard + ", mediClaim="
				+ mediClaim + ", officeLocation=" + officeLocation + ", address=" + address + "]";
	}

}
