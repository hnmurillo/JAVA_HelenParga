/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicidad;

/**
 *
 * @author win10
 */
public class Multiplicidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author autho1 = new Author("J.K. Rowling");
        Book book1 = new Book ("Harry Potter and the Sorcerer's Stone");
        Book book2 = new Book ("Harry Potter and the Chamber of Secrets");
        
        autho1.addBook(book2);
        autho1.addBook(book1);
        
        for (int i=0; i<= autho1.getBooks().size(); i++){
            
        }
    }
    
}
