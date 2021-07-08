package icpi.project.hinarioEletronico.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Hino implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false, length = 16777215)
    private String corpo;

    public Hino() {}

    public Hino(Integer numero, String titulo, String corpo) {
        this.numero = numero;
        this.titulo = titulo;
        this.corpo = corpo;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return this.corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }
    
}
