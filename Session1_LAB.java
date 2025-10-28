// Class: Book
// Demonstrates constructors, object creation, and the 'this' keyword

class Book {
    // Instance variables
    String title;
    String author;
    double price;

    // Parameterized Constructor using 'this' keyword
    Book(String title, String author, double price) {
        this.title = title;     // 'this' differentiates instance variables from parameters
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("📘 Book Details:");
        System.out.println("Title  : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price  : ₹" + this.price);
        System.out.println("--------------------------------");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects using the constructor
        Book book1 = new Book("Atomic Habits", "James Clear", 499.0);
        Book book2 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 399.0);

        // Displaying book details
        book1.displayDetails();
        book2.displayDetails();
    }
}