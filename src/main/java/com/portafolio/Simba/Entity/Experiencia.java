
package com.portafolio.Simba.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreExp; //titulo
    private String descripcionExp;//puesto
    private String lugarExp;//lugar/empresa
    private String inicio;//año de comiezo
    private String fin;//año de finalizacion
    private String pagina;//pagina del trabajo
    private String titulo;//titulo de la pagina
    
    
    //Constructor

    public Experiencia() {
    }

    public Experiencia(String nombreExp, String descripcionExp, String lugarExp,String inicio, String fin, String pagina, String titulo ) {
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
        this.lugarExp = lugarExp;
        this.inicio = inicio;
        this.fin = fin;
        this.pagina = pagina;
        this.titulo = titulo;
    }
    
    //Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }

    public String getLugarExp() {
        return lugarExp;
    }

    public void setLugarExp(String lugarExp) {
        this.lugarExp = lugarExp;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
        
}
