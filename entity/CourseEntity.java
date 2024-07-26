package entity;

public class CourseEntity {
    
    private String Course_Id;
    private String Course_Name;
    private Integer Credit;
    
    public CourseEntity() {
    }

    public CourseEntity(String course_Id, String course_Name, Integer credit) {
        Course_Id = course_Id;
        Course_Name = course_Name;
        Credit = credit;
    }

    public String getCourse_Id() {
        return Course_Id;
    }

    public void setCourse_Id(String course_Id) {
        Course_Id = course_Id;
    }

    public String getCourse_Name() {
        return Course_Name;
    }

    public void setCourse_Name(String course_Name) {
        Course_Name = course_Name;
    }

    public Integer getCredit() {
        return Credit;
    }

    public void setCredit(Integer credit) {
        Credit = credit;
    }

    @Override
    public String toString() {
        return "CourseEntity [Course_Id=" + Course_Id + ", Course_Name=" + Course_Name + ", Credit=" + Credit + "]";
    }

    
}
