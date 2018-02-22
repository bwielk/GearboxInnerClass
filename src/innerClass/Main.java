package innerClass;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Button button = new Button("Print");
	
	public static void main(String[] args){
		//Gearbox example
		Gearbox mcLaren = new Gearbox(5);
		mcLaren.operatingClutch(true);
		mcLaren.changeGear(1);
		mcLaren.operatingClutch(false);
		System.out.println(mcLaren.wheelSpeed(1000));
		mcLaren.changeGear(2);
		System.out.println(mcLaren.wheelSpeed(3000));
		mcLaren.operatingClutch(true);
		mcLaren.changeGear(3);
		mcLaren.operatingClutch(false);
		System.out.println(mcLaren.wheelSpeed(1000));
		System.out.println("/////////////////////////////////");
		//Button example
		
	}

}
