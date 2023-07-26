public class Main {
    public static void main(String[] args) {
        Book book = new Book("Manas");
        Magazine magazine = new Magazine(500);
        System.out.println(book);
        System.out.println(magazine);
        book.Print();
        magazine.Print();
    }
}