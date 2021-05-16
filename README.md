# ObserverPattern
##Observer Design Pattern Example (Code + Description + UML Diagram)

In this example include Observer Design Pattern how it is works and how we can code.

## What is the Observer Design Pattern?
  Whenever there is a change in a class, there may be classes that should be aware of the changes in that class. These classes are called observer classes. 
  They all derive from the same base class and there is a list of this base class type in the class to be followed.
  Observer is a design pattern that notifies the objects in the list of changes that occur in an object.
  

## Observer Design Pattern Example
This is an example of an auction application. The products are sold by auction and the price of the product is determined by increasing the price of the product by the buyers. When the buyer places an offer for the product, the new price information must be notified by e-mail to other buyers who have previously offered the product.


```
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
```


```
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
```



```
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


```




```
public class Main {

    public static void main(String[] args) {
        User user1 = new User("user1 ", "user1@mail.com");
        User user2 = new User("user2", "user2@mail.com");

        Product item1 = new Product("Computer", 1000);

        System.out.println("1. bid");
        item1.giveBid(user1,1500);
        System.out.println("2. bid");
        item1.giveBid(user2,1700);
        System.out.println("3. bid");
        item1.giveBid(user1,2000);
        System.out.println("4. bid");
        item1.giveBid(user2,2500);

    }
}
```
