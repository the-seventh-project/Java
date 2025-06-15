package Week4;

public class Animal {
	
	public String name;
	public double expectancy;
	public String type;
	
	public Animal (String name, double expectancy, String type) {
		this.name=name;
		this.expectancy=expectancy;
		this.type=type;
		
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}

	public double getExpectancy() {
		return expectancy;
	}

	public void setExpectancy(double expectancy) {
		this.expectancy = expectancy;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String printName () {
		return name;
	}
    
	public double printExpectancy () {
		return expectancy;
	}
	
	public String printType () {
		return type;
	}
}
