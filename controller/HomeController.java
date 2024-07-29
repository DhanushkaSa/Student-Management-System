package controller;

import java.util.ArrayList;

import dto.CourseDto;
import dto.StudentDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import service.ServiceFactory;
import service.ServiceFactory.ServiceType;
import service.custom.CourseService;
import service.custom.StudentService;
import service.custom.TeacherService;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class HomeController {

    private StudentService studentService = (StudentService) ServiceFactory.getInstance()
            .getServiceType(ServiceType.STUDENT);
    private CourseService courseService = (CourseService) ServiceFactory.getInstance()
            .getServiceType(ServiceType.COURSE);

    private TeacherService teacherService=(TeacherService) ServiceFactory.getInstance().getServiceType(ServiceType.TEACHER);

    @FXML
    private Label lblAge;

    @FXML
    private Label lblCourseId;

    @FXML
    private Label lblCourseName;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblStudentName;

    @FXML
    private Label lblTelephone;

    @FXML
    private AnchorPane root;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    private Label lblTeacherAge;

    @FXML
    private Label lblCourseCount;

    @FXML
    private Label lblQualification;

    @FXML
    private Label lblStudentCount;

    @FXML
    private Label lblSubject;

    @FXML
    private Label lblTeacherCount;

    @FXML
    private Label lblTeacherName;

    @FXML
    void btnProfileOnClick(ActionEvent event) throws Exception {
        String username = txtUserName.getText();
        String password = txtPassword.getText();
        StudentDto dto = studentService.getStudent(username, password);
        lblStudentName.setText(dto.getStudent_Name());
        lblAge.setText(Integer.toString(dto.getAge()));
        lblTelephone.setText(dto.getTelephone());
        lblEmail.setText(dto.getEmail());

        CourseDto courseDto = courseService.getCourse(dto.getCourse_Id());
        lblCourseId.setText(courseDto.getCourse_Id());
        lblCourseName.setText(courseDto.getCourse_Name());

    }

    public void teacherPane() throws Exception{
        Integer teacherCount=teacherService.getTeacherCount();
        lblTeacherCount.setText(Integer.toString(teacherCount));
    }

}
