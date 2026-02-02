package emanuelecozzolino.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Topping extends MenuItem {
	public Topping(String name, int calories, double price) {
		super(name, calories, price);
	}
}
