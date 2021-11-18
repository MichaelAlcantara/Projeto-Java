
package projetoestoque;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;


public class Compra extends Produto{
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date x1 = new Date();
    private double valorCompra;
    Scanner sc = new Scanner(System.in);
    
    public Compra(int ProdutoId, String Nome, int Quantidade, double valorCompra) {
        super(ProdutoId, Nome, Quantidade);
        this.valorCompra = valorCompra;
    }

    public Compra() {
  
    }

    public double getValorCompra() { return valorCompra; }
    public void setValorCompra(double valorCompra) { this.valorCompra = valorCompra; }
    
    public ArrayList<Produto> ComprarProduto(){
        
        ArrayList<Produto> array = new ArrayList<>();
        int resp;
        System.out.println("Você deseja adiciona quantos produtos?");
        resp = sc.nextInt();
        
        for(int i=0; i<resp;i++){
            try {
                System.out.println("Digite id: ");
                setProdutoId(sc.nextInt());

                System.out.println("Digite nome: ");
                setNome(sc.next());

                System.out.println("Digite quantidade: ");
                setQuantidade(sc.nextInt());

                System.out.println("Digite valor compra: ");
                setValorCompra(sc.nextDouble());

                array.add(new Compra(getProdutoId(),getNome(),getQuantidade(),getValorCompra()));
                
                
            } catch (Exception e) {
        }
        }
        
        return array;
        
    }
    
    public void ImprimirCompra(){
         
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("IMPRIMIR COMPRA");
        System.out.println("ID: " + getProdutoId());
        System.out.println("Nome: " + getNome());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Valor compra: " + getValorCompra());
        System.out.println("Processo realizado as "+ sdf2.format(x1));
        System.out.println("-------------------------------------------------------------------------");
        
    }
    
}
