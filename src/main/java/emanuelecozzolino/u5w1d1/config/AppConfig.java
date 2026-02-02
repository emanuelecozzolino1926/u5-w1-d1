package emanuelecozzolino.u5w1d1.config;

import emanuelecozzolino.u5w1d1.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {

	// ************************* TOPPINGS *************************

	@Bean
	public Topping tomato() {
		return new Topping("tomato", 18, 0.00);
	}

	@Bean
	public Topping cheese() {
		return new Topping("cheese", 92, 0.69);
	}

	@Bean
	public Topping ham() {
		return new Topping("ham", 35, 0.99);
	}

	@Bean
	public Topping pineapple() {
		return new Topping("pineapple", 24, 0.79);
	}

	@Bean
	public Topping salami() {
		return new Topping("salami", 86, 0.99);
	}

	@Bean
	public Topping onions() {
		return new Topping("onions", 22, 0.69);
	}

	// ************************* PIZZAS *************************

	@Bean
	public Pizza margherita() {
		return new Pizza("Pizza Margherita", 1104, 4.99, List.of(tomato(), cheese()));
	}

	@Bean
	public Pizza hawaiian() {
		return new Pizza("Hawaiian Pizza", 1024, 6.49, List.of(tomato(), cheese(), ham(), pineapple()));
	}

	@Bean
	public Pizza salamiPizza() {
		return new Pizza("Salami Pizza", 1160, 5.99, List.of(tomato(), cheese(), salami()));
	}

	// ************************* PIZZAS XL (Opzionale) *************************

	@Bean
	public Pizza margheritaXL() {
		return new Pizza("Pizza Margherita", 1104, 4.99, List.of(tomato(), cheese()), PizzaSize.XL);
	}

	@Bean
	public Pizza hawaiianXL() {
		return new Pizza("Hawaiian Pizza", 1024, 6.49, List.of(tomato(), cheese(), ham(), pineapple()), PizzaSize.XL);
	}

	// ************************* DRINKS *************************

	@Bean
	public Drink lemonade() {
		return new Drink("Lemonade (0.33l)", 128, 1.29);
	}

	@Bean
	public Drink water() {
		return new Drink("Water (0.5l)", 0, 1.29);
	}

	@Bean
	public Drink wine() {
		return new Drink("Wine (0.75l, 13%)", 607, 7.49);
	}

	// ************************* MENU *************************

	@Bean
	public Menu menu() {
		return new Menu(
				List.of(margherita(), hawaiian(), salamiPizza(), margheritaXL(), hawaiianXL()),
				List.of(cheese(), ham(), onions(), pineapple(), salami()),
				List.of(lemonade(), water(), wine())
		);
	}
}
