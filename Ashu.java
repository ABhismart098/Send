import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Ashu {
    String name;
    int rollNumber;
    int semester;
    int englishMarks;
    int mathsMarks;
    int scienceMarks;

    public Student(String name, int rollNumber, int semester, int englishMarks, int mathsMarks, int scienceMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.semester = semester;
        this.englishMarks = englishMarks;
        this.mathsMarks = mathsMarks;
        this.scienceMarks = scienceMarks;
    }

    public int getTotalMarks() {
        return englishMarks + mathsMarks + scienceMarks;
    }

    public float getAverageMarks() {
        return getTotalMarks() / 3;
    }
}

class StudentsReportingSystem {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

  public float getAveragePercentageOfRecentSemester() {
    int totalMarks = 0;
    int totalStudents = 0;
    for (Student student : students) {
      if (student.semester == 2) {
        totalMarks += student.getTotalMarks();
        totalStudents++;
      }
    }
    return totalMarks / totalStudents;
  }

  public float getAverageMarksOfSubject(String subject) {
    int totalMarks = 0;
    int totalStudents = 0;
    for (Student student : students) {
      if (student.semester == 2) {
        if (subject.equals("english")) {
          totalMarks += student.englishMarks;
        } else if (subject.equals("maths")) {
          totalMarks += student.mathsMarks;
        } else if (subject.equals("science")) {
          totalMarks += student.scienceMarks;
        }
        totalStudents++;