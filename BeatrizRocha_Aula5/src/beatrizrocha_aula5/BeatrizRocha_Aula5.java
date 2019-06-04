
package beatrizrocha_aula5;

import javax.swing.JOptionPane;


public class BeatrizRocha_Aula5 {

    public static void main(String[] args) {
        Bebida b = null;
        
        int opcMenu1 = 0;   
        String opcMenu2 = " ";
                            
        do {
                    
              opcMenu1 = Integer.parseInt(JOptionPane.showInputDialog(null, "M E N U\n"
                + "Digite a opção desejada:\n"
                + "\n1 - Cadastrar"
                + "\n2 - Verificar Preço"
                + "\n0 - Sair"));
            
        switch (opcMenu1){
            case 1:
                opcMenu2 = JOptionPane.showInputDialog(null, "Cadastrar:\n"
                        + "\nA - Vinho"
                        + "\nB - Suco"
                        + "\nC - Refrigerante");
                
                switch (opcMenu2){
                case "A":  
                    
                    Vinho v = new Vinho();
                    v.cadastrarVinho();
                 
                break;
                case "B":
                    
                    Suco s = new Suco();
                    s.cadastrarSuco();                         
                                
                break;
                case "C":
                    
                    Refrigerante r = new Refrigerante();
                    r.cadastrarRefrigerante();
                    
                break; 
                default: JOptionPane.showMessageDialog(null, "Opção invalida!");  
                    break;
                }              
              break;
            case 2:
                opcMenu2 = JOptionPane.showInputDialog(null, "Verificar Preço:\n"
                        + "\nA - Vinho"
                        + "\nB - Suco"
                        + "\nC - Refrigerante");
                
                switch (opcMenu2){
                case "A":
                 
                Vinho v = new Vinho();    
                v.verificarPreco(v.getPreco());
                if (v.verificarPreco(v.getPreco()) == true){
                    JOptionPane.showMessageDialog(null, "Produto em oferta!");
                }else{
                    JOptionPane.showMessageDialog(null, "Produto com o preço normal!");
                }
                                   
                break;
                case "B":
                    
                Suco s = new Suco();    
                s.verificarPreco(s.getPreco());
                if (s.verificarPreco(s.getPreco()) == true){
                    JOptionPane.showMessageDialog(null, "Produto em oferta!");
                }else{
                    JOptionPane.showMessageDialog(null, "Produto com o preço normal!");
                }
                
                break;
                case "C":
                    
                Refrigerante r = new Refrigerante();    
                r.verificarPreco(r.getPreco());
                if (r.verificarPreco(r.getPreco()) == true){
                    JOptionPane.showMessageDialog(null, "Produto em oferta!");
                }else{
                    JOptionPane.showMessageDialog(null, "Produto com o preço normal!");
                }
                
                break; 
                default: JOptionPane.showMessageDialog(null, "Opção invalida!"); 
                    break;
                }
                 break;              
            case 0:
                JOptionPane.showMessageDialog(null, "Finalizando a execução...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida!");       
                break;
        }        
    }while (opcMenu1 != 0);
    
}
    
 
}
