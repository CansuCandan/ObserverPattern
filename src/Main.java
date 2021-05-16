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
