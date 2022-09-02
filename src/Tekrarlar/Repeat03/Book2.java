package Tekrarlar.Repeat03;

public class Book2 {

    public String name  ;
    public int pageNumber;
    public String author;
    public String publisher;
    public double price ;

    public Book2(String name, int pageNumber, String author, String publisher, double price) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public Book2() {
    }

    public static void main(String[] args) {
        Book2 book21 = new Book2();
        book21.name="Şeker Portakalı";
        book21.author="Jose Mauro de Vasconcelos";
        book21.pageNumber= 180 ;
        book21.price=25 ;
        book21.publisher="Can Yayınları";

        Book2 book2 = new Book2("Kiraz Mevsimi",145,"Mirac","abc yayınları",75);

    }
}