package src.bikeproject;

public class MountainBike extends Bike implements MountainParts{

	private String suspension, type;
	private int frameSize;
	
	public MountainBike()
	{
		this("Bull Horn", "Hardtail", "Maxxis", "dropper", 27, "RockShox XC32", "Pro", 19);
	}//end constructor
	
    public MountainBike(String handleBars, String frame, String tyres, String seatType, int numGears, 
    		            String suspension, String type, int frameSize) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.suspension = suspension;
		this.type = type;
		this.frameSize = frameSize;
	}//end constructor

	@Override
	public String toString( ) {
		return super.toString() + "\nThis mountain bike is a " + this.type + " bike and has a " + this.suspension +
						" suspension and a frame size of " + this.frameSize + "inches." + "\nThis bike is best for " + BikeUses.off_road;
	}

	@Override
	public void setSuspension( String name ) {
		suspension = name;
	}

	@Override
	public String getSuspension( ) {
		return suspension;
	}

	@Override
	public void setType( String newValue ) {
		type = newValue;
	}

	@Override
	public String getType( ) {
		return type;
	}
}//end class MountainBike

