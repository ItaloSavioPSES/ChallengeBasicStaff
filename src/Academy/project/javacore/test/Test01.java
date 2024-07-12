package Academy.project.javacore.test;

import Academy.project.javacore.dominio.inplementosCadastro01;
import Academy.project.javacore.dominio.testCadastro01;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

 /*
 ----- Sistema de cadastro com um pouco de orientação objetos POO.
 ----- Tenho 2 pastas (dominio, test)
 ----- Pasta de dominios ele tem como inplementar classes de cadastro e de itens
        a outra é de registro de dados pessoais EX: telefone nome etc...
 ----- Tem uma documentação na pasta do codigo, falando um pouco sobre as opções
  */
public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        testCadastro01 cadastro = new testCadastro01();
        inplementosCadastro01 inplecadastro = new inplementosCadastro01();
        // Login e senha
        String user = "italo22";
        String pass = "gabi";
        boolean exibir = true;

        LocalDateTime horas = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDateTime = horas.format(formatter);



        System.out.println("Seja bem vindo");
        System.out.println("--------------");

        System.out.println("Digite o user name");
        String username = input.next();
        System.out.println("Digite o password");
        String password = input.next();
        System.out.println("--------------");
        System.out.println(formattedDateTime);
        while (exibir) {
            // no if  vai passar por validação de login
            if (user.equals(username) && pass.equals(password)) {
                System.out.println("Login concluido, seja Bem-Vindo.");
                System.out.println("Aqui fica as opções para você navegar: ");
                StringBuilder ad = new StringBuilder();
                ad.append("Opções Disponiveis: \n");
                ad.append("01 - Cadastrar cliente \n");
                ad.append("02 - Cadastro de Produtos\n");
                ad.append("03 - em produção\n");
                ad.append("04 - em produção");
                System.out.println(ad.toString());

                int opcaoDeSelecao = input.nextInt();
                switch (opcaoDeSelecao) {
                    case 1:
                        System.out.println("--------------");
                        System.out.println("Aba de Cadastro aqui");
                        System.out.println("Preencha todos os dados das caixas de pergunta: ");
                        System.out.println("\n");
                        System.out.println("Digite o primeiro nome");
                        cadastro.firstName = input.next();
                        System.out.println("Digite o segundo nome");
                        cadastro.secondName = input.next();
                        System.out.println("\n");
                        System.out.println("Digite seu CPF ou CNPJ");
                        cadastro.cpf = input.next();
                        System.out.println("Digite sua data de nascimento");
                        cadastro.dateOfBirdy = input.nextInt();
                        System.out.println("digite o endereço");
                        cadastro.endereco = input.next();
                        System.out.print("Olá Sr " + cadastro.firstName + cadastro.secondName + " CPF " + cadastro.cpf);
                        System.out.println("Seu endereço " + cadastro.endereco + "\n" + "Sua data de nascimento " + cadastro.dateOfBirdy);
                        System.out.println("--------------");
                        break;
                    case 2:
                        System.out.println("Cadastre seus itens aqui.");
                        System.out.println("Deseja cadastrar seus itens sim ou não? ");
                        System.out.println("Caso coloque não você vai ser desconcetado. ");
                        String simCadastro = input.next();

                        if (simCadastro.equals("Sim") || simCadastro.equals("s") || simCadastro.equals("SIM")) {
                            System.out.println("Agora podemos seguir, é colcoar seu item e descrição");
                            int maximoItens = 1;
                            String[] recebimentosDeItens = new String[maximoItens];
                            String[] recebimentosDeDescricao = new String[maximoItens];
                            for (int i = 0; i <= maximoItens; i++) {
                                System.out.println("Digite Qual item você quer");
                                recebimentosDeItens[i] = input.next();
                                for (int j = 0; j < maximoItens; j++) {
                                    System.out.println("Digite a descrição do produto: ");
                                    recebimentosDeDescricao[j] = input.next();
                                    for (int k = 0; k < maximoItens; k++) {
                                        System.out.println("Nome do produto: " + recebimentosDeItens[i] + "\n"
                                                + "Descrição do produto: " +recebimentosDeDescricao[j]);
                                        break;
                                    }
                                }
                            }
                        } else {
                            System.out.println("Opção invalido");
                            break;
                        }
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Opção invalida, Sistema vai fechar.");
                        break;
                }
            }else {
                exibir = false;
                break;
            }
        }
    }
}