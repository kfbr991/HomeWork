package week7;

public class OutputContainer
{
    private String department;
    private String name;
    private String surname;
    private String age;
    private String workingAddress;

    private OutputContainer()
    {

    }

    OutputContainer(String department, String name, String surname, String age, String workingAddress)
    {
        this.department = department;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workingAddress = workingAddress;
    }

    String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
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

    String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public String getWorkingAddress()
    {
        return workingAddress;
    }

    public void setWorkingAddress(String workingAddress)
    {
        this.workingAddress = workingAddress;
    }

    @Override
    public String toString()
    {
        return (department + ":\t" + name + "\t" + surname + "\t" + age + " წლის.\t მუშაობს:" + workingAddress + "-ში");
    }
}
