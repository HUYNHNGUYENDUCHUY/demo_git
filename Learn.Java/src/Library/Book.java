package Library;

import java.util.Scanner;

public class Book {
    private int idBook ;
    private String namePublishing;
    private int numRelease;
    private String author ;
    private int numPage ;
    private String idType = "book" ;

    public Book(int idBook, String namePublishing, int numRelease, String author, int numPage,String idType) {
        this.idBook = idBook;
        this.namePublishing = namePublishing;
        this.numRelease = numRelease;
        this.author = author;
        this.numPage = numPage;
        this.idType = idType;
    }

    public Book() {
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNamePublishing() {
        return namePublishing;
    }

    public void setNamePublishing(String namePublishing) {
        this.namePublishing = namePublishing;
    }

    public int getNumRelease() {
        return numRelease;
    }

    public void setNumRelease(int numRelease) {
        this.numRelease = numRelease;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }
    public Book enterBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter namePublishing :");
        String nameP = sc.nextLine();
        System.out.println("enter author:");
        String author = sc.nextLine();
        System.out.println("enter numPage:");
        int numPage= sc.nextInt();
        System.out.println("enter numRelease:");
        int numR = sc.nextInt();
        System.out.println("enter idBook:");
        int id = sc.nextInt();
        Book book = new Book(id,nameP,numR,author,numPage,idType);
        return book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", namePublishing='" + namePublishing + '\'' +
                ", numRelease=" + numRelease +
                ", author='" + author + '\'' +
                ", numPage=" + numPage +
                ", idType='" + idType + '\'' +
                '}';
    }
}
