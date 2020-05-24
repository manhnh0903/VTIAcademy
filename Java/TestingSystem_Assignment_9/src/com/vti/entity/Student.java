package com.vti.entity;

public class Student {

	private int id ;
	private String name;
	public static int auto_increment = 1;
	ScannerUtils scannerUtils;
	
	public Student() {
		super();
	}
	
	public Student(String name) {
		this.id = auto_increment ++;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @deprecated đừng dùng hàm này nữa, cũ rồi. Dùng cái này này {@link #getId2()}
	 */
	
	@Deprecated
	public int getId() {
		return id ;
	}
	public String getId2() {
		String result = "MSV " + id;
		return result;
	}
	
	
	
	
}
