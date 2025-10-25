package empresa;

public class Assalariado extends Funcionario  {

    

    

    public Assalariado (String nome, int idade, float cpf, int desempenho, String endereço, int NumeroDaContaBancaria, double salario ){
        super(nome, idade, cpf,  desempenho,  endereço,  NumeroDaContaBancaria,  salario);

    }
    
    @Override
    public void pagamentoum(double valor){//valor = bonus decido pelo empresa, que so e aplicado de acordo com desempenho do funcionario na empresa

        if(this.desempenho >= 8){
            this.salario = 1518 + valor;
            System.out.println("Funcionario teve Bom desempenho\n" +  " Salario: R$ "  + this.salario);
            

        }else if(this.desempenho <=7 && this.desempenho >= 1){
            this.salario = 1518;
            System.out.println("Salario: R$ " + this.salario);

            


        }
        
        else if (this.desempenho == null || this.desempenho == 0 ){
            System.out.println("Desempenho nao informado");
        }
        




    }



}
