package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Smith");
        queue.offer("Montessori");
        queue.offer("Peralta");
        queue.offer("House");
        return queue;
    }

    public static void printAndEmptyQueue(Queue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = createQueue();
        System.out.println("Imprimiendo y vaciando la cola:");
        printAndEmptyQueue(queue);


        if (queue.isEmpty()) {
            System.out.println("La cola está vacía después de imprimir todos sus elementos.");
        } else {
            System.out.println("La cola aún tiene elementos.");
        }
    }
}


