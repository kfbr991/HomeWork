package week7;

import java.time.LocalDate;

public class Employee
{
    private Integer id;
    private String name;
    private String surname;
    private LocalDate birth;
    private Integer department;

    public Employee()
    {
        this.id = null;
        this.name = null;
        this.surname = null;
        this.birth = null;
        this.department = null;
    }

    Employee(Integer id, String name, String surname, LocalDate birth, Integer department)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.department = department;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public LocalDate getBirth()
    {
        return birth;
    }

    public void setBirth(LocalDate birth)
    {
        this.birth = birth;
    }

    Integer getDepartment()
    {
        return department;
    }

    public void setDepartment(Integer department)
    {
        this.department = department;
    }

    Integer getAge()
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
}
