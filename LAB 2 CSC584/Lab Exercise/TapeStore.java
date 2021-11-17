{ 
  public static void main ( String args[] ) 
  { 
    VideoTape item1 = new VideoTape("Jaws", 120 );            
    //VideoTape item2 = new VideoTape("Star Wars" );
    Movie item2 = new Movie("Jaws", 120, "Spielberg", "PG");
    MusicVideo item3 = new MusicVideo("Levitating", 4 ,"Dua Lipa", "Pop");
 
    item1.show();
    item2.show(); 
    item3.show(); 
  } 
} 