
public class Main2 {

	public static void main(String[] args) {
		
			Laptop2 Asus = new Laptop2();
			
			Asus.setColour("Silver");
			Asus.setBrand("Asus");
			Asus.setStorage(65.0);
			Asus.setWeight(2.0);
			
			System.out.println(" Asus ");
			System.out.println("Colour: " + Asus.getColour());
			System.out.println("Brand: " + Asus.getBrand());
			System.out.println("Storage: " + Asus.getStorage() + "gb");
			System.out.println("Weight: " + Asus.getWeight() +"kg");
			
			
			Laptop2 Lenovo = new Laptop2();
			
			Lenovo.setColour("Black");
			Lenovo.setBrand("Lenovo");
			Lenovo.setStorage(45.0);
			Lenovo.setWeight(2.5);
			
			System.out.println(" Lenovo ");
			System.out.println("Colour: " + Lenovo.getColour());
			System.out.println("Brand: " + Lenovo.getBrand());
			System.out.println("Storage: " + Lenovo.getStorage() + "gb");
			System.out.println("Weight: " + Lenovo.getWeight() +"kg");

	}

}
