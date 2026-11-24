Q11.Debug and predict the output:
static void fetch() {
    try {
        throw new IOException("Disk error");
    } catch (IOException e) {
        throw new RuntimeException("Fetch failed");
    }
}

*/
import java.io.IOException;
class test
{
    static void fetch() {
    try {
        throw new IOException("Disk error");
    } catch (IOException e) {
        throw new RuntimeException("Fetch failed");
    }
}
public static void main(String[] args)
{
    fetch();
}
}