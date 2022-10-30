package dad.enviaremail;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class View implements Initializable {

    @FXML
    private Button sendButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button closeButton;

    @FXML
    private TextField serverField;

    @FXML
    private CheckBox sslCheckbox;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField toField;

    @FXML
    private TextField subjectField;

    @FXML
    private TextArea messageField;

    public Button getSendButton() {
        return sendButton;
    }

    public Button getClearButton() {
        return clearButton;
    }

    public Button getCloseButton() {
        return closeButton;
    }

    public TextField getServerField() {
        return serverField;
    }

    public CheckBox getSslCheckbox() {
        return sslCheckbox;
    }

    public TextField getEmailField() {
        return emailField;
    }

    public TextField getPasswordField() {
        return passwordField;
    }

    public TextField getToField() {
        return toField;
    }

    public TextArea getMessageField() {
        return messageField;
    }

    public TextField getSubjectField() {
        return subjectField;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
