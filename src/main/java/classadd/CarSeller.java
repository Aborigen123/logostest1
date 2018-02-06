package classadd;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car_seller")
public class CarSeller extends BaseEntity{

	@Column(name = "first_name")
	private String FirstName;
	
	@Column(name = "last_name")
	private String LastNAme;
	
	@Column(name = "age")
	private int Age;
	
	@Column(name = "phone_number")
	private int PhoneNumber;
	
	@OneToOne(mappedBy = "carSeller", cascade = CascadeType.ALL)
	private Car car;
	
	public CarSeller() {}

	public CarSeller(String firstName, String lastNAme, int age, int phoneNumber) {
		FirstName = firstName;
		LastNAme = lastNAme;
		Age = age;
		PhoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastNAme() {
		return LastNAme;
	}

	public void setLastNAme(String lastNAme) {
		LastNAme = lastNAme;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "CarSeller [FirstName=" + FirstName + ", LastNAme=" + LastNAme + ", Age=" + Age + ", PhoneNumber="
				+ PhoneNumber + ", getId()=" + getId() + "]";
	}
	
	
}
