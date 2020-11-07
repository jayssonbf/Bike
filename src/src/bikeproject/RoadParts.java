package src.bikeproject;

public interface RoadParts {
  public final BikeUses TERRAIN = BikeUses.track;

  public int getTyreWidth();
  public void setTyreWidth(int newValue);
  public int getPostHeight();
  public void setPostHeight(int newValue);
}
