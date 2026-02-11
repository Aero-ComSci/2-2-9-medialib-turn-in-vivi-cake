/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;


  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;



  // CODE TO ADD
  public static String owner = "PLTW";
  private static int numEntries = 0;

  public String addBook(Book b)
  {
    if (numBooks == 0) {
      book = b;
      numEntries += 1;
      numBooks += 1;
      return "Your book has been sucessfully added";
    }
    else {
      return "Sorry this Media Library is full";
    }
  }

  public String addMovie(Movie m)
   {
    if (numMovies == 0) {
      movie = m;
      numEntries += 1;
      numMovies += 1;
      return "Your movie has been sucessfully added";
    }
    else {
      return "Sorry this Media Library is full";
    }
  }

  public String addSong(Song s)
  {
    if (numSongs == 0) {
      song = s;
      numEntries += 1;
      numSongs += 1;
      return "Your song has been sucessfully added";
    }
    else {
      return "Sorry this Media Library is full";
    }
  }
  
  public String toString(){
     String info = "\n" + book;
     info += "\n" + movie + "\n";
     info +=  song + "\n";
     return info;
  }

  // CODE TO ADD
  public Book getBook()
  {
   return book;
  }

  public Movie getMovie()
  {
   return movie;
  }

  public Song getSong()
  {
   return song;
  }

  public static String getOwner()
  {
   return owner;
  }

  public static int getNumEntries()
  {
    return numEntries;
  }
  
  public static int getNumBooks()
  {
    return numBooks;
  }
  
  public static int getNumMovies()
  {
    return numMovies;
  }
  
  public static int getNumSongs()
  {
    return numSongs;
  }
 }