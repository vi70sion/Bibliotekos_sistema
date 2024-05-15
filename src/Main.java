
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Bibliotekos Sistema
//        Aprašymas:
//        Sukurkite paprastą bibliotekos valdymo sistemą, naudojant Java klases. Sistema turėtų leisti pridėti
//        knygas į masyvą, ieškoti knygų pagal pavadinimą, ir išimti knygas iš sąrašo.
//        Reikalavimai:
//        Sukurkite klasę Book su dviem savybėmis: title (pavadinimas) ir author (autorius).
//        Sukurkite klasę Library su masyvubooks, kuriame saugomos Book klasės objektai.
//        Library klasėje implementuokite šiuos metodus:
//        addBook(Book book): pridėti knygą į sąrašą.
//        removeBook(String title): pašalina knygą pagal nurodytą pavadinimą.
//                findBook(String title): grąžina knygą pagal nurodytą pavadinimą.
//                Sukurkite Main klasę su main metodu, kuriame išbandykite visus Library klasės metodus.

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        Book book1 = new Book("Knyga1", "Autorius1");
        Book book2 = new Book("Knyga2", "Autorius2");
        Book book3 = new Book("Knyga3", "Autorius3");
        Book book4 = new Book("Knyga4", "Autorius4");

        //pridėti knygą į sąrašą
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        spausdintiBooks(library.getBooks());
        System.out.println();

        //pašalina knygą pagal nurodytą pavadinimą
        System.out.println("Pašaliname Knyga2:");
        library.removeBook("Knyga2");
        spausdintiBooks(library.getBooks());
        System.out.println();

        //ieškome knygos sąraše
        System.out.println("Iškome knygos Knyga4:");
        try{
            library.findBook("Knyga4");
        } catch (BookException e) {
            System.out.println("Knyga nerasta.");
        }

    }

    public static void spausdintiBooks(Book[] books){
        for(int i = 0; i < books.length; i++ ){
            System.out.println(books[i].toString());
        }
    }

}