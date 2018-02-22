package innerClass;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Button buttonPrint = new Button("Print");
	
	public static void main(String[] args){
		//Local inner class example
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
		
		//Nested interface example
		
		class ClickListener implements Button.OnClickListener {
			
			public ClickListener(){
				System.out.println("Button's attached");
			}
			
			public void onClick(String title){
				System.out.println(title + " has been clicked");
			}
		}
		
		buttonPrint.setOnClickListener(new ClickListener());
		listen(buttonPrint.getTitle());
		System.out.println("/////////////////////////////////");
		
		//Anonymous class example
		
		buttonPrint.setOnClickListener(new Button.OnClickListener() {
			
			public void onClick(String title) {
				System.out.println(title + " has been pushed");
				
			}
		});
		listen(buttonPrint.getTitle());
	}
	
	private static void listen(String title){
		boolean quit = false;
		while(!quit){
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice){
			case 0:
				System.out.println(title + " has been unclicked");
				quit = true;
				break;
			case 1:
				buttonPrint.onClick();
				break;
			}
		}
	}
}