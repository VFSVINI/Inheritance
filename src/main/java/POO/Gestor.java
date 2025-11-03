package POO;

public class Gestor extends Pessoa implements Pagamento{
    @Override
    public void pagar() {
        System.out.println("Pagar Em Cédulas");
    }

    @Override
    public void falar() {
        System.out.println("Falar Com Lideranças");
    }
}
