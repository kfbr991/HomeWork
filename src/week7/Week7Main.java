package week7;

import java.util.*;

public class Week7Main
{
    public static void main(String[] args)
    {
        List<Employee> emps = new ArrayList<>();
        List<Department> deps = new ArrayList<>();
        List<OutputContainer> outs = new ArrayList<>();

        try
        {
            emps = TxtToClass.toEmployees("HomeWork/src/week7", "employees.txt");
            deps = TxtToClass.toDepartments("HomeWork/src/week7", "departments.txt");

        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }

        for (int i = 0; i < emps.size(); i++)
        {
            Integer j = findDepartmentID(deps, emps.get(i).getDepartment());

            if(j == null)
            {
                continue;
            }

            outs.add(new OutputContainer(deps.get(j).getName(), emps.get(i).getName(), emps.get(i).getSurname(),
                    emps.get(i).getAge().toString(), deps.get(j).getAddress()));
        }

        outs.sort((oc1, oc2) ->
        {
            int value1 = oc1.getDepartment().compareTo(oc2.getDepartment());
            if (value1 == 0)
            {
                int value2 = oc1.getName().compareTo(oc2.getName());
                if (value2 == 0)
                {
                    int value3 = oc1.getSurname().compareTo(oc2.getSurname());
                    if (value3 == 0)
                    {
                        return oc1.getAge().compareTo(oc2.getAge());
                    }
                    return value3;
                }
                return value2;
            }
            return value1;
        });

        for (OutputContainer i: outs)
        {
            System.out.println(i.toString());
        }
    }

    private static Integer findDepartmentID(List<Department> deps, Integer id)
    {
        for (Integer i = 0; i < deps.size(); i++)
        {
            if(Objects.equals(deps.get(i).getId(), id))
            {
                return  i;
            }
        }

        return  null;
    }
}
