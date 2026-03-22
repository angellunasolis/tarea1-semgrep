import java.io.*;

public class CommandInjectionDemo {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingresa comando: ");
        String userInput = reader.readLine();
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(new String[]{"/bin/sh", "-c", userInput});
        BufferedReader output = new BufferedReader(
            new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = output.readLine()) != null) {
            System.out.println(line);
        }
    }
}
