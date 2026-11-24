import java.io.in
public class java {
    static void m() {
        try {
            throw new RuntimeException("X");
        } finally {
            System.out.print("F");
        }
    }
    public static void main(String[] args) {
        try {
            m();
            System.out.print("M");
        } catch (RuntimeException e) {
            System.out.print(e.getMessage());
        }
    }
}