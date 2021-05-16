import java.util.List;

public abstract class Bidder {

    private String name;

    public Bidder(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
