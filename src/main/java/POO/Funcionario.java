package POO;

public class Funcionario extends Pessoa implements Pagamento{

    String cpf;
    double salario;
    String cargo;


    //Polimorfismo
    //Sobrecrita @Override


    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    public void setCargo(String cargo) {

        this.cargo = cargo;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println(cpf);
        System.out.println(salario);
        System.out.println(cargo);

    }

    //Sobrecarga
    public void almocar(){

    }

    public void almocar(int opcao){


    }

    public void almocar(String opcao){


    }

    public void almocar(String texto, int opcao){


    }

    public void almocar(String texto, int opcao, double formaPagamento){


    }

    public void almocar(int opcao, String texto, double formaPagamento){


    }

    @Override
    public void pagar() {

        System.out.println("Pagamento Via Pix");
    }
}
