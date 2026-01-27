package com.springorm;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Spring ORM Console Based Application
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring ORM Started" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        //Insert
//        Student student = new Student(11,"Kishor","Overland Park");
//        int records = studentDao.insert(student);
//        System.out.println("Student Record Inserted: "+records);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go=true;
        while(go){
            System.out.println("PRESS 1 FOR ADD NEW STUDENT");
            System.out.println("PRESS 2 FOR GET STUDENT DETAILS");
            System.out.println("PRESS 3 FOR GET ALL STUDENT DETAILS");
            System.out.println("PRESS 4 FOR DELETE  STUDENT");
            System.out.println("PRESS 5 FOR UPDATE STUDENT DETAILS");
            System.out.println("PRESS 6 FOR EXIT");

            try{
                int input = Integer.parseInt(br.readLine());
                switch (input){
                    case 1:
                        System.out.println("Enter Student ID:");
                        int id = Integer.parseInt(br.readLine());
                        System.out.println("Enter Student Name:");
                        String name = br.readLine();
                        System.out.println("Enter Student City:");
                        String city = br.readLine();
                        Student student = new Student(id, name, city);
                        int records = studentDao.insert(student);
                        System.out.println("Student Record Inserted: " + records);
                        break;
                    case 2:
                        try {
                            System.out.println("Enter Student ID to Fetch:");
                            String inputId = br.readLine();

                            // Validate if input is a valid number
                            if (!inputId.matches("\\d+")) {
                                System.out.println("Please enter a valid numeric ID.");
                                break;
                            }

                            int studentId = Integer.parseInt(inputId);
                            Student fetchedStudent = studentDao.getStudent(studentId);

                            if (fetchedStudent != null) {
                                System.out.println("Student Details: " + fetchedStudent);
                            } else {
                                System.out.println("Student with ID " + studentId + " not found.");
                            }
                        } catch (Exception e) {
                            System.out.println("Error occurred: " + e.getMessage());
                            //e.printStackTrace();
                        }
                        break;
                    case 3:
                        try {
                            List<Student> students = studentDao.getStudents();
                            if (students.isEmpty()) {
                                System.out.println("No students found.");
                            } else {
                                System.out.println("All Student Details:");
                                for (Student s : students) {
                                    System.out.println(s); // This will use the toString() method of Student
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Error occurred while fetching all students: " + e.getMessage());
                            //e.printStackTrace();
                        }
                        break;
                    case 4:
                        try {
                            System.out.println("Enter Student ID to Delete:");
                            String inputId = br.readLine();
                            // Validate if input is a valid number
                            if (!inputId.matches("\\d+")) {
                                System.out.println("Please enter a valid numeric ID.");
                                break;
                            }
                            int studentId = Integer.parseInt(inputId);
                            studentDao.deleteStudent(studentId);
                            System.out.println("Student with ID " + studentId + " has been deleted.");
                        } catch (Exception e) {
                            System.out.println("Error occurred while deleting the student: " + e.getMessage());
                            //e.printStackTrace();
                        }
                        break;
                    case 5:
                        try {
                            System.out.println("Enter Student ID to Update:");
                            String inputId = br.readLine();

                            // Validate if input is a valid number
                            if (!inputId.matches("\\d+")) {
                                System.out.println("Please enter a valid numeric ID.");
                                break;
                            }
                            int studentId = Integer.parseInt(inputId);
                            // Fetch existing student details
                            Student studentToUpdate = studentDao.getStudent(studentId);
                            if (studentToUpdate != null) {
                                // Student exists, proceed with update
                                System.out.println("Current Student Details: " + studentToUpdate);
                                System.out.println("Enter new name (leave blank to keep current):");
                                String newName = br.readLine();
                                if (newName.isEmpty()) {
                                    newName = studentToUpdate.getStudentName(); // Keep the current name if no new name provided
                                }
                                System.out.println("Enter new city (leave blank to keep current):");
                                String newCity = br.readLine();
                                if (newCity.isEmpty()) {
                                    newCity = studentToUpdate.getStudentCity(); // Keep the current city if no new city provided
                                }
                                // Update the student details
                                studentDao.updateRecords(studentId, newName, newCity);
                                System.out.println("Student details updated successfully.");
                            } else {
                                System.out.println("Student with ID " + studentId + " not found.");
                            }
                        } catch (Exception e) {
                            System.out.println("Error occurred while updating the student: " + e.getMessage());
                            //e.printStackTrace();
                        }
                        break;
                    case 6:
                        go=false;
                        System.out.println("Exiting...");
                        //sessionFactory.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }catch (Exception e){
                System.out.println("Enter Valid Input");
            }
        }
    }
}