package ru.stetsenko;

/**
 * Created by Alesha on 07.11.2015.
 */
public class Chicken {
    static Egg mAnotherOpinion;

    public static void main(String[] args){

        mAnotherOpinion = new Egg();

        System.out.println("Начинаем спор");

        mAnotherOpinion.start();

        for(int i=0; i<10; i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}

            System.out.println("Курица");
        }

        if(mAnotherOpinion.isAlive()){
            try{
                mAnotherOpinion.join();
            }
            catch(InterruptedException e){}

            System.out.println("Первым появилось яйцо");
        }

        else{
            System.out.println("Первой появилась курица");
        }
        System.out.println("Спор окончен!");
    }
}
