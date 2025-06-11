import java.awt.event.*;
import javax.swing.*;

public class testapp{
 public static void main(String args[]){ 
  JFrame jfrm = new JFrame("Example");
  
      jfrm.setLayout(null);

      jfrm.setSize(220, 200);

      jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	  
   
      JButton jbtn = new JButton("click");
       
	  jbtn.setBounds(50,50, 100, 50);

      jbtn.addActionlistener(new eventHandler());	  
       
	  jfrm.add(jbtn);

	  jfrm.setVisible(true);
}
 }
    class eventHandler implements Actionlistener{
		
		public void ActionPerformed(ActionEvent ae){
			
			System.out.println("done");
			
		}
		
		
	}