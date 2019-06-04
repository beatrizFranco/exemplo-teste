
package beatrizrocha_aula5;

import javax.swing.JOptionPane;

public class Suco extends Bebida {
    
    private String sabor;
    
    public Suco(){
        super();
    }
    
     public Suco(String nome, Double preco, String pSabor){
        super(nome,preco);
        this.setSabor(pSabor);
     }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }        
    
     public String mostrarBebida(){
        String vinho = this.getNome() + " "+ sabor;
        return vinho;        
    }         
   
    public boolean verificarPreco(Double preco){        
        if (preco < 2.5){
            return true;
        } else{
            return false;
        }            
        
    }
    
     public Suco cadastrarSuco(){
        Suco s = new Suco();
        s.setNome(JOptionPane.showInputDialog("Digite o nome do suco: "));
        s.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do suco: ")));
        s.setSabor(JOptionPane.showInputDialog("Digite o sabor do suco: "));
        return s;
    }  
}
