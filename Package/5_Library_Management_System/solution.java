// library/books/Book.java
package library.books;
public class Book{ public String title; public Book(String t){title=t;} }

// library/members/Member.java
package library.members;
public class Member{ public String name; public Member(String n){name=n;} }

// library/transactions/Transaction.java
package library.transactions;
import library.books.Book;
import library.members.Member;
public class Transaction{
    public void issue(Book b,Member m){
        System.out.println(m.name+" issued "+b.title);
    }
}

// MainApp.java
import library.books.*;
import library.members.*;
import library.transactions.*;
public class MainApp{
    public static void main(String[] args){
        Book b=new Book("Java Basics");
        Member m=new Member("Devansh");
        new Transaction().issue(b,m);
    }
}