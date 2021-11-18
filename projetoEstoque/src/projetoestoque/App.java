/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoestoque;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author joaos
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date x1 = new Date();
        Produto produto = new Produto();
        Compra compra = new Compra();
        Venda venda = new Venda();
        ArrayList<Produto> prod = new ArrayList<>();
        int resp;
        String CNPJ;
        String nome;
        String endereco;
        double telefone;
        
        System.out.println("Olá, seja bem-vindo(a).");
        System.out.println("Para começamos você precisara informa alguns dados.");
        System.out.println("Digite o nome da sua empresa: ");
        nome = sc.next();
        System.out.println("Digite seu CNPJ: ");
        CNPJ = sc.next();
        System.out.println("Digite seu endereço: ");
        endereco = sc.next();
        System.out.println("Digite seu telefone de contato: ");
        telefone = sc.nextDouble();
        System.out.println();
        System.out.println("Podemos inica o Programa?. \n(S-Sim ou N-Não)");
        char response = sc.next().charAt(0);
        System.out.println("Olá, "+nome+" aqui você pode adiciona, remove e pesquisa o seu estoque.");
        System.out.println("Sinta-se à vontade, pois esse é seu lugar de trabalho.");
        System.out.println();
        System.out.println("Você está iniciando este Programa extamente ás: "+  sdf2.format(x1));
        while(response != 'N'){

            
            System.out.println("Menu de oções: \n"
                    + "\n1-Ver estoque;"
                    + "\n2-Adicionar produto;"
                    + "\n3-Vender produto;"
                    + "\n4-Localizar produto;"
                    + "\n0-Encerrar Programa.");
            resp = sc.nextInt();
                if(resp == 1){
                    System.out.println("Produto:");
                    System.out.println("-------------------------------------------------------------------------");
                    for(Produto x : prod){
                        x.ImprimirProduto();
                    }
                    System.out.println("Tamanho da lista: "+ prod.size());
                    
                    
                }
                else if(resp == 2){
                    
                    prod = compra.ComprarProduto();
                    for(Produto x : prod){
                        x.ImprimirProduto();
                    }
                }
                else if(resp == 3){
                    venda.VenderProduto(venda);
                    for(Produto x : prod){
                        x.ImprimirProduto();
                    }
                }
                else if(resp == 4){
                    produto.PesquisaProdtuo();
                }
                else if(resp == 0){
                    System.out.println("Deseja continuar o Programa? \n S(Sim) e N(Não)  ");
                    response = sc.next().charAt(0);
                }else{
                    System.out.println("Opção inválida.");
                }
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Você está encerrando este Programa extamente ás: "+  sdf2.format(x1));
        System.out.println("Agradecemos a você, por te utilizado nosso Programa.\nVolte sempre.");
        
        sc.close();
    }
    
    
}
