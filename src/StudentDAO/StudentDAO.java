package StudentDAO;
import DBConnection.DBConnection;
import Student.StudentModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    //adding student
    public void addStudent(StudentModel student){
        String sql="insert into student(name,age,grade) values(?,?,?)";
        try(Connection con= DBConnection.getConnection();
            PreparedStatement ps= con.prepareStatement(sql)) {
            ps.setString(1,student.getName());
            ps.setInt(2,student.getAge());
            ps.setString(3,student.getGrade());
            ps.executeUpdate();

            System.out.println("Student Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //updating Student
    public void updateStudent(StudentModel student){
        String sql="update student set name=? age=? grade=? where id=?";
        try(Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql)) {
            ps.setString(1,student.getName());
            ps.setInt(2,student.getAge());
            ps.setString(3,student.getGrade());
            ps.setInt(4,student.getId());
            ps.executeUpdate();

            System.out.println("Student Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //retrievestudents
    public List<StudentModel> getAllStudents(){
            List<StudentModel> l=new ArrayList<>();
            String sql="select * from student";
            try(Connection con=DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
                ResultSet rs=ps.executeQuery()){

                while (rs.next()){
                    StudentModel s=new StudentModel(rs.getInt("id"),
                            rs.getString("name"),
                            rs.getInt("age"),
                            rs.getString("grade"));
                    l.add(s);
                }


            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return l;
    }

    //delete students
    public void deleteStudent(int id){
        String sql="delete from student where id=?";
        try(Connection con=DBConnection.getConnection();
        PreparedStatement ps= con.prepareStatement(sql)){
            ps.setInt(1,id);
            ps.executeUpdate();
            System.out.println("✅ Student deleted successfully.");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
