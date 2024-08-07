package entity;

public class StudentEntity {
    
    private String Student_Id;
    private String Student_Name;
    private Integer Age;
    private String Telephone;
    private String Email;
    private String password;
    private String course_Id;
    
    public StudentEntity() {
    }

    public StudentEntity(String student_Id, String student_Name, Integer age, String telephone, String email,
            String password, String course_Id) {
        Student_Id = student_Id;
        Student_Name = student_Name;
        Age = age;
        Telephone = telephone;
        Email = email;
        this.password = password;
        this.course_Id = course_Id;
    }

    public String getStudent_Id() {
        return Student_Id;
    }

    public void setStudent_Id(String student_Id) {
        Student_Id = student_Id;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String student_Name) {
        Student_Name = student_Name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCourse_Id() {
        return course_Id;
    }

    public void setCourse_Id(String course_Id) {
        this.course_Id = course_Id;
    }

    @Override
    public String toString() {
        return "StudentEntity [Student_Id=" + Student_Id + ", Student_Name=" + Student_Name + ", Age=" + Age
                + ", Telephone=" + Telephone + ", Email=" + Email + ", password=" + password + ", course_Id="
                + course_Id + "]";
    }

    

    
}
