package com.greatlearning.holidaydetails.driver;

import com.greatlearning.holidaydetails.model.HrDepartment;
import com.greatlearning.holidaydetails.model.TechDepartment;
import com.greatlearning.holidaydetails.model.AdminDepartment;

public class Driver {

	public static void main(String[] args) {
		AdminDepartment admindept = new AdminDepartment();
		HrDepartment hrdept = new HrDepartment();
		TechDepartment techdept = new TechDepartment();

		System.out.println(admindept.departmentName());
		System.out.println(admindept.getTodaysWork());
		System.out.println(admindept.getWorkDeadline());
		System.out.println(admindept.isTodayAHoliday() + "\n");

		System.out.println(hrdept.departmentName());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.isTodayAHoliday() + "\n");

		System.out.println(techdept.departmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayAHoliday() + "\n");
	}

}
