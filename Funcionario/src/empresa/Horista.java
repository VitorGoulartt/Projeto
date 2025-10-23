package empresa;


public class Horista extends Funcionario{

    public Horista (String nome, int idade, float cpf, float cep, String endereço, int NumeroDaContaBancaria, double Salario ){
        
        super(nome, idade, cpf,  cep,  endereço,  NumeroDaContaBancaria,  Salario);


    }

    @Override
    public void pagamento(double valor){
        if(valor >= 160){

            valor = valor * 20;// 20 horas de trabalhos

           System.out.println("R$ " + valor);

            valor = valor * 0.10;// bonus

            System.out.println("R$ " + valor);

            this.Salario = (int) valor;
            

        }else if(valor < 160 && valor >= 1){
            valor = valor * 20;
             System.out.println(valor);


        }
         


    }
    

    



}
