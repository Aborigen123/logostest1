package classadd;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "car_fuel_type")
public class CarFuelType extends BaseEntity {

	@Column(name = "fuel_type")
	private String FuelType;
	
	@OneToMany(mappedBy = "carFuelType",
 			 cascade = CascadeType.ALL) 
 	private List<CarModel> carModel = new ArrayList<>(); 

	public CarFuelType() {}



	public CarFuelType(String fuelType) {
		FuelType = fuelType;
	}



	public String getFuelType() {
		return FuelType;
	}



	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}



	public List<CarModel> getCarModel() {
		return carModel;
	}



	public void setCarModel(List<CarModel> carModel) {
		this.carModel = carModel;
	}



	@Override
	public String toString() {
		return "CarFuelType [FuelType=" + FuelType + ", getId()=" + getId() + "]";
	}
	
}
