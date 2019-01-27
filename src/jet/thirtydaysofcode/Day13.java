package jet.thirtydaysofcode;

public class Day13 {
    class MyBook /*extends Book*/ {
        // Declare the price instance variable
        int price;

        /**
         * Class Constructor
         *
         * @param title  The book's title.
         * @param author The book's author.
         * @param price  The book's price.
         **/
        // Write your constructor here
        MyBook(String title, String author, int price) {
            //super(title, author);
            this.price = price;
        }

        /**
         * Method Name: display
         * <p>
         * Print the title, author, and price in the specified format.
         **/
        // Write your method here
        void display() {
            //System.out.printf("Title: %s\r\n", title);
            //System.out.printf("Author: %s\r\n", author);
            System.out.printf("Price: %d\r\n", price);
        }
    }
}
