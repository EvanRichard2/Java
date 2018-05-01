//code by CW Coleman
//save as JavaPlot.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Wait {
  public static void oneSec() {
    try {
      Thread.currentThread().sleep(1000);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
  public static void manySec(long s) {
     try {
       Thread.currentThread().sleep(s * 1000);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
      public static void millSec(long s) {
     try {
       Thread.currentThread().sleep(s);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
}


public class JavaPlot extends JFrame {
   public JavaPlot()
   {
      super( "Java Plot" );
      setSize(500,500);
      setVisible( true );
   }
   public void paint( Graphics g ){
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		    // only change code below this line
        int x, y, h, k, t;
        int iRed, iGreen, iBlue, aiRed, aiGreen, aiBlue;//integer RGB
        double sRed, sGreen, sBlue;// double start RGB
        double eRed, eGreen, eBlue;// double end RGB
        double aRed, aGreen, aBlue;// ajust RGB
        x = 0;  y = 0; h = 0; k = 0; t = 0;
        double theta;
        iRed = 127;
        iGreen = 64;
        iBlue = 0;
        aiRed = 3;  // adjust integer Red
        for (x = 0;x <100;x++){
		        if (iRed > 255) iRed = 0;
            if (iRed < 0) iRed = 255;
            g.setColor(new Color(iRed,iGreen,iBlue));
            g.drawLine(250,100,250-h,200-k);//Top
            g.drawLine(250,100,250+h,200-k);//Top
            g.drawLine(350,300,350-h,100+k);//right
            g.drawLine(150,300,150+h,100+k);//Left
            g.drawLine(150,300,150+h,100+k);//down
            g.drawLine(350,100,350-h,200-k);//Top
            g.drawLine(350,100,350+h,200-k);//Top
            g.drawLine(150,100,150-h,200-k);//Top
            g.drawLine(150,100,150+h,200-k);//Top
            g.drawLine(250,150,250-h,200-k);//Top
            g.drawLine(250,150,250+h,200-k);//Top
            g.drawLine(250,50,250-h,150-k);//Top
            g.drawLine(250,50,250+h,150-k);//Top
            g.drawLine(150,400,150+h,300);//down
            g.drawLine(350,400,350-h,300);//down
            


            iRed = iRed + aiRed;
            h = h + 1;
            k = k + 1;
		        System.out.println("Ctrl+c to stop. t = " + t+" h= "+h+" k ="+k);
		        Wait.millSec(125);  // call to Wait class
            // only change code above this line
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      }//end for
  }

// execute application
  public static void main( String args[] ){
    JavaPlot myobject = new JavaPlot();//change this
  	   	// adapter to handle only windowClosing event
        myobject.addWindowListener(
  			   new WindowAdapter() {
				      public void windowClosing( WindowEvent event )
				          {System.exit( 0 );}
                }  // end WindowAdapter
        ); // end call to addWindowListener
   }//end main
 }// end class Painter
