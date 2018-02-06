package classadd;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car extends BaseEntity {

	@Column(name = "sell_price", columnDefinition = "DECIMAL(5, 2)")
	private BigDecimal SellPrice;
	

	

	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "make_id")
			private CarMake carMake;
	
	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name = "seller_id",nullable = true)
	private CarSeller carSeller;
	
	
	public Car() {
		
	}


	public Car(BigDecimal sellPrice) {
		SellPrice = sellPrice;
	}



	public BigDecimal getSellPrice() {
		return SellPrice;
	}


	public void setSellPrice(BigDecimal sellPrice) {
		SellPrice = sellPrice;
	}


	public CarMake getCarMake() {
		return carMake;
	}


	public void setCarMake(CarMake carMake) {
		this.carMake = carMake;
	}


	public CarSeller getCarSeller() {
		return carSeller;
	}


	public void setCarSeller(CarSeller carSeller) {
		this.carSeller = carSeller;
	}


	@Override
	public String toString() {
		return "Car [SellPrice=" + SellPrice + ", getId()=" + getId() + "]";
	}
	
	
}
