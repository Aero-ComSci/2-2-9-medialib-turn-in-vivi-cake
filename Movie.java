public class Movie {
    private String title;
    private double duration;
    private int rating;
  
    /*** Constructor ****/
    public Movie(String t, double d)
    {
        title = t;
        duration = d;
        rating = 0;
    }

    /*** Accessor methods ***/
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }
    
    public int getRating() {
        return rating;
    }
    
    public String toString() 
    {
        String info = "\"" + title + "\", that is " + duration + " hours long";
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

    public void setAuthor(double d) {
        duration = d;
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

    public boolean equals(Movie m) {
        return (this.title.equals(m.title) && (this.duration == m.duration));
    }
}


