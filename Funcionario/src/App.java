import empresa.Horista;
import empresa.Comissionado;
import empresa.Funcionario;

public class App {
    public static void main(String[] args) {
        Funcionario horis = new Horista("nome", 17, 0563626, 10, "Rua 09 casa 10", 0232400002, 0);
        horis.pagamento(120);

         Funcionario comissao = new Comissionado("nome", 17, 0563626, 7, "Rua 09 casa 10", 0232400002, 1518 );
        comissao.pagamento(20000);
        

        
        
        
    }
}
