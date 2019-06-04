
package beatrizrocha_aula5;

import javax.swing.JOptionPane;


public class Vinho extends Bebida{
 
    private int safra;
    private String tipo;

    
    public Vinho(){
        super();
    }
    
    public Vinho(String nome, Double preco, String pTipo, int pSafra){
        super(nome,preco);
        this.setSafra(pSafra);
        this.setTipo(pTipo);
    }

    public int getSafra() {
        return safra;
    }

    public void setSafra(int safra) {
        this.safra = safra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     
    
    
      public String mostrarBebida(){
        String vinho = this.getNome() + " "+ safra;
        return vinho;        
    }         
   
    public boolean verificarPreco(Double preco){        
        if (preco < 25){
            return true;
        } else{
            return false;
        }                  
    }
    
      public Vinho cadastrarVinho(){
        Vinho v = new Vinho();
        v.setNome(JOptionPane.showInputDialog("Digite o nome do vinho: "));
        v.setTipo(JOptionPane.showInputDialog("Digite o tipo do vinho: "));
        v.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do vinho: ")));
        v.setSafra(Integer.parseInt(JOptionPane.showInputDialog("Digite a safra do vinho: ")));
        return v;
    }  
    
}
