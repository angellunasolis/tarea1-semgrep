import java.io.*;
import java.util.Arrays;
import java.util.List;

public class CommandInjectionDemo {
    private static final List<String> ALLOWED_HOSTS = Arrays.asList("google.com", "localhost");

    public void ejecutarPing(String host) throws Exception {
        if (!ALLOWED_HOSTS.contains(host)) {
            throw new IllegalArgumentException("Host no permitido");
        }
        ProcessBuilder pb = new ProcessBuilder("ping", host);
        pb.start();
    }

    public static void main(String[] args) throws Exception {
        CommandInjectionDemo demo = new CommandInjectionDemo();
        demo.ejecutarPing("localhost");
    }
}
