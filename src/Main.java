public class Main {


public static void main(String[] args) {
        var author = new Author("Isaak", "Asimov");
        var book = new Book("Academy", 1966, author);
        var author1 = new Author("Robert", "Heinlein");
        var book1 = new Book("Starship Troopers", 1957, author1);
        book1.setPublishYear(1960);
        System.out.println(book);
        System.out.println(book1);
        }

        }