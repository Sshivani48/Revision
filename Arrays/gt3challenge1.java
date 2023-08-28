import java.util.Scanner;

class Student {
  int studentId;
  String studentName;
  int rollNo;
  String mobileNumber;
  double marks;
  String address;

  public Student(int studentId, String studentName, int rollNo, String mobileNumber, double marks, String address) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.rollNo = rollNo;
    this.mobileNumber = mobileNumber;
    this.marks = marks;
    this.address = address;
  }
}

public class gt3challenge1 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Student[] stu = new Student[5];
    for (int i = 0; i < stu.length; i++) {
      System.out.println("Enter data for student " + (i + 1) + ":");
      stu[i] = createStudent();
    }
    System.out.println("\nOutput:");
    for (Student student : stu) {
      displayStudent(student);
      System.out.println();
    }
  }

  static Student createStudent() {
    int studentId = validateStudentId();
    String studentName = validateStudentName();
    int rollNo = validateRollNo();
    String mobileNumber = validateMobileNumber();
    double marks = validateMarks();
    String address = validateAddress();

    return new Student(studentId, studentName, rollNo, mobileNumber, marks, address);
  }

  static void displayStudent(Student student) {
    System.out.println("Student ID: " + student.studentId);
    System.out.println("Student Name: " + student.studentName);
    System.out.println("Roll Number: " + student.rollNo);
    System.out.println("Mobile Number: " + student.mobileNumber);
    System.out.println("Marks: " + student.marks);
    System.out.println("Address: " + student.address);
  }

  static int validateStudentId() {
    int studentId;
    do {
      System.out.print("Student ID (5-digit number): ");
      studentId = sc.nextInt();
    } while (String.valueOf(studentId).length() != 5);
    return studentId;
  }

  static String validateStudentName() {
    sc.nextLine();
    String studentName;
    do {
      System.out.print("Student Name (2-30 characters): ");
      studentName = sc.nextLine();
    } while (!studentName.matches("[a-zA-Z ]{2,30}"));
    return studentName;
  }

  static int validateRollNo() {
    int rollNo;
    do {
      System.out.print("Roll Number (positive integer): ");
      rollNo = sc.nextInt();
    } while (rollNo <= 0);
    return rollNo;
  }

  static String validateMobileNumber() {
    String mobileNumber;
    do {
      System.out.print("Mobile Number (10 digits starting with 9, 8, 7, or 6): ");
      mobileNumber = sc.next();
    } while (!mobileNumber.matches("[6-9]\\d{9}"));
    return mobileNumber;
  }

  static double validateMarks() {
    double marks;
    do {
      System.out.print("Marks (0-100): ");
      marks = sc.nextDouble();
    } while (marks < 0 || marks > 100);
    return marks;
  }

  static String validateAddress() {
    sc.nextLine();
    String address;
    do {
      System.out.print("Address (5-100 characters): ");
      address = sc.nextLine();
    } while (address.length() < 5 || address.length() > 100);
    return address;
  }
}
