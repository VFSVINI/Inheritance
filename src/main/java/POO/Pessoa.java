package POO;

public class Pessoa {

    private String nome;
    private char sexo;
    private int idade;

    public Pessoa(){

        nome = "";
        sexo = ' ';
        idade = 0;

        }

    public Pessoa(String nome, char sexo, int idade){

        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;

    }

    public String getNome(){

        return nome;
    }

    public char getSexo(){

        return sexo;
    }

    public int getIdade(){

        return idade;
    }

    public void setNome(String nome){

        this.nome = nome;
    }

    public void setSexo(char sexo){

        this.sexo = sexo;
    }

    public void setIdade(int idade){

        this.idade = idade;
    }

    public void apresentar(){

        System.out.println(nome);
        System.out.println(sexo);
        System.out.println(idade);
    }

}
