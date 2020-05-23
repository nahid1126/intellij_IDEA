package com.first_swing.com;

import javax.swing.*;

public class SwingDemo {
    public SwingDemo(){
         //create a new JFrame container
        JFrame jFrame=new JFrame("First Swing application");

        //Give it a size
        jFrame.setSize(275,100);

        //Terminate the program when the user close the application
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
	// write your code here
    }
}
