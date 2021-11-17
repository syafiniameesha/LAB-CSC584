class VideoTape 
{ 
  String title;    // name of the item   
  int length;   // number of minutes   
  boolean avail;    // is the tape in thestore? 
 
  // constructor 
  public VideoTape( String ttl ) 
  { 
    title = ttl; length = 90; avail = true;  
  } 
 
  // constructor 
  public VideoTape( String ttl, int lngth ) 
  { 
    title = ttl; length = lngth; avail = true;  
  }  
  
  public void show() 
  { 
    System.out.println( title + ", " + length + " min. available:" + avail ); 
  } 
   
}  

