import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

record Employee(int id,
                String name,
                int age,
                String gender,
                String department,
                int yearOfJoining,
                double salary)
{}

public class EmployeeFileCreation {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();

        emps.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
        emps.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
        emps.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
        emps.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
        emps.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
        emps.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
        emps.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
        emps.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
        emps.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
        emps.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
        emps.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
        emps.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
        emps.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
        emps.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
        emps.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
        emps.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

        try {
            // Create file
            File file = new File("employees_output.txt");
            FileWriter writer = new FileWriter(file);

            // Write all employee data to file
            writer.write("===== EMPLOYEE DATA =====\n\n");
            for (Employee emp : emps) {
                writer.write(emp.toString() + "\n");
            }

            writer.write("\n===== QUERY RESULTS =====\n\n");

            // 1. Male and Female count
            writer.write("1. Male and Female Employee Count:\n");
            Map<String, Long> map1 = emps.stream()
                .collect(Collectors.groupingBy(Employee::gender, Collectors.counting()));
            writer.write(map1.toString() + "\n\n");

            // 2. All departments
            writer.write("2. All Departments:\n");
            List<String> departments = emps.stream()
                .map(Employee::department)
                .distinct()
                .toList();
            departments.forEach(dept -> {
                try {
                    writer.write(dept + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.write("\n");

            // 3. Average age by gender
            writer.write("3. Average Age by Gender:\n");
            Map<String, Double> map = emps.stream()
                .collect(Collectors.groupingBy(Employee::gender, Collectors.averagingInt(Employee::age)));
            writer.write(map.toString() + "\n\n");

            // 4. Highest paid employee
            writer.write("4. Highest Paid Employee:\n");
            Optional<Employee> optional = emps.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::salary)));
            if(optional.isPresent()) {
                writer.write(optional.get().toString() + "\n\n");
            }

            // 5. Employees joined after 2015
            writer.write("5. Employees Joined After 2015:\n");
            List<String> names = emps.stream()
                .filter(e -> e.yearOfJoining() > 2015)
                .map(Employee::name)
                .toList();
            names.forEach(name -> {
                try {
                    writer.write(name + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.write("\n");

            // 6. Employee count per department
            writer.write("6. Employee Count Per Department:\n");
            Map<String, Long> map2 = emps.stream()
                .collect(Collectors.groupingBy(Employee::department, Collectors.counting()));
            writer.write(map2.toString() + "\n\n");

            // 7. Average salary per department
            writer.write("7. Average Salary Per Department:\n");
            Map<String, Double> map3 = emps.stream()
                .collect(Collectors.groupingBy(Employee::department, Collectors.averagingDouble(Employee::salary)));
            writer.write(map3.toString() + "\n\n");

            // 8. Youngest male in Development
            writer.write("8. Youngest Male in Development Department:\n");
            Optional<Employee> optional2 = emps.stream()
                .filter(e -> e.gender().equals("Male") && e.department().equals("Development"))
                .min(Comparator.comparing(Employee::age));
            if(optional2.isPresent()) {
                writer.write(optional2.get().toString() + "\n\n");
            }

            // 9. Most experienced employee
            writer.write("9. Most Experienced Employee:\n");
            Optional<Employee> optional1 = emps.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::yearOfJoining)));
            if(optional1.isPresent()) {
                writer.write(optional1.get().toString() + "\n\n");
            }

            // 10. Male and Female in Sales
            writer.write("10. Male and Female in Sales Team:\n");
            Map<String, Long> map4 = emps.stream()
                .filter(e -> e.department().equals("Sales"))
                .collect(Collectors.groupingBy(Employee::gender, Collectors.counting()));
            writer.write(map4.toString() + "\n\n");

            // 11. Average and Total salary
            writer.write("11. Average and Total Salary of Organization:\n");
            String result4 = emps.stream()
                .collect(Collectors.teeing(
                    Collectors.averagingDouble(Employee::salary),
                    Collectors.summingDouble(Employee::salary),
                    (avg, total) -> "Average: " + avg + ", Total: " + total)
                );
            writer.write(result4 + "\n\n");

            // 12. Partition by age
            writer.write("12. Employees <= 25 years:\n");
            Map<Boolean, List<Employee>> collect2 = emps.stream()
                .collect(Collectors.partitioningBy(emp -> emp.age() <= 25));
            List<Employee> list1 = collect2.get(true);
            List<Employee> list2 = collect2.get(false);
            writer.write(list1.toString() + "\n\n");
            writer.write("12b. Employees > 25 years:\n");
            writer.write(list2.toString() + "\n\n");

            // 13. Oldest employee
            writer.write("13. Oldest Employee:\n");
            Optional<Employee> max = emps.stream()
                .max(Comparator.comparing(Employee::age));
            max.ifPresentOrElse(e -> {
                try {
                    writer.write(e.toString() + "\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }, () -> {
                try {
                    writer.write("No employee available\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });

            writer.close();
            System.out.println("File 'employees_output.txt' created successfully!");

        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
