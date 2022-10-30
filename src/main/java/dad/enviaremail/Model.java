package dad.enviaremail;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

    private StringProperty serverProperty;
    private BooleanProperty sslProperty;
    private StringProperty emailProperty;
    private StringProperty passwordProperty;
    private StringProperty toProperty;
    private StringProperty subjectProperty;
    private StringProperty messageProperty;

    public Model() {
        serverProperty = new SimpleStringProperty();
        sslProperty = new SimpleBooleanProperty();
        emailProperty = new SimpleStringProperty();
        passwordProperty = new SimpleStringProperty();
        toProperty = new SimpleStringProperty();
        subjectProperty = new SimpleStringProperty();
        messageProperty = new SimpleStringProperty();
    }

    public String getServerProperty() {
        return serverProperty.get();
    }

    public StringProperty serverPropertyProperty() {
        return serverProperty;
    }

    public void setServerProperty(String serverProperty) {
        this.serverProperty.set(serverProperty);
    }

    public String getEmailProperty() {
        return emailProperty.get();
    }

    public StringProperty emailPropertyProperty() {
        return emailProperty;
    }

    public void setEmailProperty(String emailProperty) {
        this.emailProperty.set(emailProperty);
    }

    public String getPasswordProperty() {
        return passwordProperty.get();
    }

    public StringProperty passwordPropertyProperty() {
        return passwordProperty;
    }

    public void setPasswordProperty(String passwordProperty) {
        this.passwordProperty.set(passwordProperty);
    }

    public String getToProperty() {
        return toProperty.get();
    }

    public StringProperty toPropertyProperty() {
        return toProperty;
    }

    public void setToProperty(String toProperty) {
        this.toProperty.set(toProperty);
    }

    public String getSubjectProperty() {
        return subjectProperty.get();
    }

    public StringProperty subjectPropertyProperty() {
        return subjectProperty;
    }

    public void setSubjectProperty(String subjectProperty) {
        this.subjectProperty.set(subjectProperty);
    }

    public String getMessageProperty() {
        return messageProperty.get();
    }

    public StringProperty messagePropertyProperty() {
        return messageProperty;
    }

    public void setMessageProperty(String messageProperty) {
        this.messageProperty.set(messageProperty);
    }

    public boolean isSslProperty() {
        return sslProperty.get();
    }

    public BooleanProperty sslPropertyProperty() {
        return sslProperty;
    }

    public void setSslProperty(boolean sslProperty) {
        this.sslProperty.set(sslProperty);
    }

}
