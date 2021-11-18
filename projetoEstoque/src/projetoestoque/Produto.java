
package projetoestoque;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date x1 = new Date();
   public ArrayList<Produto> prod = new ArrayList<>();
   private int ProdutoId;
   private String Nome;
   private int Quantidade;

    public Produto(int ProdutoId, String Nome, int Quantidade) {
        this.ProdutoId = ProdutoId;
        this.Nome = Nome;
        this.Quantidade = Quantidade;
        
    }
    public Produto(){
    
    }
    

    public void setProdutoId(int ProdutoId) { this.ProdutoId = ProdutoId; }
    public int getProdutoId() { return this.ProdutoId; }
    
    
    public void setNome(String Nome) { this.Nome = Nome; }
    public String getNome() { return this.Nome; }
    
    
    public void setQuantidade(int Quantidade) { this.Quantidade = Quantidade; }
    public int getQuantidade() { return this.Quantidade; }
    
      
    public void ImprimirProduto(){
   
        //produto.stream().forEach(System.out::print);
        
            //System.out.println("***************************************");
            System.out.println("IMPRIMIR PRODUTO");
            System.out.println("ID: " + getProdutoId());
            System.out.println("Nome: " + getNome());
            System.out.println("Quantidade: " + getQuantidade());
            System.out.println("Processo realizado as "+ sdf2.format(x1));
            System.out.println("-------------------------------------------------------------------------");
        
    }    
    public void PesquisaProdtuo(){
        int id;
        System.out.println("Digite o ID do produto para procura ele: ");
        id = sc.nextInt();
        System.out.println("Ele está na posição: "+ prod.indexOf(getProdutoId() == id));

    }
    
}
