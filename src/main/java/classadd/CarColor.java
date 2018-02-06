package classadd;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car_color")
public class CarColor extends BaseEntity {

	
	
	@Column(name = "color")
	private String Color;
	
	@OneToMany(mappedBy = "carColor",
 			cascade =CascadeType.ALL) 
 	private List<CarModel> carModel = new ArrayList<>();

	public CarColor() {
		
	}
	
	
	public CarColor(String color) {
		Color = color;
	}


	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "CarColor [Color=" + Color + ", getId()=" + getId() + "]";
	} 
	
	
}
