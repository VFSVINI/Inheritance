package POO;
public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();

        f.setNome("Vini");
        f.setIdade(23);
        f.setSexo('M');
        f.setCpf("121.683.872-33");
        f.setCargo("Arquiteto de Software");
        f.setSalario(25.000);

        f.apresentar();
    }
}
