package projetoMarmita.com.br.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name =( "produto"))
public class Marmita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo")
    private Integer Codigo;
    
    @Column(name= "Nome")
    private String Nome;   
   
    @Column(name= "Preco")
    private Double Preco;
    
    @Column(name= "Observacao")
    private String Observacao;
    
    @Column(name= "Tipo")
    private String Tipo;   
    
   @Column(name= "quantidadeemestoque")
    private Integer QuantidadeEmEstoque;
    
    @Column(name= "precocusto")
    private Double PrecoCusto;   

}
