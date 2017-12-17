package week7;

public class Department
{
    private Integer id;
    private String name;
    private String address;

    public Department()
    {
        this.id = null;
        this.name = null;
        this.address = null;
    }

    Department(Integer id, String name, String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        if(id != null)
        {
            return id + " " + name + address;
        }
        return super.toString();
    }
}
