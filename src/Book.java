public class Book {
    public String pavadinimas, autorius;

    public Book(String pavadinimas, String autorius) {
        this.pavadinimas = pavadinimas;
        this.autorius = autorius;
    }
    @Override
    public String toString(){
            return pavadinimas + " " + autorius;
    }

}
