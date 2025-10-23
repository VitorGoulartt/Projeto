package empresa;


public abstract class Funcionario implements pagamento  {
    protected String nome;
    protected int idade;
    protected float cpf;
    protected float cep;
    protected String endereço;
    protected int NumeroDaContaBancaria;
    protected double Salario;

    public Funcionario(String nome, int idade, float cpf, float cep, String endereço, int NumeroDaContaBancaria, double Salario){

        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cep = cep;
        this.endereço = endereço;
        this.NumeroDaContaBancaria = NumeroDaContaBancaria;
        this.Salario = Salario;

    }

    public abstract void pagamento(double valor);

    //public abstract void 

    

}