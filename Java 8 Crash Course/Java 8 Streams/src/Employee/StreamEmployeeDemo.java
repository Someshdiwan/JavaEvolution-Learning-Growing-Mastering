package Employee;

import java.util.*;
import java.util.stream.*;

public class StreamEmployeeDemo {

    record Employee(int id, String name, int age, String gender,
                    String department, int yearOfJoining, double salary) {}

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

        // 1. Count male and female
        Map<String, Long> map1 = emps.stream()
            .collect(Collectors.groupingBy(Employee::gender, Collectors.counting()));
        System.out.println("\n1️⃣ Male/Female count: " + map1);

        // 2. All departments
        System.out.println("\n2️⃣ Departments:");
        emps.stream().map(Employee::department).distinct().forEach(System.out::println);

        // 3. Average age by gender
        Map<String, Double> map2 = emps.stream()
            .collect(Collectors.groupingBy(Employee::gender, Collectors.averagingInt(Employee::age)));
        System.out.println("\n3️⃣ Avg age (M/F): " + map2);

        // 4. Highest paid employee
        emps.stream()
            .max(Comparator.comparingDouble(Employee::salary))
            .ifPresent(e -> System.out.println("\n4️⃣ Highest paid: " + e));

        // 5. Joined after 2015
        System.out.println("\n5️⃣ Joined after 2015:");
        emps.stream().filter(e -> e.yearOfJoining() > 2015).map(Employee::name).forEach(System.out::println);

        // 6. Employees per department
        System.out.println("\n6️⃣ Count per department:");
        System.out.println(emps.stream().collect(Collectors.groupingBy(Employee::department, Collectors.counting())));

        // 7. Average salary per department
        System.out.println("\n7️⃣ Avg salary per department:");
        System.out.println(emps.stream().collect(Collectors.groupingBy(Employee::department, Collectors.averagingDouble(Employee::salary))));

        // 8. Youngest male in Development
        emps.stream()
            .filter(e -> e.gender().equals("Male") && e.department().equals("Development"))
            .min(Comparator.comparingInt(Employee::age))
            .ifPresent(e -> System.out.println("\n8️⃣ Youngest male in Dev: " + e));

        // 9. Most experienced employee
        emps.stream()
            .min(Comparator.comparingInt(Employee::yearOfJoining))
            .ifPresent(e -> System.out.println("\n9️⃣ Most experienced: " + e));

        // 10. M/F count in Sales
        System.out.println("\n🔟 Sales M/F count: " +
            emps.stream()
                .filter(e -> e.department().equals("Sales"))
                .collect(Collectors.groupingBy(Employee::gender, Collectors.counting()))
        );

        // 11. Avg & total salary
        String result = emps.stream()
            .collect(Collectors.teeing(
                Collectors.averagingDouble(Employee::salary),
                Collectors.summingDouble(Employee::salary),
                (avg, total) -> "Avg: " + avg + ", Total: " + total
            ));
        System.out.println("\n1️⃣1️⃣ Org salary stats: " + result);

        // 12. Partition by age <= 25
        Map<Boolean, List<Employee>> partition = emps.stream()
            .collect(Collectors.partitioningBy(e -> e.age() <= 25));
        System.out.println("\n1️⃣2️⃣ Age <= 25: " + partition.get(true));
        System.out.println("Older: " + partition.get(false));

        // 13. Oldest employee
        emps.stream()
            .max(Comparator.comparingInt(Employee::age))
            .ifPresentOrElse(
                e -> System.out.println("\n1️⃣3️⃣ Oldest employee: " + e),
                () -> System.out.println("No employee found.")
            );
    }
}
