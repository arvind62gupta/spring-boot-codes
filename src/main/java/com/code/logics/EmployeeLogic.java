package com.code.logics;


import com.code.Domains.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeLogic {

    public static void main(String[] args){

        EmployeeLogic employeeLogic= new EmployeeLogic();

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Bhola", "Kumar", 20000));

        employeeList.add(new Employee(2, "Rajendra", "Tiwari", 30000));

        employeeList.add(new Employee(3, "Shiva", "Tiwari", 30000));

        employeeList.add(new Employee(4, "Krishna", "Kumar", 40000));

        employeeList.add(new Employee(5, "Rama", "Manohar", 16000));
        employeeList.add(new Employee(6, "Radha", "Manohar", 18000));

        employeeList.add(new Employee(7, "Bhola", "Kumar", 30000,2024));
        employeeList.add(new Employee(8, "Raju", "Kumar", 20000,2025));
        employeeList.add(new Employee(9, "rajesh", "Kumar", 20000,2025));

        // System.out.println(employeeList);
/* ################################################################################ */
        employeeLogic.employeeSorting(employeeList);
       employeeLogic.someEmplogics(employeeList);
    }

    public void employeeSorting(List<Employee> empList) {

        List<Integer> accendingorderList =empList.stream().sorted(Comparator.comparing(Employee::getSal))
                .map(Employee::getSal)
                .toList();
        System.out.println("sort by emp sal ===>  "+ accendingorderList);

    }
    public void someEmplogics(List<Employee> list){

        Map<Integer, Employee> map = list.stream()
                .collect(Collectors.toMap(Employee::getId,Function.identity()));

        map.forEach((key, value) -> System.out.println(key + " : " + value));

        Employee highestSalary= list.stream().max(Comparator.comparing(Employee::getSal)).get();
        System.out.println("max===Salary=== >> "+highestSalary);

        Employee secondHighsalEmpDetails = list.stream()
                .sorted(Comparator.comparing(Employee::getSal).reversed())
                .skip(1).findFirst().get();

        System.out.println("second high ===Salary==EMP Details= >> "+secondHighsalEmpDetails);

        Map<String, Long> countofEmp=list.stream()
                .map(Employee::getLname)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("frequency of last name==>"+countofEmp);

       Map<Integer, Double> result =
               list.stream().collect(Collectors.groupingBy(Employee::getYear,
                Collectors.summingDouble(Employee::getSal)))
        .entrySet().stream()
                .sorted(Map.Entry.<Integer, Double>comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                Map.Entry::getValue,
                        (e1,e2) ->e1, LinkedHashMap::new));



        result.forEach((year, sum) -> System.out.println(year + " -> " + sum));
    }
    }




