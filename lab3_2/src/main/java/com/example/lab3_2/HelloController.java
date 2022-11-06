package com.example.lab3_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

class buttonRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is created");

        while(true) {}
    }
}

class buttonThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is created");
        while(true) {}
    }
}

public class HelloController {
    //А)
    /*@FXML
    public void onButtonClicked(ActionEvent e) {
        while(true) {}
    }*/



    @FXML
        public void onButtonClicked(ActionEvent e) {

        /*buttonThread t1  = new buttonThread();
        t1.start();*/
        buttonRunnable t2  = new buttonRunnable();
        new Thread(t2).start();

    }


}