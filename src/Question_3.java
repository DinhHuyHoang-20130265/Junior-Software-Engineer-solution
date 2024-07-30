public class Question_3 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i % 3 == 0 ? "b" : (i % 2 == 0 ? "a" : i));
        }
    }
}
