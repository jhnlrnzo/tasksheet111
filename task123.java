class Book{
    private String title;
    private String author;
    private int yearPublished;
    private double price;
    private int bookIndex;

    private static int bookCount = 1;

    public Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;

        this.bookIndex = bookCount++;

        
    }
    public void print(){
        System.out.println("\nBook: " + bookIndex +"\nTitle: " + title + "\nAuthor: " + author + "\nYear Published: " + yearPublished + "\nPrice: " + price);
    }
}
public class task123{
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "john Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);
        book1.print();
        book2.print();
        book3.print();
    }
}