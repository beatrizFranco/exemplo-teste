
package beatrizrocha_aula5;

public abstract class Bebida {
    
    private String nome;
    private Double preco;

   public Bebida(){
        this(" ", 0.0 );
    }
       
    public Bebida(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public abstract String mostrarBebida();
            
    public abstract boolean verificarPreco(Double preco);   
    
}
