public class MusicVideo extends VideoTape { 
    
    String artist;
    String category;
	
	//constructor
    public MusicVideo( String title, int length, String artist, String category ) {
        super(title,length);
        this.artist = artist;
        this.category = category;
    }
    
    public void show() {
        super.show();
        System.out.println( "The name of the artist : " + artist + "\nThe category : " + category ); }
}