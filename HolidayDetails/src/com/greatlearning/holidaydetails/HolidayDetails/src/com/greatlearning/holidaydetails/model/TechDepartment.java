package com.greatlearning.holidaydetails.model;

public class TechDepartment extends SuperDepartment {

	public String departmentName() {
		String name = "Tech Department";
		return name;
	}

	public String getTodaysWork() {
		String work = "Complete coding of module1";
		return work;
	}

	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}

	public String getTechStackInformation() {
		String stackinfo = "Core Java";
		return stackinfo;
	}

}
