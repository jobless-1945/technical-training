package dsa.Collections;

import dsa.Collections.base.FlashSaleOrder;

public class Printer <T>{
    T data;
    Printer(T data){
        this.data=data;
    }
    void printValue(){
        System.out.println("Data: "+data);
    }

    public static void main(String[] args) {
        Printer<Integer> integerPrinter=new Printer<>(1);
        Printer<String> stringPrinter=new Printer<>("Java");
        Printer<Boolean> booleanPrinter=new Printer<>(true);
        Printer<Float> floatPrinter= new Printer<>(1.2F);
        Printer<Double> doublePrinter=new Printer<>(1.3);
        integerPrinter.printValue();
        stringPrinter.printValue();
        floatPrinter.printValue();
        booleanPrinter.printValue();
        doublePrinter.printValue();
    }
}
