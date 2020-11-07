package src.bikeproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BikeList {

  public static void main( String[] args ) {

    ArrayList<Bike> bikes = new ArrayList<>();

    fillArray(bikes);
    displayStock(bikes);
    displayBikeNumbers(bikes);

  }

  public static void fillArray( ArrayList<Bike> list ) {
    Random rand = new Random();
    int num;

    while(list.size() < 10) {
      num = rand.nextInt(2);
      if (num < 1)
        list.add(new MountainBike());
      else
        list.add(new RoadBike());

    }
  }

  public static void displayStock(ArrayList<Bike> bikes){
    System.out.println("inside displayMethod");
    for (Bike list : bikes){
      System.out.println(list);
    }
  }
  public static int calculateStock(ArrayList<Bike> bikes){
    int bikesSold = 0;
    for (Bike list : bikes){
      if (list instanceof MountainBike)
          bikesSold++;
    }
    return bikesSold;
  }

  public static void displayBikeNumbers(ArrayList<Bike> bikes){
    int mb;
    int rb;

    mb = calculateStock(bikes);
    rb = bikes.size() - calculateStock(bikes);

    System.out.println("Stock Levels");
    System.out.println("We have " + mb + " Mountain Bike in stock");
    System.out.println("We have " + rb + " Road Bike in stock");

  }
}

