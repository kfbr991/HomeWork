package week3;

import java.time.LocalDate;

public class Student
{
    private String name;
    private String surname;
    private LocalDate birth;
    private String uni;


    Student(String name, String surname, LocalDate birth, String uni)
    {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.uni = uni;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public String getSurname()
    {
        return surname;
    }

    public void setBirth(LocalDate birth)
    {
        this.birth = birth;
    }
    public LocalDate getBirth()
    {
        return birth;
    }

    public void setUni(String uni)
    {
        this.uni = uni;
    }
    public String getUni()
    {
        return uni;
    }

    int Age()
    {
        LocalDate age = LocalDate.now();

        age = age.minusYears(birth.getYear());

        if(age.getMonthValue() < birth.getMonthValue())
        {
            return age.getYear() - 1;
        }
        if(age.getMonthValue() == birth.getMonthValue())
        {
            if(age.getDayOfMonth() > birth.getDayOfMonth())
            {
                return age.getYear() - 1;
            }
        }
        return age.getYear();
    }

    String getFullInfo()
    {
        return name + " " + surname + " " + birth.toString() + " " + uni;
    }

    public static void main(String[] args)
    {
        Student a = new Student("Tsotne", "Meladze", LocalDate.of(1996, 10, 9), "Sangu");
		/*a.setName("Tsotne");
		a.setSurname("Meladze");
		a.setUni("Sangu");*/

        System.out.println("Full info: " + a.getFullInfo());
        System.out.println("Age: " + a.Age());
    }
}
