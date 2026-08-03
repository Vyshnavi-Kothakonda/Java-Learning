import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Mumbai");
        System.out.println("Cities: " + cities);
        cities.addFirst("Chennai");
        cities.addLast("Bangalore");
        System.out.println("After adding: " + cities);
        cities.remove("Delhi");
        System.out.println("After removing Delhi: " + cities);
        System.out.println("First City: " + cities.getFirst());
        System.out.println("Last City: " + cities.getLast());
    }
}
