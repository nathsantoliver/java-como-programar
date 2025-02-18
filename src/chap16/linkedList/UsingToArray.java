package chap16.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.addLast("red");   // adiciona como o último item
        links.add("pink");  // adiciona ao final
        links.add(3, "green");  // adiciona no terceiro índice
        links.addFirst("cyan"); // adiciona como primeiro

        // obtém elementos LinkedList como um array
        colors = links.toArray(new String[links.size()]);

        System.out.println("colors: ");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
