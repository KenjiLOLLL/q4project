import java.util.Scanner;
import javax.swing.*;

class structure {



    public static void main(String args[]) {

    }
    

}


class gui{
    public static void main(String args[]){
       JFrame frame = new JFrame("Voting Program (Testing)");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       JButton button = new JButton("Login to your account");
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setVisible(true);
    }
}