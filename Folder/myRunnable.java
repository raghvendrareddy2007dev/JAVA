import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class myRunnable implements Runnable {
    File file;
    String message;

    myRunnable(String var1, File var2) {
        this.message = var1;
        this.file = var2;
    }

    public void run() {
        try {
            this.m1();
            this.m2();
        } catch (Exception var2) {
        }

    }

    void m1() {
        for(int var1 = 1; var1 <= 5; ++var1) {
            System.out.println(var1);
        }

    }

    synchronized void m2() throws IOException {
        FileWriter var1 = new FileWriter(this.file, true);

        for(int var2 = 1; var2 <= 5; ++var2) {
            String var10001 = Thread.currentThread().getName();
            var1.write(var10001 + this.message + "\n");
        }

        var1.close();
    }

    public static void main(String[] var0) {
        File var1 = new File("output.txt");
        myRunnable var2 = new myRunnable("File", var1);
        Thread var3 = new Thread(var2);
        Thread var4 = new Thread(var2);
        var4.start();
        var3.start();
    }
}