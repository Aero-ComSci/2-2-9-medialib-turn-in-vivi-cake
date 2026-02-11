/*
 * Activity 2.2.8.
 *
 * A Song class for the MediaLibrary program
 */

public class Song
{
  private String title;
  private int rating;
  
  /*** Constructor ****/
  public Song(String t, int r)
  {
    title = t;
    rating = r;
  }

  public Song(String t)
  {
    title = t;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\"";
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setRating(int rating){
    if (((this.rating + rating) >= 0) && ((rating + rating) <= 10)) {
      this.rating = rating;
    }
    else {
      rating = 0;
    }
  }
  
  public void adjustRating(int change){
    if (((rating + change) >= 0) && ((rating + change) <= 10)) {
      this.rating += change;
    }
  }

  public boolean equals(Song s) {
    return (this.title.equals(s.title) && (this.rating == s.getRating()));
  }
}
