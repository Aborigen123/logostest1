package classadd;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car_engine_capacity")
public class CarEngineCapacity extends BaseEntity{

	@Column(name = "engine_capacity", columnDefinition = "DECIMAL(5, 2)")
	private BigDecimal EngineCapacity;
	
	@OneToOne(mappedBy="carEngineCapacity", cascade = CascadeType.ALL)
	private CarModel carmodel;

	public CarEngineCapacity() {}

	public CarEngineCapacity(BigDecimal engineCapacity) {
		EngineCapacity = engineCapacity;
	}

	public BigDecimal getEngineCapacity() {
		return EngineCapacity;
	}

	public void setEngineCapacity(BigDecimal engineCapacity) {
		EngineCapacity = engineCapacity;
	}

	public CarModel getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(CarModel carmodel) {
		this.carmodel = carmodel;
	}

	@Override
	public String toString() {
		return "CarEngineCapacity [EngineCapacity=" + EngineCapacity + ", getId()=" + getId() + "]";
	}
	
	
}
