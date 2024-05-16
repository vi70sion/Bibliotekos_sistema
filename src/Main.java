
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BookException {

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
        Book book5 = new Book("Knyga5", "Autorius5");

        //pridėti knygą į sąrašą
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        spausdintiBooks(library.getBooks());
        System.out.println();

        //pašalina knygą pagal nurodytą pavadinimą
        try{
            String salinamaKnyga = "Knyga5";
            System.out.println("Pašaliname " + salinamaKnyga);
            library.removeBook(salinamaKnyga);
            spausdintiBooks(library.getBooks());
        }catch (BookException e){
            System.out.println("Knyga nerasta.");
        }
        System.out.println();

        //ieškome knygos sąraše
        String ieskomaKnyga = "Knyga2";
        System.out.println("Ieškome knygos " + ieskomaKnyga);
        if (library.findBook(ieskomaKnyga) == null) System.out.println("Knyga " + ieskomaKnyga + " nerasta.");
        System.out.println();

        //pridėti knygą į knygų masyvą pagal indeksą
        int knygosIndex = 2;
        System.out.println("Įdedame Knyga5 į indeksą: " + knygosIndex);
        library.addBookByIndex(knygosIndex, book5);
        spausdintiBooks(library.getBooks());

    }

    public static void spausdintiBooks(Book[] books){
        for(int i = 0; i < books.length; i++ ){
            System.out.println(books[i].toString());
        }
    }

}