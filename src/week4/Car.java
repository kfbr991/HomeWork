package week4;

import java.time.LocalDate;

public class Car 
{
	private String make;
	private String model;
	private LocalDate releaseDate;
	private String color;
	
	public Car(String make, String model, LocalDate releaseDate, String color) 
	{
		super();
		this.make = make;
		this.model = model;
		this.releaseDate = releaseDate;
		this.color = color;
	}

	public Car(String make, String model, String color) 
	{
		super();
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	public String getMake() 
	{
		return make;
	}
	public void setMake(String make) 
	{
		this.make = make;
	}
	public String getModel() 
	{
		return model;
	}
	public void setModel(String model) 
	{
		this.model = model;
	}
	public LocalDate getReleaseDate() 
	{
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) 
	{
		this.releaseDate = releaseDate;
	}
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}	
	
	
}
