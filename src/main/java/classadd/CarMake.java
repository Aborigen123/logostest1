package classadd;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "car_make")
public class CarMake extends BaseEntity{
	@Column(name = "make_title", unique = true)
	private String MakeTitle;
	

//	String format = "yyyy ";
	//private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
	//@Basic
	//@Temporal(TemporalType.DATE)y
	//, columnDefinition = "year"
		@Column(name = "manufacture_year")
	//private SimpleDateFormat formatter  ;
	private  Date manufactureyear;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "model_id", nullable = true)
	private CarModel carModel;
	
@OneToMany(mappedBy = "carMake", cascade = CascadeType.ALL) 	
	List<Car> car = new ArrayList<>();

public CarMake() {}

//public CarMake(String makeTitle, Year manufactureyear) {
//	MakeTitle = makeTitle;
//	this.manufactureyear = manufactureyear;
//}
//
//public String getMakeTitle() {
//	return MakeTitle;
//}
//
//public void setMakeTitle(String makeTitle) {
//	MakeTitle = makeTitle;
//}
//
//public Year getManufactureyear() {
//	return manufactureyear;
//}
//
//public void setManufactureyear(Year manufactureyear) {
//	this.manufactureyear = manufactureyear;
//}
//
//public CarModel getCarModel() {
//	return carModel;
//}
//
//public void setCarModel(CarModel carModel) {
//	this.carModel = carModel;
//}
//
//public List<Car> getCar() {
//	return car;
//}
//
//public void setCar(List<Car> car) {
//	this.car = car;
//}
//
//@Override
//public String toString() {
//	return "CarMake [MakeTitle=" + MakeTitle + ", manufactureyear=" + manufactureyear + ", getId()=" + getId() + "]";
//}




public CarMake(String makeTitle, Date manufactureyear) {
	MakeTitle = makeTitle;
	this.manufactureyear = manufactureyear;
}




public String getMakeTitle() {
	return MakeTitle;
}

public void setMakeTitle(String makeTitle) {
	MakeTitle = makeTitle;
}

public Date getManufactureyear() {
	return manufactureyear;
}

public void setManufactureyear(Date manufactureyear) {
	this.manufactureyear = manufactureyear;
}

public CarModel getCarModel() {
	return carModel;
}

public void setCarModel(CarModel carModel) {
	this.carModel = carModel;
}

public List<Car> getCar() {
	return car;
}

public void setCar(List<Car> car) {
	this.car = car;
}

@Override
public String toString() {
	return "CarMake [MakeTitle=" + MakeTitle + ", manufactureyear=" + manufactureyear + ", getId()=" + getId() + "]";
}





}

