package com.vti.entity;

import java.util.Random;

public class PositionUtil {

	public static Position getRandomPosition(int max) {
		Position[] positions = getPositions();
		
		// Lay chi so cua mot phan tu bat ky
		Random random = new Random();
		int i = random.nextInt(max); // 0..5
		
		// Tra ve phan tu co stt i trong Array Department
		return positions[i];
	}
	
	public static Position[] getPositions() {
		Position[] positions = new Position[4];
		
		positions[0] = new Position();
		positions[0].positionID = 1;
		positions[0].positionName = "Dev";

		positions[1] = new Position();
		positions[1].positionID = 2;
		positions[1].positionName = "Test";

		positions[2] = new Position();
		positions[2].positionID = 3;
		positions[2].positionName = "Scrum Master";

		positions[3] = new Position();
		positions[3].positionID = 4;
		positions[3].positionName = "PM";
		
		return positions;
	}
}
