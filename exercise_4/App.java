import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> Classmate = new LinkedList<>();

        // Adds elements to the queue
        Classmate.add("Jobert Papina");
        Classmate.add("Luis Kalbo Versoza");
        Classmate.add("Giga Chad Tenerife");
        Classmate.add("Jaime Pineda");
        Classmate.add("Bimby Bolanos");

        // Display all elements of the queue.
        System.out.println(Classmate);

        // Removes the element at the front of the queue
        Classmate.remove(Classmate);

        // Returns the number of elements in the queue.
        System.out.println(Classmate.size());

        // Shows the element at the front of the queue
        System.out.println(Classmate.peek());

        // Display all elements of the queue.
        System.out.println(Classmate);

        Queue<String> ClassmateList = new LinkedList<>();

        // Adds elements to the queue
        ClassmateList.add("Dora The Bablis");
        ClassmateList.add("Richael Paller");
        ClassmateList.add("Allen Kalbo Laureano");
        ClassmateList.add("Rizjake The Second");
        ClassmateList.add("Victor Calalang");

        // Display all elements of the queue.
        System.out.println( ClassmateList);

        // Removes the element at the front of the queue
        ClassmateList.remove( ClassmateList);

        // Returns the number of elements in the queue.
        System.out.println(ClassmateList.size());

        // Shows the element at the front of the queue
        System.out.println(ClassmateList.peek());

        // Display all elements of the queue.
        System.out.println(ClassmateList);
    }
}
