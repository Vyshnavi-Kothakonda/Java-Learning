public class FindCommonElements {
    public static void main(String[] args) {
        int[] first = {10, 20, 30, 40, 50};
        int[] second = {30, 40, 60, 70, 80};
        System.out.print("Common Elements: ");
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    System.out.print(first[i] + " ");
                    break;
                }
            }
        }
    }
}
