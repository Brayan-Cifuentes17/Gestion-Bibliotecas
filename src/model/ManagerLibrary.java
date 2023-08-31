package model;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ManagerLibrary {

        Queue<Books>booksAdd= new LinkedList<>();
        Stack<Books>booksReturned = new Stack<>();
        Queue<Books> booksLed = new LinkedList<>();


        public void addBooks(String tittle,String author){
                booksAdd.add(new Books(tittle,author));
        }


        public void returnedBooks(String tittle){

                for (Books bookPr:booksLed) {
                        if (bookPr.getTittle().equalsIgnoreCase(tittle)){
                                booksAdd.add(bookPr);
                                booksReturned.add(bookPr);
                                booksLed.remove(bookPr);

                        }
                }
        }
        public void ledBook(String tittle){
                for (Books book:booksAdd) {
                        if (book.getTittle().equalsIgnoreCase(tittle)){
                                booksLed.add(book);
                                booksAdd.remove(book);

                        }
                }
        }
        public String showBooks(){
                String box="LIBROS: \n";
                for (Books book:booksAdd) {
                        box+= book.toString();
                }
                return box;
        }
        public String showBooksReturned(){
                String box="LIBROS DEVUELTOS\n";
                for (Books book:booksReturned) {
                        box+=book.toString();
                }
                return box;
        }

        public String showBooksLed(){

                String box="LIBROS PRESTADOS \n";
                for (Books book:booksLed) {
                        box+=book.toString();
                }
                return box;
        }


}
