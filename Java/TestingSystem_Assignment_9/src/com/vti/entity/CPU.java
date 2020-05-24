package com.vti.entity;

public class CPU {

	private float price;
//	private Processor processor;
//	private Ram ram;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

//	public Processor getProcessor() {
//		return processor;
//	}
//
//	public void setProcessor(Processor processor) {
//		this.processor = processor;
//	}
//
//	public Ram getRam() {
//		return ram;
//	}
//
//	public void setRam(Ram ram) {
//		this.ram = ram;
//	}

	public class Processor {
		float coreAmount;
		float menufacturer;

		public float getCache() {

			return 4.3f;
		}
	}

	public class Ram {
		float memory;
		float menufacturer;

		public float getClockSpeed() {

			return 5.5f;
		}
	}
}
