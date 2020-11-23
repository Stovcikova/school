package sk.kosickaakademia.stovcikova.homework.queue;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Test {
    /*public static void main(String[] args) {
        char arr[] = {3,1,4,1,5,9};
        LinkedList<Integer>fifo = new LinkedList<Integer>();

        for (int i=0; i< arr.length; i++){
            fifo.add(new Integer(arr[i]));

            System.out.println(fifo.removeFirst()+".");
            while (!fifo.isEmpty()){
                System.out.println(fifo.removeFirst());
            }
            System.out.println();
        }
    }*/

    public static void main(String[] args) {
        Queue<Integer> fronta = new Queue<>(4);
        fronta.enqueue(1);
        fronta.enqueue(2);
        fronta.enqueue(3);
        fronta.enqueue(4);
        fronta.print();
    }

    }
