package practice.easy;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson17_05
 */

public class Java8 {

    public static void main(String args[]) {
        int[] list1 = {1, 2, 3, 4, 5, 6, 7};

        // Terminal operation min max, sum, reduce
        System.out.println("#########################");
        IntStream.of(list1).forEach(item -> System.out.println(item));
        System.out.println("#########################");
        System.out.println(IntStream.of(list1).min().getAsInt());
        System.out.println("#########################");
        System.out.println(IntStream.of(list1).max().getAsInt());
        System.out.println("#########################");
        System.out.println(IntStream.of(list1).sum());
        System.out.println("##############reduce###########");
        System.out.println(IntStream.of(list1).reduce(0, (x, y) -> x + y));
        System.out.println("############reduce2#############");
        System.out.println(IntStream.of(list1).reduce(1, (x, y) -> x * y));

        //intermediate operation
        System.out.println("############intermediate#############");
        IntStream.of(list1).filter(x -> x > 1).sorted().forEach(System.out::println);
        System.out.println("############intermediate#############");
        IntStream.of(list1).filter(x -> x > 1).map(value -> value * 10).sorted().forEach(System.out::println);
        System.out.println("############intermediate#############");
        IntStream.range(1, 10).forEach(System.out::println);

        Integer[] list2 = {1, 2, 4,3};


        //Integer stream
        System.out.println("############integer#############");
        List<Integer> op1 = Arrays.stream(list2)
                .sorted()
                .collect(Collectors.toList());

        op1.forEach(System.out::println);
        System.out.println("############filter#############");
        List<Integer> op2 = Arrays.stream(list2).filter(value -> value > 3).collect(Collectors.toList());
        op2.forEach(System.out::println);

        //String stream
        System.out.println("############String#############");
        String[] strList = {"orange", "red", "yellow"};

        List<String> ops1 = Arrays.stream(strList)
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(ops1.toString());

        //practice.easy.Employee stream
        System.out.println("############practice.easy.Employee#############");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("bob", 12.700, "engg"));
        employees.add(new Employee("bob2", 124.00, "engg1"));
        employees.add(new Employee("bob3", 1253.00, "engg4"));
        employees.add(new Employee("bob3", 123.00, "engg"));
        employees.add(new Employee("bob3", 1243.00, "engg4"));

        employees.stream().forEach(System.out::println);
        System.out.println("############practice.easy.Employee#############");
        employees.stream()
                .filter(employee -> employee.getSalary() > 100.00)
                .forEach(System.out::print);

        Stream<Employee> employeeStream = employees.stream()
                .filter(employee -> employee.getSalary() > 100.00);
        employeeStream.forEach(System.out::print);

        List<Employee> emplist1 = employees.stream()
                .filter(employee -> employee.getSalary() > 100.00).collect(Collectors.toList());
        emplist1.forEach(System.out::print);
        System.out.println();
        System.out.println("############Predicate, filter, sort, find first#############");
        Predicate<Employee> someRange = employee -> employee.getSalary() > 100.00;
        employees.stream()
                .filter(someRange)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.println("############ find first#############");
        Employee employee = employees.stream()
                .filter(someRange)
                .findFirst()
                .get();
        System.out.println(employee);

        System.out.println("############ sorting#############");

        Function<Employee, String> byName = Employee::getName;
        Function<Employee, String> byDepartment = Employee::getDepartment;

        Comparator<Employee> nameThenDepartment = Comparator.comparing(byName).thenComparing(byDepartment);

        employees.stream()
                .sorted(nameThenDepartment)
                .forEach(System.out::println);
        System.out.println("############ reverse sorting#############");
        employees.stream()
                .sorted(nameThenDepartment.reversed())
                .forEach(System.out::println);

        System.out.println("############ mapping#############");

        employees.stream()
                .map(Employee::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("############ Group by mapping#############");

        Map<String, List<Employee>> groupByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        groupByDepartment.forEach((department, employeesInDepartment) -> {
            System.out.println(department);
            employeesInDepartment.forEach(System.out::println);
        });
    }
}
