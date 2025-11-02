package POO;

public class Gestor implements Pagamento{
    @Override
    public void pagar() {
        System.out.println("Pagar Em Cédulas");
    }
}
