package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("area1", "city1", "state1", 110021);
        Address address2 = new Address("area2", "city2", "state2", 110022);
        Address address3 = new Address("area3", "city3", "state3", 110023);
        Address address4 = new Address("area4", "city4", "state4", 110024);
        Address address5 = new Address("area5", "city5", "state5", 110025);

        Student student1 = new Student("firstname1", "lastname1", 1, address1, "dayScholar", 10);
        Student student2 = new Student("firstname2", "lastname2", 1, address2, "dayScholar", 9);
        Student student3 = new Student("firstname3", "lastname3", 1, address3, "dayScholar", 8);
        Student student4 = new Student("firstname4", "lastname4", 1, address4, "dayScholar", 7);
        Student student5 = new Student("firstname5", "lastname5", 1, address5, "dayScholar", 6);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        DistanceComparer distanceComparer = new DistanceComparer();
        CGPAComparer cgpaComparer = new CGPAComparer();
        RankComparer rankComparer = new RankComparer();

        students.sort(distanceComparer);
        System.out.println("On the basis of distance (lowest to highest): ");

        for (Student stu: students)
        {
            System.out.println(stu);
        }

        students.sort(cgpaComparer);
        System.out.println("On the basis of cgpa (lowest to highest): ");

        for (Student stu: students)
        {
            System.out.println(stu);
        }

        students.sort(rankComparer);

        System.out.println("On the basis of rank (= distance-6*cgpa) (highest to lowest): ");

        for (Student stu: students)
        {
            System.out.println(stu);
        }

        students.get(0).setResidential_status("onCampus");
        students.get(1).setResidential_status("onCampus");
        students.get(2).setResidential_status("onCampus");

        for (Student stu: students)
        {
            System.out.print(stu + ": ");
            stu.goToWork();
        }
    }
}