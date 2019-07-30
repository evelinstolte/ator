/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Ator {
    
    private int codigo;
    private String nomeartistico;
    private String nomereal;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeartistico() {
        return nomeartistico;
    }

    public void setNomeartistico(String nomeartistico) {
        this.nomeartistico = nomeartistico;
    }

    public String getNomereal() {
        return nomereal;
    }

    public void setNomereal(String nomereal) {
        this.nomereal = nomereal;
    }

    @Override
    public String toString() {
        return  nomeartistico ;
    }

   
    
  
}
