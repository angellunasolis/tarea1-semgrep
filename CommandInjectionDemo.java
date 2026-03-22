public class CommandInjectionDemo {
    public void ejecutarComando(String input) throws Exception {
        Runtime.getRuntime().exec(input);
    }
}
