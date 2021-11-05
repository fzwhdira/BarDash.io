
public class Tea extends Drink {

	private Integer teaLeave;

	public Tea(String type, String name, String temprature, Integer sugar, Integer basePrice, Integer teaLeave) {
		super(type, name, temprature, sugar, basePrice);
		this.teaLeave = teaLeave;
		this.setFinalPrice(getFinalPrice());
	}

	public Integer getTeaLeave() {
		return teaLeave;
	}

	public void setTeaLeave(Integer teaLeave) {
		this.teaLeave = teaLeave;
	}
	
	public Integer getFinalPrice() {
		return getBasePrice() + (getTeaLeave()*2000);
	}

	@Override
	public void printDrink() {
		// TODO Auto-generated method stub
		System.out.println("========================");
		System.out.println("Type: Tea");
		System.out.println("Name: " + getName());
		System.out.println("Sugar: " + getSugar());
		System.out.println("Price: " + getFinalPrice());
		System.out.println("Temperature: " + getTemprature());
		System.out.println("Tea Leave Weight: " + getTeaLeave());	
		System.out.println("========================");
		System.out.println();
		System.out.println();
	}

}
