
public class Boba extends Drink {

	private String topping;

	public Boba(String type, String name, String temprature, Integer sugar, Integer basePrice, String topping) {
		super(type, name, temprature, sugar, basePrice);
		this.topping = topping;
		this.setFinalPrice(getFinalPrice());
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}
	
	public Integer getToppingPrice(String topping) {
		if (getTopping().equals("Pearl")) {
			return 3000;
		}else if (getTopping().equals("Grass Jelly")) {
			return 4000;
		}else if (getTopping().equals("Coffee Jelly")) {
			return 5000;
		}else {
			return null;
		}
	}
	
	public Integer getFinalPrice() {
		return getBasePrice() + getToppingPrice(getTopping());
	}

	@Override
	public void printDrink() {
		// TODO Auto-generated method stub
		System.out.println("========================");
		System.out.println("Type: Boba");
		System.out.println("Name: " + getName());
		System.out.println("Sugar: " + getSugar());
		System.out.println("Price: " + getFinalPrice());
		System.out.println("Temperature: " + getTemprature());
		System.out.println("Topping: " + getTopping());	
		System.out.println("========================");
		System.out.println();
		System.out.println();
	}

}
