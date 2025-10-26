import empresa.Horista;
import empresa.Assalariado;
import empresa.Comissionado;
import empresa.Funcionario;


public class App {
    public static void main(String[] args) {

        
        Funcionario horis = new Horista("nome", 17, 0563626, 10, "Rua 09 casa 10", 0232400002, 0);
        horis.pagamentoum(120.0);  
        
        

        Funcionario comissao = new Comissionado("nome", 17, 0563626, 7, "Rua 09 casa 10", 0232400002, 1518 );
        comissao.pagamentoum(20000.0);

        Funcionario assalario = new Assalariado(null, 0, 0, 9, null, 0, 0);
        assalario.pagamentoum(350);
        
        

        
        
        
    }
}
