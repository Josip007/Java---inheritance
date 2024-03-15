
public class Student extends Person {

    @Override
    public void displayInfo() {
       //super.displayInfo();
        System.out.println("displayInfo from student class...");
    }

    private int studentId;
    private String major;

    public Student(String name, int age, int studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return "toString method from Student extended class";
    }
}
