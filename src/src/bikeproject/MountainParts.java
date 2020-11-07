package src.bikeproject;

public interface MountainParts {
  //Constant declaration
  public final BikeUses TERRAIN = BikeUses.off_road;

  public void setSuspension(String name);
  public String getSuspension();
  public void setType(String newValue);
  public String getType();

}
