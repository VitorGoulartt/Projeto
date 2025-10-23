package empresa;

public class Comissionado extends Funcionario {

    protected double taxa = 0.08; // %8

    public Comissionado (String nome, int idade, float cpf, int desempenho, String endereço, int NumeroDaContaBancaria, double salario ){
        super(nome, idade, cpf,  desempenho,  endereço,  NumeroDaContaBancaria,  salario);


    }
   
    
    @Override
    public void pagamento(double valor){
        if(valor >= 20000){ // se valor for igual ou maior que a meta de vendas
            System.out.println("Atingido a meta de vendas");
            valor = valor * this.taxa;// valor = Quanto vendas teve / taxa = A porcetagem da que vai receber que e 8%
            this.salario = valor ;// somando o valor da taxa de comissao no salario minimo

            System.out.println(valor );
            System.out.println(this.salario);


        }else{

             System.out.println("A meta de vendas nao atingida");
            valor = valor * this.taxa;// valor = Quanto vendas teve / taxa = A porcetagem da que vai receber que e 8%
            this.salario = valor ;// somando o valor da taxa de comissao no salario minimo

            System.out.println(valor );
            System.out.println(this.salario);



        }
        

    }

}
