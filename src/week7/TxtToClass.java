package week7;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

final class TxtToClass
{
    private TxtToClass()
    {

    }

    static List<Department> toDepartments(String path, String txtFile) throws Exception
    {
        List<Department> deps = new ArrayList<>();
        List<String> strings = Files.readAllLines(Paths.get(path, txtFile));

        for (String i: strings)
        {
            String[] helper = i.split(":");

            deps.add(new Department(Integer.parseInt(helper[0]), helper[1], helper[2]));
        }

        return deps;
    }

    static List<Employee> toEmployees(String path, String txtFile) throws Exception
    {
        List<Employee> emps = new ArrayList<>();
        List<String> strings = Files.readAllLines(Paths.get(path, txtFile));
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        for (String i: strings)
        {
            String[] helper = i.split(":");

            emps.add(new Employee(Integer.parseInt(helper[0]), helper[1], helper[2], LocalDate.parse(helper[3], dateFormatter),
                    Integer.parseInt(helper[4])));
        }

        return emps;
    }
}
