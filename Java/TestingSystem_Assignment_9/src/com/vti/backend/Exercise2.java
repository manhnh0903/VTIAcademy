package com.vti.backend;

import java.util.Date;

import com.vti.entity.Student;

public class Exercise2 {

	// question1

	@SuppressWarnings("deprecation")
	public void question1() {
		Date date = new Date(2020, 05, 18);
		System.out.println(date);
	}

	// question2
	/**
	 * 
	 */

	@SuppressWarnings("deprecation")
	public void question2() {
		Student student = new Student("Nguyễn Văn A");
		System.out.println("name: " + student.getName());
		System.out.println("id cu: " + student.getId());
		System.out.println("id moi: " + student.getId2());
		
		Student student2 = new Student("Nguyễn Văn B");
		System.out.println("name: " + student2.getName());
		System.out.println("id cu: " + student2.getId());
		System.out.println("id moi: " + student2.getId2());
	}
}