import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;
    private double price;
    private Bidder bidder;

    private List<User> users;

    public Product(String productName, double price) {
        users = new ArrayList<User>();
        setProductName(productName);
        setPrice(price);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Bidder getBidder() {
        return bidder;
    }

    public void setBidder(Bidder bidder) {
        this.bidder = bidder;
    }

    public void giveBid(User user, double bid){
            if(bid > this.price) {
                if(!users.contains(user))
                    users.add(user);
                for (User userss : users)
                    userss.inform(bid);
            }

        }

    }

