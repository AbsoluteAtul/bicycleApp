
public class Bicycle {
	public static int cadence = 0;
	public static int gear = 0;
	public static int speed = 0;
	
	public  void changeCadence()
	{
		cadence = cadence + 5;
		System.out.println("Cadence has been changed");
	}
	
	public void changeGear()
	{
		
		gear++;
		System.out.println("Gear has been changed");
	}
	public void speedUp()
	{
		speed = speed +10;
		System.out.println("Speed has been changed");
	}
	public void applyBrakes()
	{
		cadence = 0;
		speed = 0;
		System.out.println("Brakes have been applied");
	}
	public void printStates()
	{
		System.out.println("Cadence= "+cadence+"\nSpeed= "+ speed + "\nGear= "+ gear);
	}

	
}
