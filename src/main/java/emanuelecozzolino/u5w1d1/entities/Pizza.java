package emanuelecozzolino.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pizza extends MenuItem {
	private List<Topping> toppings;
	private PizzaSize size;

	public Pizza(String name, int calories, double price, List<Topping> toppings) {
		super(name, calories, price);
		this.toppings = toppings;
		this.size = PizzaSize.REGULAR;
	}

	public Pizza(String name, int calories, double price, List<Topping> toppings, PizzaSize size) {
		super(name, calories, price);
		this.toppings = toppings;
		this.size = size;
		if (size == PizzaSize.XL) {
			setCalories((int) (calories * 1.5));
			setPrice(price + 3.00);
		}
	}

	public String getToppingNames() {
		String result = "";
		for (int i = 0; i < toppings.size(); i++) {
			result += toppings.get(i).getName();
			if (i < toppings.size() - 1) {
				result += ", ";
			}
		}
		return result;
	}

	@Override
	public String toString() {
		String sizeLabel = size == PizzaSize.XL ? " XL" : "";
		return getName() + sizeLabel + " (" + getToppingNames() + ")";
	}
}
