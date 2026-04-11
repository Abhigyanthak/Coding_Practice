/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheMaleAndFemaleInEachDepartment {
    public static void main(String[] args) {
        ArrayList<Employees> empList = new ArrayList<Employees>();
        empList.add(new Employees(1, "Yanksha", 28, 123L, "F", "HR", "Blore", 2020));
        empList.add(new Employees(2, "Francesca", 29, 120L, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employees(3, "Ramesh", 30, 115L, "M", "HR", "Chennai", 2014));
        empList.add(new Employees(4, "Melanie", 32, 125L, "F", "HR", "Chennai", 2013));
        empList.add(new Employees(5, "Padma", 22, 150L, "F", "IT", "Noida", 2013));
        empList.add(new Employees(6, "Milad", 27, 140L, "M", "IT", "Gurugram", 2017));
        empList.add(new Employees(7, "Uzma", 26, 130L, "F", "IT", "Pune", 2016));
        empList.add(new Employees(8, "Ali", 23, 145L, "M", "IT", "Trivandam", 2015));
        empList.add(new Employees(9, "Ram", 25, 160L, "M", "IT", "Blore", 2010));
        Map<String, Map<String, Long>> genderCountInEachDept = empList.stream().collect(Collectors.groupingBy(Employees::getDeptName, Collectors.groupingBy(Employees::getGender, Collectors.counting())));
        System.out.println(genderCountInEachDept);
    }
}
