import java.io.*;

public class CommandInjectionDemo {
    public static void main(String[] args) throws Exception {
        String userInput = args[0];
        String cmd = "ping " + userInput;
        Runtime rt = Runtime.getRuntime();
        Process proc = rt.exec(cmd);
    }
}
