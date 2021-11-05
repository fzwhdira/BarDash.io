
public abstract class Drink {

	private String type;
	private String name;
	private String temprature;
	
	private Integer sugar;
	private Integer basePrice;
	private Integer finalPrice;
	
	public Drink(String type, String name, String temprature, Integer sugar, Integer basePrice) {
		super();
		this.type = type;
		this.name = name;
		this.temprature = temprature;
		this.sugar = sugar;
		this.basePrice = basePrice;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemprature() {
		return temprature;
	}

	public void setTemprature(String temprature) {
		this.temprature = temprature;
	}

	public Integer getSugar() {
		return sugar;
	}

	public void setSugar(Integer sugar) {
		this.sugar = sugar;
	}

	public Integer getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Integer basePrice) {
		this.basePrice = basePrice;
	}

	public Integer getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Integer finalPrice) {
		this.finalPrice = finalPrice;
	}

	public abstract void printDrink();
}
