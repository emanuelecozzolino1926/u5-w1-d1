package emanuelecozzolino.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Drink extends MenuItem {
	public Drink(String name, int calories, double price) {
		super(name, calories, price);
	}
}
