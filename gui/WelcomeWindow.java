import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class WelcomeWindow extends JWindow{//welcome window.
 public WelcomeWindow(String filename,Frame f,int waitTime){
  super(f);
  JLabel l = new JLabel(new ImageIcon(filename));//image add to label l
  getContentPane().add(l, BorderLayout.CENTER);
  pack();
  Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
  Dimension labelSize = l.getPreferredSize();
  setLocation(screenSize.width/2 - (labelSize.width/2),screenSize.height/2 - (labelSize.height/2));



//press the welcome window,it will be closed. 
addMouseListener(new MouseAdapter(){
   public void mousePressed(MouseEvent e){
    setVisible(false);
    dispose();
    System.exit(0);
   }
  });


  final int pause = waitTime;
  final Runnable closerRunner = new Runnable(){
   public void run(){
    setVisible(false);
    dispose();
    System.exit(0);
   }
  };


  Runnable waitRunner = new Runnable(){
   public void run(){
    try{
     Thread.sleep(pause);
     //invoke closerRunner and wait for waitRunner run.
     SwingUtilities.invokeAndWait(closerRunner);
    }catch(Exception e){
     e.printStackTrace();
     // Catch InvocationTargetException
     // Catch InterruptedException
    }
   }
  };


  setVisible(true);
  Thread waitThread = new Thread(waitRunner, "SplashThread");
  waitThread.start();
 }


public static void main(String []args){
  Frame f=new Frame();
  //f.setVisible(true);
  new WelcomeWindow("welcome.gif",f,5000);
  
 }

}