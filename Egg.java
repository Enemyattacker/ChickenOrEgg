package ru.stetsenko;

/**
 * Created by Alesha on 07.11.2015.
 */
public class Egg extends Thread {

    public void run(){
        for(int i=0; i<10; i++){
            try{
                sleep(1000);
            }
            catch(InterruptedException e){}
            System.out.println("Яйцо");
        }
    }
}

