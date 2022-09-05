public class App {
    public static void main(String[] args) throws Exception {
        Motorista mot = new Motorista();

        mot.setNome("Bruno");
        mot.setHabilitacao("123456");

        System.out.printf("A habilitação do motorista %s:%s", mot.getNome(), mot.getHabilitacao());
    }
}
