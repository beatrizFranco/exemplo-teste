
package beatrizrocha_aula5;

import javax.swing.JOptionPane;


public class Refrigerante extends Bebida{
    
    private boolean retornavel;
    
    public Refrigerante(){
        super();
    }
    
     public Refrigerante(String nome, Double preco, boolean pRetornavel){
        super(nome,preco);
        this.setRetornavel(pRetornavel);
     }

    public boolean isRetornavel() {
        return retornavel;
    }

    public void setRetornavel(boolean retornavel) {
        this.retornavel = retornavel;
    }

     
   public String mostrarBebida(){
        String vinho = this.getNome();
        return vinho;        
    }         
   
    public boolean verificarPreco(Double preco){        
        if (preco < 5){
            return true;
        } else{
            return false;
        }            
        
    }
    
     public Refrigerante cadastrarRefrigerante(){
        Refrigerante r = new Refrigerante();
        r.setNome(JOptionPane.showInputDialog("Digite o nome do Refrigerante: "));
        r.setRetornavel(Boolean.parseBoolean(JOptionPane.showInputDialog("Digite 'true' para retornavel e 'false' para não: ")));
        r.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do refrigerante: ")));
        
        return r;
    }  
    
}
