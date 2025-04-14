import java.util.ArrayList;

//   - Criar 5 classes com 7 atributos privados cada
//    - Todas as classes devem conter contrutores
//    - Fazer um array de 1 das classes
//    - Fazer alguma validação que tenha If e elseif
//    - percorrer a lista de classes e imprimir elas.
//    - Fazer alguma validação que tenha switch
//    - Criar um arraylist com alguma classe e usar add/remove/cotains

public class Main {
    public static void main(String[] args) {
        //array de carros
        Carro[] carros = new Carro[3];
        carros[0] = new Carro("Fiat", "Uno",1980 ,"vinho","gasolina","manual","262672",60000);
        carros[1] = new Carro("Toyota", "SW4 Diamond",2025 ,"preto","disel","automatico","299893",0);
        carros[2] = new Carro("Hyundai", "Civic",2020 ,"preto","gasolina","automatico","1109083",20000);

        //validação if e else e imprimindo carros
        for (Carro carro : carros) {
            if (carro.getKm() > 0) {
                System.out.println("O(a) " + carro.getModelo() + " é usado(a).");
            }
            else if (carro.getKm() == 0) {
                System.out.println("O(a) " + carro.getModelo() + " é novo(a).");
            }
        }

        //Arraylist de alunos
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Pedro", "Freitas", "11122233366", "pedro@gmail.com", "2024000000", "ADS","Noturno"));
        alunos.add(new Aluno("João Vitor", "Farias", "22233344455", "joao@gmail.com", "2024111111", "Farmacia", "Noturno"));
        alunos.add(new Aluno("Afonso", "Francisco", "33344455566", "afonso@gmail.com", "2022333333", "Medicina", "Noturno"));

        //Imprimindo alunos
        System.out.println("\nLista de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " " + aluno.getSobrenome());
        }

        //arraylist de funcionarios
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Pedro", "Freitas", "11122233344", "Vendedor", 2000, "Vendas"));
        funcionarios.add(new Funcionario("João", "Farias", "55566677788", "Gerente", 10500, "Gerencia"));
        funcionarios.add(new Funcionario("Afonso", "Francisco", "22233344455", "Contador", 4000, "Finanças"));

        //Validação com switch para funcionarios e imprimindo
        System.out.println("\nLista de Funcionarios:");
        for (Funcionario funcionario : funcionarios) {
            switch (funcionario.getCargo()) {
                case "Vendedor":
                    System.out.println(funcionario.getNome() + " " + funcionario.getSobrenome() + " trabalha 6 dias da semana.");
                    break;
                case "Faxineiro":
                    System.out.println(funcionario.getNome() + " " + funcionario.getSobrenome() + " trabalha 6 dias da semana.");
                    break;
                case "Contador":
                    System.out.println(funcionario.getNome() + " " + funcionario.getSobrenome() + " trabalha 4 dias da semana.");
                    break;
                default:
                    System.out.println(funcionario.getNome() + " " + funcionario.getSobrenome() + " é o gerente.");
                    break;
            }
        }
        //ArrayList de Clientes
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente cliente1 = new Cliente("Pedro", "Freitas", "11122233344", "Rua Arcoverde, 29,Centro", "88999999999");
        Cliente cliente2 = new Cliente("Joao", "Farias", "33344445566", "Rua Recife, 44, Xucurus", "81990000000");
        Cliente cliente3 = new Cliente("Afonso", "Francisco", "88988877766", "Rua da Pedra", "898989898998");
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        //Verificando se o cliente ja existe
        if (clientes.contains(cliente3)) {
            System.out.println("\nO cliente 'Afonso' existe");
        } else {
            System.out.println("\nO cliente 'Afonso' nãs existe");
        }

        //Removendo o cliente
        clientes.remove(cliente2);
        System.out.println("\nO cliente 'João' foi removido por inatividade.");

        //Adicionando um novo cliente
        Cliente cliente4 = new Cliente("Talles", "Pacheco", "55566677788", "Rua Arcoverde, 89,Prado", "81223344556");
        clientes.add(cliente4);
        System.out.println("'Talles' é o novo cliente.");

        //Imprimindo lista final de clientes
        System.out.println("\nLista de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome() + " " + cliente.getSobrenome());
        }

    }

}