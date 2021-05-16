public class User extends Bidder {
    private String mail;

    public User(String name, String mail){
        super(name);
        setMail(mail);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void inform(double bid) {
        System.out.println(getName() + " to price change (" + bid + ") it was reported by mail.");
    }
}
