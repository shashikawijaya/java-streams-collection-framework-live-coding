package com.gapstars.java.tests.javastreamscollectionframework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeProcessor {
	public static Map<String, List<String>> getTopEarnersByDepartment(List<Employee> employees) {
		throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 60000, "IT"),
            new Employee(2, "Bob", 75000, "IT"),
            new Employee(3, "Charlie", 75000, "IT"),
            new Employee(4, "David", 80000, "HR"),
            new Employee(5, "Eve", 90000, "Finance"),
            new Employee(6, "Frank", 90000, "Finance"),
            new Employee(7, "Grace", 50000, "HR")
        );

        System.out.println(getTopEarnersByDepartment(employees));
    }
}
