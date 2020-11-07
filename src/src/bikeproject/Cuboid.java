package src.bikeproject;

public class Cuboid <T>{

  private T length;
  private T breadth;
  private T height;

  public Cuboid( T length, T breadth, T height ) {
    this.length = length;
    this.breadth = breadth;
    this.height = height;
  }

  public double getVolume(double l, double b, double h){
    return (l * b * h);
  }

  //Accesors and Mutators
  public T getLength( ) {
    return length;
  }

  public void setLength( T length ) {
    this.length = length;
  }

  public T getBreadth( ) {
    return breadth;
  }

  public void setBreadth( T breadth ) {
    this.breadth = breadth;
  }

  public T getHeight( ) {
    return height;
  }

  public void setHeight( T height ) {
    this.height = height;
  }

  @Override
  public String toString( ) {
    return
        "Length = " + length + "\n" +
        "Breadth = " + breadth + "\n" +
        "Height = " + height;
  }
}
