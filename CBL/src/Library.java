import java.util.ArrayList;

/**
 * Created by touit on 26/02/2017.
 *  * Library

 A Book has a title and some pages.
 A CD has a title and a time.
 A DVD has a kind, a title, an indication of it is in 3D and time.
 There are 4 kind of movie: horror, fun, action, musical.

 The Library has these methods only:

 ArrayList putBooks(ArrayList books);
 ArrayList putDvds(ArrayList dvds);
 ArrayList putCDs(ArrayList cds);
 boolean isOpen(int hour);
 The Library can storage 3 DVDs only.
 If there are already 3 DVDs and the user want to give more. The library doesn't accept these dvds.
 If there are already some DVDs and the user try to give a book that the library already has. The library doesn't accept these dvds.

 For example:
 The library has 3 DVDs and the user give 4 DVDs. The library doesn't accept it. So the library has 3 DVD.
 The library have 1 DVD like DVD dvd = new DVD("dvd", 120, Movie.HORROR, false) and the user give the same DVD. The library doesn't accept it.

 Implement library and create unit test
 */
public class Library {

    private static final int openHour = 7;
    private static final int closeHour = 21;

    private ArrayList<Book> Books= new ArrayList();
    private ArrayList<Cd> Cds= new ArrayList();
    private ArrayList<Dvd> Dvds= new ArrayList();




    public ArrayList putBooks(ArrayList<Book> books){

        this.Books.addAll(books);
        return this.Books;

    }

    public ArrayList putDvds(ArrayList<Dvd> dvds){


//A finir


    }

    public ArrayList putCDs(ArrayList<Cd> cds){

        this.Cds.addAll(cds);
        return this.Cds;
    }

    public boolean isOpen(int hour) {
        if (hour >= openHour && hour <= closeHour) {
            return true;
        }else{
        return false;
    }}



}
