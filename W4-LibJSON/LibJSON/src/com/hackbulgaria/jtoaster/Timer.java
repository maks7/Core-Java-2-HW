package com.hackbulgaria.jtoaster;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import com.nitido.utils.toaster.Toaster;

public class Timer {

    public void execute() {
        
        Toaster toasterManager1 = new Toaster();
        toasterManager1.setBorderColor(new Color(250, 104, 0));
        toasterManager1.setToasterColor(new Color(240, 163, 10));
        toasterManager1.setMessageColor(new Color(0, 0, 0));
        toasterManager1.setToasterMessageFont(new Font("Georgia", Font.ITALIC, 16));
        toasterManager1.showToaster("Start PopMessage");
      
        Toaster toasterManager = new Toaster();
        toasterManager.setToasterWidth(500);
        toasterManager.setToasterHeight(600);
        toasterManager.setToasterColor(new Color(240, 163, 10));
        toasterManager.setBorderColor(new Color(250, 104, 0));
        
        Image image = Toolkit.getDefaultToolkit().getImage(".\\res\\Funny-Animal.jpg");
        toasterManager.setBackgroundImage(image);
        
        toasterManager.setMessageColor(new Color(0, 0, 0));
        
        toasterManager.setDisplayTime(6000);
        toasterManager.setMargin(60);
        toasterManager.setToasterMessageFont(new Font("Georgia", Font.ITALIC, 16));
        toasterManager.setStep(5);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        toasterManager.showToaster("Your eyes have to relax, you should have a break");
        
    }
    
    public void main(String[] args) {
        Timer timer = new Timer();
        timer.execute();
        
    }
}
