import java.io.*;
public class cameraApp{

   public static void main (String[] args) {
   	
      /* Class declaration */
      Camera cam1 = new Camera();
      Camera cam2 = new Camera();

      // Invoking methods for each object created
      cam1.p(1200);
      cam1.r(7.2);
      cam1.n("Nikon");
      System.out.println(cam1.toString());
      
      cam2.p(1500);
      cam2.r(8.5);
      cam2.n("Canon");
      System.out.println("\n"+cam2.toString());
   }
}


