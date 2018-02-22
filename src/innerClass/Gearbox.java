package innerClass;

import java.util.*;

public class Gearbox {
	
	private ArrayList<Gear> gears;
	private int maxGears;
	private int currentGear = 0;
	private boolean clutchIsIn;
	
	public Gearbox(int maxGears){
		this.maxGears = maxGears;
		this.gears = new ArrayList<Gear>();
		Gear neutral = new Gear(0, 0.0);
		this.gears.add(neutral);
		
		for(int i=0; i<maxGears; i++){
			addGear(i, i*5.3);
		}
	}
	
	public void operatingClutch(boolean in){
		this.clutchIsIn = in;
	}
	
	private void addGear(int gearNumber, double ratio){
		if(gearNumber >0  && gearNumber <= maxGears){
			this.gears.add(new Gear (gearNumber, ratio));
		}
	}
	
	public void changeGear(int newGear){
		if(newGear >= 0 && (newGear < this.gears.size() && this.clutchIsIn)){
			this.currentGear = newGear;
			System.out.println("The gear " + newGear + " has been selected");
		}else{
			System.out.println("Grind!");
		}
	}
	
	public double wheelSpeed(int revs){
		if(clutchIsIn){
			System.out.println("The car is not accelerating");
			return 0.0;
		}else{
			return revs*gears.get(currentGear).getRatio();
		}
	}
	
	private class Gear {
		private int gearNumber;
		private double ratio;
		
		public Gear(int gearNumber, double ratio){
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}
		
		public double getRatio(){
			return ratio;
		}
	}
}
