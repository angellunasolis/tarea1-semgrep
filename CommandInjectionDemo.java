import java.io.*;

public class CommandInjectionDemo {
    public void ejecutarPing(String host) throws Exception {
        String[] cmd = {"/bin/sh", "-c", "ping " + host};
        Runtime.getRuntime().exec(cmd);
    }

    public void ejecutarLS(String path) throws Exception {
        Runtime.getRuntime().exec("ls " + path);
    }

    public static void main(String[] args) throws Exception {
        CommandInjectionDemo demo = new CommandInjectionDemo();
        demo.ejecutarPing(args[0]);
        demo.ejecutarLS(args[1]);
    }
}
