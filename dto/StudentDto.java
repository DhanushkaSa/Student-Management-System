package dto;

import java.util.ArrayList;

public class StudentDto {
    
    private String Student_Id;
    private String Student_Name;
    private Integer Age;
    private String Telephone;
    private String Email;
    private String password;
    private ArrayList<CourseDto> CourseDto;
    
    public StudentDto() {
    }

    public StudentDto(String student_Id, String student_Name, Integer age, String telephone, String email,
            String password, ArrayList<dto.CourseDto> courseDto) {
        Student_Id = student_Id;
        Student_Name = student_Name;
        Age = age;
        Telephone = telephone;
        Email = email;
        this.password = password;
        CourseDto = courseDto;
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

    public ArrayList<CourseDto> getCourseDto() {
        return CourseDto;
    }

    public void setCourseDto(ArrayList<CourseDto> courseDto) {
        CourseDto = courseDto;
    }

    @Override
    public String toString() {
        return "StudentDto [Student_Id=" + Student_Id + ", Student_Name=" + Student_Name + ", Age=" + Age
                + ", Telephone=" + Telephone + ", Email=" + Email + ", password=" + password + ", CourseDto="
                + CourseDto + "]";
    }

    
}
