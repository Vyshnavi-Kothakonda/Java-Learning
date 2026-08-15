import java.util.HashSet;
public class HashSetIteration {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("JavaScript");
        System.out.println("Programming Languages:");
        for (String language : languages) {
            System.out.println(language);
        }
    }
}
