package week4;

import java.time.LocalDate;

public class Human {
	private String name;
	private String surname;
	private LocalDate birthDate;
	private Car car;

	public Human(String name, String surname, LocalDate birthDate, Car car) 
	{
		super();
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.car = car;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getSurname() 
	{
		return surname;
	}
	public void setSurname(String surname) 
	{
		this.surname = surname;
	}
	public LocalDate getBirthDate() 
	{
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) 
	{
		this.birthDate = birthDate;
	}
	public Car getCar() 
	{
		return car;
	}
	public void setCar(Car car) 
	{
		this.car = car;
	}
	
	public String generalInfo()
	{
		return name + " " + surname + " has a " + car.getColor() + " " + car.getMake() + ".";
	}
}
