package Tekrarlar.Repeat03;

public class Book {
    public String name;
    public int pageNumber;
    public String author;
    public String publisher;
    public double price;

    public Book(String name, int pageNumber, String author, String publisher, double price) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public Book() {
    }

    public static void main(String[] args) {
        Book2 book21 = new Book2();
        book21.name = "Seker Portakali";
        book21.author = "Jose Mouro de Vasconcelos";
        book21.pageNumber = 180;
        book21.price = 25;
        book21.publisher = "Can Yayinlari";

        Book2 book2 = new Book2("Kiraz", 175, "Mirac", "YapiKredi", 23);





    }
}
