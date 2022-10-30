
package com.portafolio.Simba.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreExp;
    @NotBlank
    private String descripcionExp;
    @NotBlank
    private String lugarExp;
    @NotBlank
    private String inicio;
    @NotBlank
    private String fin;
    private String pagina;
    private String titulo;
    
    
    //Constructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreExp, String descripcionExp, String lugarExp, String inicio, String fin,String pagina, String titulo) {
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
        this.lugarExp = lugarExp;
        this.inicio = inicio;
        this.fin = fin;
        this.pagina = pagina;
        this.titulo = titulo;
    }
    
    //Getter y Setter

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
