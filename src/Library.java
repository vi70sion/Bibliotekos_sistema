public class Library {
    private Book[] books;

    public Library() {
        books = new Book[0];
    }

    public Book[] getBooks() {
        return books;
    }

    public void addBook(Book book){     //pridėti knygą į knygų masyvą
        int arraySize = books.length;
        Book[] booksTemp = new Book[arraySize + 1];
        for (int i = 0; i < arraySize; i++){
            booksTemp[i] = books[i];
        }
        booksTemp[arraySize] = book;
        books = booksTemp;
    }

    public void removeBook(String title){   //pašalina knygą pagal nurodytą pavadinimą.
        int arraySize = books.length;
        Book[] booksTemp = new Book[arraySize-1];
        int j = 0;
        for (int i = 0; i < arraySize; i++){
            if (!books[i].pavadinimas.equals(title)){
                booksTemp[j] = books[i];
                j++;
            }
        }
        books = booksTemp;
    }

    public void findBook(String title) throws BookException {     //grąžina knygą pagal nurodytą pavadinimą
        for (int i = 0; i < books.length; i++){
            if (books[i].pavadinimas.equals(title)){
                System.out.println("Rasta knyga: " + books[i].pavadinimas + ", autorius: " + books[i].autorius);
                return;
            }
        }
        throw new BookException("Nerasta knyga.");
    }


}
