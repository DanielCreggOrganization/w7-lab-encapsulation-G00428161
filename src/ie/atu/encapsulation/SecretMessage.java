package ie.atu.encapsulation;

public class SecretMessage {
    private String Message;

    public SecretMessage(String message){
        this.Message = message;
    }
    
    public void displayMessage() {
        System.out.println("Secret Message: " + Message);
    }
}
