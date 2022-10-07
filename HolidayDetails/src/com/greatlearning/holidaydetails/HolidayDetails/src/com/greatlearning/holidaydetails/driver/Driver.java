package com.greatlearning.holidaydetails.driver;

import com.greatlearning.holidaydetails.model.SuperDepartment;
import com.greatlearning.holidaydetails.model.HrDepartment;
import com.greatlearning.holidaydetails.model.TechDepartment;
import com.greatlearning.holidaydetails.model.AdminDepartment;

public class Driver {

	public static void main(String[] args) {

		SuperDepartment superdept = new SuperDepartment();		
		System.out.println(superdept.departmentName());
		System.out.println(superdept.getTodaysWork());		
		System.out.println(superdept.getWorkDeadline());		
		System.out.println(superdept.isTodayAHoliday() + "\n");

		HrDepartment hrdept = new HrDepartment();		
		System.out.println(hrdept.departmentName());		
		System.out.println(hrdept.getTodaysWork());		
		System.out.println(hrdept.getWorkDeadline());		
		System.out.println(hrdept.doActivity());
		System.out.println(superdept.isTodayAHoliday() + "\n");

		TechDepartment techdept = new TechDepartment();		
		System.out.println(techdept.departmentName());		
		System.out.println(techdept.getTodaysWork());		
		System.out.println(techdept.getWorkDeadline());		
		System.out.println(techdept.getTechStackInformation());
		System.out.println(superdept.isTodayAHoliday() + "\n");

		AdminDepartment admindept = new AdminDepartment();		
		System.out.println(admindept.departmentName());				
		System.out.println(admindept.getTodaysWork());		
		System.out.println(admindept.getWorkDeadline());
		System.out.println(superdept.isTodayAHoliday() + "\n");

	}

}
