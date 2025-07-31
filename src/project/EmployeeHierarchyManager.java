package project;

import java.util.*;

class Employee {
    String name;
    String level; // intern, junior, senior

    public Employee(String name, String level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return name + " (" + level + ")";
    }
}

public class EmployeeHierarchyManager {
    public static void main(String[] args) {
        // Main list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Aftab", "intern"));
        employees.add(new Employee("John", "junior"));
        employees.add(new Employee("Sarah", "senior"));
        employees.add(new Employee("Mike", "intern"));
        employees.add(new Employee("Lisa", "junior"));
        employees.add(new Employee("Tom", "intern"));
        employees.add(new Employee("Emma", "junior"));
        employees.add(new Employee("Robert", "junior"));
        employees.add(new Employee("Anna", "intern"));

        System.out.println("\nInitial Employee List:");
        employees.forEach(System.out::println);

        // 1. Show only juniors
        System.out.println("\nList of Juniors:");
        employees.stream()
                .filter(e -> e.level.equals("junior"))
                .forEach(System.out::println);

        // 2. Promote interns to juniors
        for (Employee e : employees) {
            if (e.level.equals("intern")) {
                e.level = "junior";
            }
        }
        System.out.println("\nAfter Promoting Interns to Juniors:");
        employees.forEach(System.out::println);

        // 3. Export a team of 5 juniors using subList()
        List<Employee> juniors = new ArrayList<>();
        for (Employee e : employees) {
            if (e.level.equals("junior")) {
                juniors.add(e);
            }
        }

        // Taking sublist (first 5 juniors)
        List<Employee> juniorTeam = juniors.subList(0, Math.min(5, juniors.size()));

        System.out.println("\nJunior Team (Sublist of 5):");
        juniorTeam.forEach(System.out::println);

        // Tricky Twist: Modifying the sublist affects the main list
        System.out.println("\n--- Modifying Sublist ---");
        juniorTeam.get(0).name = "CHANGED-NAME";
        juniorTeam.remove(1); // Remove one junior from sublist

        System.out.println("\nJunior Team after Modification:");
        juniorTeam.forEach(System.out::println);

        System.out.println("\nMain Employee List after Sublist Modification:");
        employees.forEach(System.out::println);

        // 4. Deep Copy to avoid effect (creating independent copy)
        List<Employee> deepCopyTeam = new ArrayList<>();
        for (Employee e : juniorTeam) {
            deepCopyTeam.add(new Employee(e.name, e.level));
        }

        // Modifying deep copy will not affect the main list
        deepCopyTeam.get(0).name = "INDEPENDENT";
        System.out.println("\nDeep Copy Team:");
        deepCopyTeam.forEach(System.out::println);

        System.out.println("\nMain Employee List remains unchanged:");
        employees.forEach(System.out::println);
    }
}

