package classadd;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car_model")
public class CarModel extends BaseEntity{
	@Column(name = "model_title")
	private String ModelTitle;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "engine_capacity_id", nullable = true)	
	private CarEngineCapacity carEngineCapacity;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "fuel_type_id")
	private CarFuelType carFuelType;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "color_id")
	private CarColor carColor;
	
	@OneToOne(mappedBy = "carModel", cascade = CascadeType.ALL)
	private CarMake carMake;
	
	public CarModel() {
		
	}
	

	public CarModel(String modelTitle) {
		ModelTitle = modelTitle;
	}


	public String getModelTitle() {
		return ModelTitle;
	}

	public void setModelTitle(String modelTitle) {
		ModelTitle = modelTitle;
	}

	public CarEngineCapacity getCarEngineCapacity() {
		return carEngineCapacity;
	}

	public void setCarEngineCapacity(CarEngineCapacity carEngineCapacity) {
		this.carEngineCapacity = carEngineCapacity;
	}

	public CarFuelType getCarFuelType() {
		return carFuelType;
	}

	public void setCarFuelType(CarFuelType carFuelType) {
		this.carFuelType = carFuelType;
	}

	public CarColor getCarColor() {
		return carColor;
	}

	public void setCarColor(CarColor carColor) {
		this.carColor = carColor;
	}

	public CarMake getCarMake() {
		return carMake;
	}

	public void setCarMake(CarMake carMake) {
		this.carMake = carMake;
	}


	@Override
	public String toString() {
		return "CarModel [ModelTitle=" + ModelTitle + ", getId()=" + getId() + "]";
	}
	
	
}
