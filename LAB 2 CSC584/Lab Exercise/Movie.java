/**

a) Create a Movie class that inherit all data members from VideoTape, but has two new data member:
name of the director (type of String) and a rating (type of String). Create a Movie constructor invoked
by super() to inherit the parent constructor

b) Instantiate Movie object in the main method of TapeStore class by replace
class TapeStore 
VideoTape item2 = new VideoTape("Star Wars" ); with
Movie item2 = new Movie("Jaws", 120, "Spielberg", "PG" );

c) Add show method in Movie class

g) So far the video rental application has two classes: VideoTape and Movie. Create a new class,
MusicVideo that will be like VideoTape but will have two new instance variables: artist (the name of
the performer) and category ("R&B", "Pop", "Classical", "Other" ). Both of these will be Strings. The
MusicVideo class will need its own constructor and its own show() method.

**/

class Movie extends VideoTape {
    
    String director; 
    String rating;
    
    public Movie (String title, int length, String director, String rating) {
        super (title,length); 
        this.director = director; 
        this.rating = rating;
    }
   
    public void show(){
        super.show();
        System.out.println(title + ", " + length + " min. available:" + avail);
        System.out.println("dir: " + director + " " + rating);
    
    }
}