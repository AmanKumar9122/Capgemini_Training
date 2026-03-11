import java.util.*;

class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

interface StudentDAO {
    List<Student> getAllStudents();

    Student getStudent(int id);

    void updateStudent(Student student);

    void deleteStudent(Student student);
}

class StudentDAOImpl implements StudentDAO {
    List<Student> students;

    StudentDAOImpl() {
        students = new ArrayList<>();
        students.add(new Student(1, "Aman"));
        students.add(new Student(2, "Rahul"));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void updateStudent(Student student) {
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                s.setName(student.getName());
            }
        }
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }
}

public class DAOPatternDemo {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAOImpl();

        for (Student s : dao.getAllStudents()) {
            System.out.println(s);
        }

        Student student = dao.getStudent(1);
        student.setName("Updated");

        dao.updateStudent(student);

        System.out.println(dao.getStudent(1));
    }
}