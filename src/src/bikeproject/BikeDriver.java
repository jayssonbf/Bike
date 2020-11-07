package src.bikeproject;

public class BikeDriver {

	public static void main(String[] args) {
		
		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike();
		Bike bike4 = new Bike();

		bike1.setPostHeight(20);
		System.out.println(bike1);
		System.out.println(bike2);
		System.out.println(bike3);
		System.out.println(bike4);

		Cuboid<Double> c1 = new Cuboid<>(1.3, 2.2, 2.0);
		Cuboid<Integer> c2 = new Cuboid<>(1, 2, 3);

		double volume = c1.getVolume(c1.getHeight(), c1.getLength(), c1.getBreadth());
		System.out.printf("Volume = %.2f", volume);



	}//end method main

}//end class BikeDriver
