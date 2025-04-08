package dayTwelve.innerClasses;

public class AnonInnerClass {
    public static void main(String[] args) {
        Book originalBook = new Book();
        originalBook.showBook();

        Book book = new Book()
        {
            public void showBook() // Anon inner class
            {
                System.out.println("Three Kingdoms");
            }
        };
        book.showBook();
    }
}

class Book {
    public void showBook()
    {
        System.out.println("The Hitchhiker's Guide to the Galaxy");
    }
}