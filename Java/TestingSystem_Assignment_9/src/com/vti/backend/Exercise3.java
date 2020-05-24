package com.vti.backend;

import com.vti.entity.CPU;
import com.vti.entity.CPU.Processor;
import com.vti.entity.CPU.Ram;
import com.vti.entity.Car;
import com.vti.entity.NgayThangNam;
import com.vti.entity.OuterClass;
import com.vti.entity.NgayThangNam.GioPhutGiay;
import com.vti.entity.OuterClass.InnerClass;

public class Exercise3 {

	//question1
	public void question1() {
		
		CPU cpu = new CPU();
		Processor processor = cpu.new Processor();
		float cache = processor.getCache();
		System.err.println(cache);
		Ram ram = cpu.new Ram();
		float ClockSpeed = ram.getClockSpeed();
		System.out.println(ClockSpeed);
	}
	
	//question2
	public void question2() {
		Car car = new Car("Mazda", "8WD");
		Car.Engine engine = car.new Engine(" Crysler");
		System.out.println("Thông tin của động cơ: " + engine.getEngineType());
	}
	
	//questio3
	public void question3() {
		OuterClass outerClass = new OuterClass();
		outerClass.show();
		
		InnerClass innerClass = outerClass.new InnerClass();
		innerClass.show();
	}
	
	//question4
	public void question4() {
		NgayThangNam date = new NgayThangNam();
		date.ngay = 31;
		date.thang = 10;
		date.nam = 2017;
	
		GioPhutGiay time = date.new GioPhutGiay();
		time.gio = 10;
		time.phut = 15;
		time.giay = 30;
		
		time.xuatThongTin();
	}
	
}
