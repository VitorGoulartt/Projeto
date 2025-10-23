package empresa;

public class Assalariado extends Funcionario {

    public Assalariado (String nome, int idade, float cpf, float cep, String endereço, int NumeroDaContaBancaria, double Salario ){
        super(nome, idade, cpf,  cep,  endereço,  NumeroDaContaBancaria,  Salario);

    }
    @Override
    public void pagamento(double valor){



    }



}
