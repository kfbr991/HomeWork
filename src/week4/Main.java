package week4;

import java.time.LocalDate;

public class Main 
{
	public static void main(String[] args) 
	{
		Human a = new Human("Tsotne", "Meladze", LocalDate.of(1996, 8, 1), new Car("Volvo", "Model1", LocalDate.of(2000, 1, 8), "blue"));
		
		System.out.println(a.generalInfo());
	}
}
