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

    public void addBookByIndex(int index, Book book){     //pridėti knygą į knygų masyvą pagal indeksą
        int arraySize = books.length;
        Book[] booksTemp = new Book[arraySize + 1];
        int j = 0;
        for (int i = 0; i <= arraySize; i++){
            if(i == index){
                booksTemp[i] = book;
            }else{
                booksTemp[i] = books[j];
                j++;
            }
        }
        books = booksTemp;
    }

    public void removeBook(String title) throws BookException{   //pašalina knygą pagal nurodytą pavadinimą.
        int arraySize = books.length;
        Book[] booksTemp = new Book[arraySize-1];
        int j = 0;
        for (int i = 0; i < arraySize; i++){
            if (!books[i].pavadinimas.equals(title)){
                if(j == arraySize - 1) throw new BookException();
                booksTemp[j] = books[i];
                j++;
            }
        }
        books = booksTemp;

    }

    public Book findBook(String title) {     //grąžina knygą pagal nurodytą pavadinimą
        for (int i = 0; i < books.length; i++){
            if (books[i].pavadinimas.equals(title)){
                System.out.println("Rasta knyga: " + books[i].pavadinimas + ", autorius: " + books[i].autorius);
                return books[i];
            }
        }
        return null;
        //throw new BookException("Nerasta knyga.");
    }


}
