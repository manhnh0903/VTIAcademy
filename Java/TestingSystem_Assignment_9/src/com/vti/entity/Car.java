package com.vti.entity;

public class Car {

	private String name;
	private String type;
	private Engine engine;
	
	public class Engine{
		String engineType;
		
		public Engine(String engineType) {
			super();
			this.engineType = engineType;
		}

		public String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
}
	