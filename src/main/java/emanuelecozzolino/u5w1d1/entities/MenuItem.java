package emanuelecozzolino.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class MenuItem {
	private String name;
	private int calories;
	private double price;
}
