/*
 * Activity 2.2.7
 * 
 * The runner for the MediaLib program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    /*
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    System.out.println("Book created " + myBook);

    myLib.addBook(myBook);
    System.out.println("Library:\n" + myLib);

    myBook.setRating(1);
    System.out.println(myBook);

    myBook.setRating(11);
    System.out.println(myBook);
    
    int myRating = 5;
    myBook.adjustRating(myRating);
    System.out.println(myBook);
    
    myBook.adjustRating(6);
    System.out.println(myBook);

    // CODE TO ADD
    Book currBook = myLib.getBook();
    //currBook.setTitle("My Favorite Book");
    System.out.println("Current book: " + currBook);

    System.out.println("Library:\n" + myLib);
    
    Book newBook1 = new Book("The Wishing Spell", "Colfer");
    MediaLib newLib1 = new MediaLib();

    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2); 

    newBook.setAuthor("Tolkien");
    newBook.setTitle("The Lord of the Rings");

    Boolean equal = newBook.equals(myBook);
    System.out.println(equal); 

    Movie myMovie = new Movie("Avatar", 3.33);

    myLib2.addMovie(myMovie);
    System.out.println("Library:\n" + myLib2);
    System.out.println("Library:\n" + myMovie);

    Movie myMovie2 = new Movie("Avatar", 3.33);
    System.out.println(myMovie);

    Boolean equal2 = myMovie.equals(myMovie2);
    System.out.println(equal2);
    */

   /*
   MediaLib.owner = "cake";

    System.out.println(MediaLib.owner);
    System.out.println(MediaLib.getNumEntries());

    Book book = new Book("Lord of the Flies", "William Golding" );
    Movie movie = new Movie("Lord of the Flies", 1.50);

    Book bookTEST = new Book("Harry Potter", "JK Rowling" );
    Movie movieTEST = new Movie("Harry Potter", 2.3);

    MediaLib myMediaLib = new MediaLib();
    String test1 = myMediaLib.addBook(book);
    System.out.println(test1);
    String test2 = myMediaLib.addMovie(movie);
    System.out.println(test2);

    System.out.println(myMediaLib);

    String test3 = myMediaLib.addBook(bookTEST);
    System.out.println(test3);
    String test4 = myMediaLib.addMovie(movieTEST);
    System.out.println(test4);

    System.out.println(myMediaLib);  

    System.out.println(MediaLib.getNumEntries());

    Song song1 = new Song("Everybody Hates Me", 9);
    Song song2 = new Song("This Feeling", 10);
    Song song3 = new Song("Everybody Hates Me", 10);
    Song song4 = new Song("This Feeling", 10);

    boolean songTest1 = song1.equals(song1);
    System.out.println(songTest1);
    
    boolean songTest2 = song1.equals(song2);
    System.out.println(songTest2);

    boolean songTest3 = song1.equals(song3);
    System.out.println(songTest3);

    boolean songTest4 = song1.equals(song4);
    System.out.println(songTest4);

    String addSong = myMediaLib.addSong(song1);
    System.out.println(addSong); 
    System.out.println(myMediaLib); 

    System.out.println(MediaLib.getNumEntries());
    */

    // CODE TO ADD
  MediaLib myLib = new MediaLib();
  myLib.addMovie(new Movie("Raiders of the Lost Ark", 1.9));
  myLib.addBook(new Book("1984", "Orwell"));
  myLib.addSong(new Song("In Your Eyes"));
  System.out.println(MediaLib.getOwner() + "'s Library:\n" + myLib);

  System.out.println(myLib.getNumBooks());
  System.out.println(myLib.getNumMovies());
  System.out.println(myLib.getNumSongs());
  System.out.println(myLib.getNumEntries());


  }
}