import java.util.Scanner;
//Book class and display dwtails
class Book{
    String title="Untitled";
    String author="Unknown author";
    int publicationYear;

    public Book(String title,String author){
        this.title = title;
        this.author = author;
        this.publicationYear=0;
    } 
    public Book(String title,String author,int year){
        this.title = title;
        this.author = author;
        this.publicationYear=year;
    } 
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (publicationYear != 0) {
            System.out.println("Published in Year: " + publicationYear);
        }


}}

public class q1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       

        System.out.println("Enter title of the book 1");
        String title1 = s.nextLine();
        System.out.println("Enter Author name of book1");
        String author1 = s.nextLine();
        System.out.println("Enter Publication year of book 1");
        int publicationYear1 = s.nextInt();
        s.nextLine();
        System.out.println("Enter title of the book 2");
        String title2 = s.nextLine();
        System.out.println("Enter Author name of book 2");
        String author2 = s.nextLine();
        System.out.println("Enter Publication year of book 2");
        int publicationYear2 = s.nextInt();

        Book b1 = new Book(title1,author1,publicationYear1);
        Book b2 = new Book(title2,author2,publicationYear2);
        b1.display();
        b2.display();
        s.close();
    }

}