package Threads;

public class FoodOrder extends Thread{
    String task;
    FoodOrder(String task){
        this.task=task;
    }
    public void run(){
        System.out.println(task+"started");
    }

    public static void main(String[] args) {
        FoodOrder cooking=new FoodOrder("Cooking");
        FoodOrder packing=new FoodOrder("Packing");
        FoodOrder delivery=new FoodOrder("Delivery");
        cooking.start();
        packing.start();
        delivery.start();
    }
}
/*
ℹ️Points to remember
💠Extend thread
💠Override run()
💠Use start()
💠It is less flexible because of inheritence limitation
 */
