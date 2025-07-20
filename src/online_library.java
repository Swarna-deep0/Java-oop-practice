class library{
    String[]books;
    int no_of_books;
    library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addbook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println( book + " has been added ");
    }
    void show(){
        System.out.println("Available Books are : ");
        for(String book:this.books){
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issuebook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i] != null && this.books[i].equals(book)){
                System.out.println(book + " book has been issued !");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
    void returnbook(String book){
        addbook(book);
    }
}
public class online_library {
    public static void main(String[] args) {
        library centrallibrary = new library();
        centrallibrary.addbook("think grow");
        centrallibrary.addbook("Algorithms");
        centrallibrary.addbook("grow richer mindset");
        centrallibrary.show();
        centrallibrary.issuebook("think grow");
        centrallibrary.issuebook("harry potter");
        centrallibrary.show();
        centrallibrary.returnbook("think grow");
        centrallibrary.show();
    }
}
