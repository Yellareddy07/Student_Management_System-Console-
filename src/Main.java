import Student.StudentModel;
import StudentDAO.StudentDAO;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StudentDAO sd=new StudentDAO();

        while (true){
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View All Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1: {
                    System.out.println("Enter Student Name");
                    String name = scanner.next();

                    System.out.println("Enter Student Age");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter Grade");
                    String grade = scanner.next();

                    StudentModel sm = new StudentModel(0, name, age, grade);
                    sd.addStudent(sm);
                    break;
                }
                case 2: {
                    System.out.println("Enter id to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter name to update: ");
                    String newName = scanner.nextLine();

                    System.out.println("Enter Age to Update: ");
                    int newAge= scanner.nextInt();

                    System.out.print("Enter new grade: ");
                    String newGrade = scanner.next();

                    StudentModel updated=new StudentModel(id,newName,newAge,newGrade);
                    sd.updateStudent(updated);
                    break;
                }
                case 3:{
                    System.out.println("Enter id to delete");
                    int id=scanner.nextInt();
                    sd.deleteStudent(id);
                    break;

                }
                case 4:{
                    List<StudentModel> l=sd.getAllStudents();
                    for (StudentModel s:l){
                        System.out.println(s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getGrade());
                    }
                }

            }
        }
        }
}