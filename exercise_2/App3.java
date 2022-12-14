package data;

import java.util.LinkedList;

class App3 {
    public static void main(String[] args) {

        // Create your own music play list by creating a LinkedList object
        LinkedList<String> Playlist = new LinkedList<>();

        // Add 5 new songs to your Play list using the add() method
        Playlist.add("Seneca");
        Playlist.add("State Lines");
        Playlist.add("Repeat Until Death");
        Playlist.add("Carry You");
        Playlist.add("Anchor");

        // Add a new song at the front of the Play list using the addFirst() method
        Playlist.addFirst("Sleepless");

        // Add a new song at the end of the Play list using the addLast() method
        Playlist.addLast("Haven");

        // Display the song at the front of the Play list using the combination of and get() method and the println() method
        System.out.println(Playlist.get(0));

        // Replace the last song using the set() method
        Playlist.set(6, "Birth Place");

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in your Play list using the println method
       
       System.out.println("My updated playlist: " + Playlist);
    }
}