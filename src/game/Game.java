
package game;

import java.awt.Toolkit;
import java.util.*;
import java.io.*;
public class Game {


    public static void main(String[] args) {
        startScreen start = new startScreen(); 
        Toolkit tk = Toolkit.getDefaultToolkit();
        int width =(int) tk.getScreenSize().getWidth();
         int height =(int) tk.getScreenSize().getHeight();

        start.setSize(width,height);
        start.setVisible(true);
    }
    
}
