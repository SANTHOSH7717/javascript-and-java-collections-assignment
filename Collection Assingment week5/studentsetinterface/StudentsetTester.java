package Ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentsetTester {

    public static Set<Studentset> findUnique(List<Studentset> students) {
        Set<Studentset> uniqueStudents = new HashSet<Studentset>();
        Set<String> emailIds = new HashSet<String>();
        for (Studentset student : students) {
            if (!emailIds.contains(student.getEmailId())) {
                uniqueStudents.add(student);
                emailIds.add(student.getEmailId());
            }
        }
        return uniqueStudents;
    }

    public static Set<Studentset> findDuplicates(List<Studentset> students) {
        Set<Studentset> duplicateStudents = new HashSet<Studentset>();
        Set<String> emailIds = new HashSet<String>();
        for (Studentset student : students) {
            if (emailIds.contains(student.getEmailId())) {
                duplicateStudents.add(student);
            } else {
                emailIds.add(student.getEmailId());
            }
        }
        return duplicateStudents;
    }

    public static void main(String[] args) {
        List<Studentset> students = new ArrayList<Studentset>();

        students.add(new Studentset(5004, "Wyatt", "Wyatt@example.com", "Dance"));
        students.add(new Studentset(5010, "Lucy", "Lucy@example.com", "Dance"));
        students.add(new Studentset(5550, "Aaron", "Aaron@example.com", "Dance"));
        students.add(new Studentset(5560, "Ruby", "Ruby@example.com", "Dance"));
        students.add(new Studentset(5013, "Clara", "Clara@example.com", "Music"));
        students.add(new Studentset(5015, "Sophie", "Sophie@example.com", "Music"));
        students.add(new Studentset(5011, "Ivan", "Ivan@example.com", "Music"));
        students.add(new Studentset(4556, "Ben", "Ben@example.com", "Music"));
        students.add(new Studentset(3656, "John", "John@example.com", "Music"));
        students.add(new Studentset(6543, "Sam", "Sam@example.com", "Music"));
        students.add(new Studentset(455, "Ben", "Ben@example.com", "Dance"));

        System.out.println("Unique students:");
        Set<Studentset> uniqueStudents = findUnique(students);
        for (Studentset student : uniqueStudents) {
            System.out.println(student);
        }

        System.out.println("\nDuplicate students:");
        Set<Studentset> duplicateStudents = findDuplicates(students);
        for (Studentset student : duplicateStudents) {
            System.out.println(student);
        }
    }


}
