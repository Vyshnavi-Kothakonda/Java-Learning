import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Blue"); 
        System.out.println("HashSet: " + colors);
        colors.remove("Red");
        System.out.println("After Removing Red: " + colors);
        System.out.println("Contains Green? " + colors.contains("Green"));
        System.out.println("Size: " + colors.size());
    }
}
