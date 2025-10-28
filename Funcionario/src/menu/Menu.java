package menu;
import java.util.Scanner;
import empresa.Comissionado;
import empresa.Funcionario;
import empresa.Horista;




public class Menu {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    Scanner sc4 = new Scanner(System.in);

    Funcionario comi = new Comissionado(null, 0, 0, 9, null, null, 0);
    Funcionario hori = new Horista()

     GeradorDeId idFuncionario = new GeradorDeId();


    public void exibir(){
        System.out.println("-----EMPRESA-----");
        System.out.println("1. Cadastrar novo Funcionario");
        System.out.println("2. Exibir informaçoes do Funcionario");
        System.out.println("3. Pagamento do mes");
        System.out.println("4. Sair");
        System.out.println("---------------");
        int escolha = sc.nextInt();


         switch(escolha){
            case 1:

            System.out.println("---Cadastro de funcionario---");

            System.out.println("Tipo de Funcionario");
            System.out.println("1. Horista ");
            System.out.println("2. Comissionado ");
            System.out.println("3. Assalariado ");
            escolha = sc.nextInt();
            if(escolha == 1){
            System.out.println("Nome do Funcionario: ");
            fun.setnome(sc2.nextLine());
            System.out.println("Idade do Funcionario: ");
            fun.setidade(sc3.nextInt());
            System.out.println("CPF do Funcionario: ");
            fun.setcpf(sc4.nextFloat());
            System.out.println("Endereço do Funcionario: ");
            fun.setendereço(sc2.nextLine());
            System.out.println("Salario do Funcionario: ");
            fun.setsalario(sc3.nextDouble());
           fun.setID(GeradorDeId.gerarIdFuncionario(fun.getnome()));
            
            System.out.println("ID do funcionario " + fun.getID());

            }else if(escolha == 2){
            System.out.println("Nome do Funcionario: ");
            fun.setnome(sc4.nextLine());
            System.out.println("Idade do Funcionario: ");
            fun.setidade(sc2.nextInt());
            System.out.println("CPF do Funcionario: ");
            fun.setcpf(sc3.nextFloat());
            System.out.println("Endereço do Funcionario: ");
            fun.setendereço(sc4.nextLine());
            System.out.println("Salario do Funcionario: ");
            fun.setsalario(sc2.nextDouble());
            fun.setID(GeradorDeId.gerarIdFuncionario(fun.getnome()));
            
            System.out.println("ID do funcionario " + fun.getID());

            }else if(escolha == 3){
            System.out.println("---Funcionario comissionado---");
            System.out.println("Nome do Funcionario: ");
            fun.setnome(sc3.nextLine());
            System.out.println("Idade do Funcionario: ");
            fun.setidade(sc4.nextInt());
            System.out.println("CPF do Funcionario: ");
            fun.setcpf(sc2.nextFloat());
            System.out.println("Endereço do Funcionario: ");
            fun.setendereço(sc3.nextLine());
            fun.setID(GeradorDeId.gerarIdFuncionario(fun.getnome()));
            
            System.out.println("ID do funcionario " + fun.getID());
            

            }else{
                System.out.println("Erro OPÇAO INVALIDA");
            }

            sc.close();
            sc2.close();
            sc3.close();
            sc4.close();

           






         }


        


    }



}
