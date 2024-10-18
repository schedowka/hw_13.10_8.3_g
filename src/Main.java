public class Main {
    public static void main(String[] args) {
        for (int i = 5; i<=25; i=i+5) {
            for (int j = 1; j <= (30-i)/5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
