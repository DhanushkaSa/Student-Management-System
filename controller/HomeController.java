package controller;

import dto.StudentDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import service.ServiceFactory;
import service.ServiceFactory.ServiceType;
import service.custom.StudentService;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class HomeController {

    private StudentService studentService=(StudentService) ServiceFactory.getInstance().getServiceType(ServiceType.STUDENT);
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
    void btnProfileOnClick(ActionEvent event) throws Exception {
          String username=txtUserName.getText();
          String password=txtPassword.getText();
          StudentDto dto=studentService.getStudent(username, password);
          lblStudentName.setText(dto.getStudent_Name());
          lblAge.setText(Integer.toString(dto.getAge()));
          lblTelephone.setText(dto.getTelephone());
          lblEmail.setText(dto.getEmail());

    }

}
