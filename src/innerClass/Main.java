package innerClass;

public class Main {
	
	public static void main(String[] args){
		Gearbox mcLaren = new Gearbox(5);
		Gearbox.Gear firstGear = mcLaren.new Gear(1, 14.3);
		System.out.println(firstGear.driveSpeed(1000));
	}

}
