package com.workintech.company.main;

import com.workintech.company.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Dogancan","Kinik"));
        employees.add(new Employee(1, "Dogancan","Kinik"));
        employees.add(new Employee(2, "Seyyit Battal","Arvas"));
        employees.add(new Employee(2, "Seyyit Battal","Arvas"));
        employees.add(new Employee(3, "Anil","Ensari"));
        employees.add(new Employee(3, "Anil","Ensari"));
        employees.add(new Employee(4, "Burak","Cevizli"));
        employees.add(new Employee(4, "Burak","Cevizli"));
        employees.add(null);

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator iterator = employees.iterator();
        while(iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            if(employee == null){
                System.out.println("Null data buldum");
                continue;
            }

            if(employeeMap.containsKey(employee.getId())){
                removedEmployees.add(employee);
                iterator.remove();
            } else{
                employeeMap.put(employee.getId(), employee);
            }
        }

        System.out.println(employees);
        System.out.println(employeeMap);
        System.out.println("REMOVED" + removedEmployees);


        //ConcurrentModificationException
//        for(Employee employee: employees){
//
//            employees.remove(employee);
//        }


    }
}