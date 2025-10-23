import empresa.Comissionado;
import empresa.Funcionario;

public class App {
    public static void main(String[] args) {
        Funcionario comissao = new Comissionado("nome", 17, 0563626, 727380, "Rua 09 casa 10", 0232400002, 0);
        comissao.pagamento(160);
        
        
        
    }
}
