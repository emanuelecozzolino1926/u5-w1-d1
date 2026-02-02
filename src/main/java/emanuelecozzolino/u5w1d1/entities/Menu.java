package emanuelecozzolino.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Menu {
	private List<Pizza> pizzas;
	private List<Topping> toppings;
	private List<Drink> drinks;

	public void print() {
		System.out.println("Pizzas                                                  Calories   Price");
		for (Pizza p : pizzas) {
			System.out.println(p + "   " + p.getCalories() + "       " + p.getPrice());
		}

		System.out.println();
		System.out.println("Toppings                                                Calories   Price");
		for (Topping t : toppings) {
			System.out.println(t.getName() + "   " + t.getCalories() + "       " + t.getPrice());
		}

		System.out.println();
		System.out.println("Drinks                                                  Calories   Price");
		for (Drink d : drinks) {
			System.out.println(d.getName() + "   " + d.getCalories() + "       " + d.getPrice());
		}
	}
}
