//Starting Of The Program

import java.util.ArrayList;

class Book {
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("This Book Has Been added To The Library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }
}

    class Library {
        public static void main(String[] args) {
            ArrayList<Book> bk = new ArrayList<>();
            Book b1 = new Book("Algorithms", "CLRS");
            bk.add(b1);

            Book b2 = new Book("Harry Potter", "Jk. Rowling");
            bk.add(b2);

            Book b3  = new Book("The Art Of War", "Sun Tzu");
            bk.add(b3);

            Book b4 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki");
            bk.add(b4);

            MyLibrary l = new MyLibrary(bk);
            l.addBook(new Book("Code", "ZutiNeX"));
            System.out.println(l.books);
            l.issueBook(b3, "ZutiNeX");
            System.out.println(l.books);
        }
    }

//    End Of The Program
