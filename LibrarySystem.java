import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    public static void main(String[] args) {
        // Instantiation and use of objects
        Student student = new Student("Ajay", "Grade 12");

        Grade grade1 = new Grade("Math", 95.0);
        Grade grade2 = new Grade("Science", 85.5);

        Honors honors1 = new Honors("National Honors", "Level 1");
        Honors honors2 = new Honors("Regional Honors", "Level 2");

        student.viewGrades().add(grade1);
        student.viewGrades().add(grade2);
        student.viewHonors().add(honors1);
        student.viewHonors().add(honors2);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());

        System.out.println("Grades:");
        for (Grade grade : student.viewGrades()) {
            System.out.println("- Subject: " + grade.getSubject());
            System.out.println("  Marks: " + grade.getMarks());
            System.out.println("  Average: " + grade.calculateAverage());
        }

        System.out.println("Honors:");
        for (Honors honors : student.viewHonors()) {
            System.out.println("- Honors: " + honors.getHonors());
            System.out.println("  Level: " + honors.getLevel());
        }
    }
}

class Student {
    private String name;
    private String grade;
    private List<Grade> grades;
    private List<Honors> honors;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.grades = new ArrayList<>();
        this.honors = new ArrayList<>();
    }

    public List<Grade> viewGrades() {
        return grades;
    }

    public List<Honors> viewHonors() {
        return honors;
    }

    // Getters and Setters for private attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

class Grade {
    private String subject;
    private double marks;

    public Grade(String subject, double marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public double calculateAverage() {
        return marks;
    }

    // Getters and Setters for private attributes
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

class Honors {
    private String honors;
    private String level;

    public Honors(String honors, String level) {
        this.honors = honors;
        this.level = level;
    }

    // Getters and Setters for private attributes
    public String getHonors() {
        return honors;
    }

    public void setHonors(String honors) {
        this.honors = honors;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}