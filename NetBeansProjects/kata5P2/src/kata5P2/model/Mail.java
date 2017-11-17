package kata5P2.model;

public class Mail {
    
    private final String mail;
    
    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getMail() {
        return this.mail;
    }
    
    public String getDomain() {
        return mail.split("@")[1];
    }
    
}