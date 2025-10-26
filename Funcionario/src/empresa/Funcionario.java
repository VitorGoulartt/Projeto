package empresa;


public abstract class Funcionario implements pagamento  {
    protected String nome;
    protected int idade;
    protected float cpf;
    protected Integer desempenho;
    protected String endereço;
    protected int ID;
    protected double salario;
    protected double valor;

    public Funcionario(String nome, int idade, float cpf, int desempenho, String endereço, int ID, double salario){
        //contrutor para definir os valores do funcionario

        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.desempenho = desempenho;
        this.endereço = endereço;
        this.ID = ID;
        this.salario = salario;

    }

    public void pagamentoum(double valor){
        

    }
    
    
    

    

    public double getsalario(){
        return this.salario;
    }

    //public abstract void 

    

}