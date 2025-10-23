package empresa;


public class Comissionado extends Funcionario{

    public Comissionado (String nome, int idade, float cpf, float cep, String endereço, int NumeroDaContaBancaria, int Salario ){
        
        super(nome, idade, cpf,  cep,  endereço,  NumeroDaContaBancaria,  Salario);


    }

    @Override
    public void comissionado(double horas){
        if(horas > 160){

            horas = horas * 20;// 20 horas de trabalhos

            horas = horas * 0.10;// bonus

            System.out.println(horas);

        }else if(horas <= 160 && horas >= 1){
            horas = horas * 20;
             System.out.println(horas);


        }
         


    }



}
