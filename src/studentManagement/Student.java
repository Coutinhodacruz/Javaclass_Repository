package studentManagement;

public class Student {
    private String firstName;

    private String lastname;

    private String id;

    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Student apply(StudentData studentData){
        Student student = new Student();
        School school = new School();
        student.setFirstName(studentData.getFirstName());
        student.setLastname(studentData.getLastName());

        student.setEmail(studentData.getEmail());
        school.admitStudent(student);



        return student;
    }


}
