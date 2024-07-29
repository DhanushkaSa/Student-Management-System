package entity;

public class TeacherEntity {

    private String Teacher_Id;
    private String Teacher_Name;
    private Integer Age;
    private String Qualification;
    private String Course_Id;

    public TeacherEntity() {
    }

    public TeacherEntity(String teacher_Id, String teacher_Name, Integer age, String qualification, String course_Id) {
        Teacher_Id = teacher_Id;
        Teacher_Name = teacher_Name;
        Age = age;
        Qualification = qualification;
        Course_Id = course_Id;
    }

    public String getTeacher_Id() {
        return Teacher_Id;
    }

    public void setTeacher_Id(String teacher_Id) {
        Teacher_Id = teacher_Id;
    }

    public String getTeacher_Name() {
        return Teacher_Name;
    }

    public void setTeacher_Name(String teacher_Name) {
        Teacher_Name = teacher_Name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public String getCourse_Id() {
        return Course_Id;
    }

    public void setCourse_Id(String course_Id) {
        Course_Id = course_Id;
    }

    @Override
    public String toString() {
        return "TeacherEntity [Teacher_Id=" + Teacher_Id + ", Teacher_Name=" + Teacher_Name + ", Age=" + Age
                + ", Qualification=" + Qualification + ", Course_Id=" + Course_Id + "]";
    }

}
