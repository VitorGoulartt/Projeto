package empresa;

public class Comissionado extends Funcionario {

    private double taxa;

    public Comissionado (String nome, int idade, float cpf, float cep, String endereço, int NumeroDaContaBancaria, double Salario ){
        super(nome, idade, cpf,  cep,  endereço,  NumeroDaContaBancaria,  Salario);


    }

    public void pagamento(double valor){
        if(valor >= 1){
            this.taxa = valor/ 8;// recebe com base no total de vendas realizadas e na
                                 //taxa de comissão estabelecida que e 8.
            valor = valor * 8;

            System.out.println(valor);


        }else if()
        

    }

}
