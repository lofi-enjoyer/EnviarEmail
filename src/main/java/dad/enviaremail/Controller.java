package dad.enviaremail;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import java.io.IOException;

public class Controller {

    private View view;
    private Model model;

    private Stage stage;

    public Controller(Stage stage) {
        this.stage = stage;

        FXMLLoader loader = new FXMLLoader(View.class.getResource("EnviarEmail.fxml"));
        try {
            Scene scene = new Scene(loader.load(), 480, 360);
            stage.setTitle("Enviar Email");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        view = loader.getController();
        model = new Model();

        model.serverPropertyProperty().bindBidirectional(view.getServerField().textProperty());
        model.sslPropertyProperty().bind(view.getSslCheckbox().selectedProperty());
        model.emailPropertyProperty().bindBidirectional(view.getEmailField().textProperty());
        model.passwordPropertyProperty().bindBidirectional(view.getPasswordField().textProperty());
        model.toPropertyProperty().bindBidirectional(view.getToField().textProperty());
        model.subjectPropertyProperty().bindBidirectional(view.getSubjectField().textProperty());
        model.messagePropertyProperty().bindBidirectional(view.getMessageField().textProperty());

        view.getSendButton().setOnAction(this::onSendClick);
        view.getClearButton().setOnAction(this::onClearClick);
        view.getCloseButton().setOnAction(this::onCloseClick);
    }

    private void onSendClick(ActionEvent event) {
        try {
            String[] hostParts = model.getServerProperty().split(":");
            Email email = new SimpleEmail();
            email.setHostName(hostParts[0]);
            email.setSmtpPort(Integer.parseInt(hostParts[1]));
            email.setAuthenticator(new DefaultAuthenticator(model.getEmailProperty(), model.getPasswordProperty()));
            email.setSSLOnConnect(model.isSslProperty());
            email.setFrom(model.getEmailProperty());
            email.setSubject(model.getSubjectProperty());
            email.setMsg(model.getMessageProperty());
            email.addTo(model.getToProperty());
            email.send();
        } catch (EmailException e) {
            throw new RuntimeException(e);
        }
    }

    private void onClearClick(ActionEvent event) {
        model.setServerProperty("");
        model.setEmailProperty("");
        model.setPasswordProperty("");
        model.setToProperty("");
        model.setSubjectProperty("");
        model.setMessageProperty("");
    }

    private void onCloseClick(ActionEvent event) {
        stage.close();
    }

}