public class Question_4 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("ab");
            } else System.out.println(i % 3 == 0 ? "b" : (i % 2 == 0 ? "a" : i));
        }
    }
}
