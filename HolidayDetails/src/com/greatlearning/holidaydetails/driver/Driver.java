package com.greatlearning.holidaydetails.driver;

import com.greatlearning.holidaydetails.model.SuperDepartment;
import com.greatlearning.holidaydetails.model.HrDepartment;
import com.greatlearning.holidaydetails.model.TechDepartment;
import com.greatlearning.holidaydetails.model.AdminDepartment;

public class Driver {

	public static void main(String[] args) {

		SuperDepartment superdept = new SuperDepartment();
		String superDeptName = superdept.departmentName();
		System.out.println(superDeptName);
		String getTodayswork = superdept.getTodaysWork();
		System.out.println(getTodayswork);
		String getWorkDeadline = superdept.getWorkDeadline();
		System.out.println(getWorkDeadline);
		String isTodayAHoliday = superdept.isTodayAHoliday();
		System.out.println(isTodayAHoliday + "\n");

		HrDepartment hrdept = new HrDepartment();
		String hrDeptName = hrdept.departmentName();
		System.out.println(hrDeptName);
		String gethrdeptwork = hrdept.getTodaysWork();
		System.out.println(gethrdeptwork);
		String gethrdeptDeadline = hrdept.getWorkDeadline();
		System.out.println(gethrdeptDeadline);
		String activity = hrdept.doActivity();
		System.out.println(activity);
		System.out.println(isTodayAHoliday + "\n");

		TechDepartment techdept = new TechDepartment();
		String techDepartmentName = techdept.departmentName();
		System.out.println(techDepartmentName);
		String gettechdeptwork = techdept.getTodaysWork();
		System.out.println(gettechdeptwork);
		String gettechdeptDeadline = techdept.getWorkDeadline();
		System.out.println(gettechdeptDeadline);
		String stackinfo = techdept.getTechStackInformation();
		System.out.println(stackinfo);
		System.out.println(isTodayAHoliday + "\n");

		AdminDepartment admindept = new AdminDepartment();
		String adminDeptName = admindept.departmentName();
		System.out.println(adminDeptName);
		String getwork = admindept.getTodaysWork();
		System.out.println(getwork);
		String getDeadline = admindept.getWorkDeadline();
		System.out.println(getDeadline);
		System.out.println(isTodayAHoliday + "\n");

	}

}
