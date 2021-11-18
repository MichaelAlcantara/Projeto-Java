
package projetoestoque;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Venda extends Produto{
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date x1 = new Date();
    private double valorVenda;
    private int itens;
    Scanner sc = new Scanner(System.in);

    public Venda(int ProdutoId, String Nome, int Quantidade,double valorVenda, int itens) {
        super(ProdutoId, Nome, Quantidade);
        this.valorVenda = valorVenda;
        this.itens = itens;
    }

    public Venda() {
    }
    
    

    public double getValorVenda() { return valorVenda; }
    public void setValorVenda(double valorVenda) { this.valorVenda = valorVenda; }

    public int getItens() { return itens; }
    public void setItens(int itens) { this.itens = itens; }
    
    
    public ArrayList<Produto> VenderProduto(Venda v){
        
        ArrayList<Produto> array = new ArrayList<>();
        try {
            System.out.println("Digite id: ");
            setProdutoId(sc.nextInt());

            System.out.println("Digite nome: ");
            setNome(sc.next());

            System.out.println("Digite a quantidade: ");
            setQuantidade(sc.nextInt());

            System.out.println("Digite valor compra: ");
            setValorVenda(sc.nextDouble());
            
            if(this.getItens() > this.getQuantidade()){
                System.out.println("Quantidade de itens maior que a do estoque.");
            }
            else {
                int qtd = v.getQuantidade() - v.getItens();
                v.setQuantidade(qtd);
                
            prod.remove(new Venda(getProdutoId(),getNome(),getQuantidade(),getValorVenda(),getItens()));
               
            }
        
        } catch (Exception e) {
        }
        return array;
    }
    
    public void ImprimirVenda(){
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("IMPRIMIR VENDA");
        System.out.println("ID: " + getProdutoId());
        System.out.println("Nome: " + getNome());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Valor compra: " + getValorVenda());
        System.out.println("Processo realizado as "+ sdf2.format(x1));
        System.out.println("-------------------------------------------------------------------------");
    
    }
}
