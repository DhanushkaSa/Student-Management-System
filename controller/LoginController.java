package controller;

import java.net.URL;

import dto.StudentDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import service.ServiceFactory;
import service.ServiceFactory.ServiceType;
import service.custom.StudentService;

public class LoginController {

    private StudentService studentService=(StudentService) ServiceFactory.getInstance().getServiceType(ServiceType.STUDENT);

    @FXML
    private AnchorPane root;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void btnClearOnAction(ActionEvent event) {
         clearLoginData();
    }

    @FXML
    void btnLoginOnAction(ActionEvent event) throws Exception {

        login();

    }

   

    public void clearLoginData(){
        txtUserName.setText("");
        txtPassword.setText("");
    }

    public void login() throws Exception{
        String studentId=txtUserName.getText();
        String password=txtPassword.getText();
        StudentDto dto=studentService.getStudent(studentId, password);
        if(dto==null){
            new Alert(Alert.AlertType.ERROR,"Incorrect username or password !!!").show();        
        }
        else{
            if(dto.getStudent_Id().equals(studentId)|| dto.getPassword().equals(password)){
                this.root.getChildren().clear();
                URL resource = getClass().getResource("/view/Home.fxml");
                 Parent root = FXMLLoader.load(resource);
                 Scene scene=root.getScene();
                this.root.getChildren().add(root);
                 

            }
            else{
                new Alert(Alert.AlertType.ERROR,"Incorrect username or password !!!").show();        

            }
        }

        
    }

}
