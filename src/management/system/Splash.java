package management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash(){


        // for image set on frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.gif")); // image take from system
        Image i2 = i1.getImage().getScaledInstance(1170,650, Image.SCALE_DEFAULT); // image set on frame to scaled.
        ImageIcon i3 = new ImageIcon(i2); // image directly not set on frame that's why scaled image i2 give in i3
        JLabel image = new JLabel(i3); // image ko frame par laane ke liye but iska another use hai
        image.setBounds(0,0,1170,650);
        add(image);

        // for frame
        setSize(1170, 650); // frame size
        setLocation(200, 50); // location by default 0, 0 that's why set the location.
        setLayout(null); // default layout null bcz i set layout according to me.
        setVisible(true); // visibility by default hidden, true enable visibility.


        // for sleep our thread using Thread class and sleep method
        try{
            Thread.sleep(5000); // after 5 second frame closed and login page open
            setVisible(false); // visibility off after 5 second
            new Login();
        }catch (Exception e){
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {
        new Splash();
    }
}
