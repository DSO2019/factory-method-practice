package test;

import main.java.mx.iteso.Cone;
import main.java.mx.iteso.stores.MilkStore;
import main.java.mx.iteso.stores.WaterStore;
import main.java.mx.iteso.stores.YoghurtStore;

public class IceCreamTestDrive {

	public static void main(String[] args) {
		MilkStore milkStore = new MilkStore();
		WaterStore waterStore = new WaterStore();
		YoghurtStore yoghurtStore = new YoghurtStore();
		
		Cone cone = milkStore.prepareCone("Mango");
		
		System.out.println("First cone is: " + cone.iceCream.name);
		System.out.println();
		System.out.println();
		
		cone = waterStore.prepareCone("Strawberry");
		
		System.out.println("Second cone is: " + cone.iceCream.name);
		System.out.println();
		System.out.println();
		
		cone = yoghurtStore.prepareCone("Guava");
		System.out.println("Third cone is: " + cone.iceCream.name);
		System.out.println();
		System.out.println();
		
		cone = waterStore.prepareCone("Pineapple");
		System.out.println("Fourth cone is: " + cone.iceCream.name);
		System.out.println();
		System.out.println();	
		

	}

}
