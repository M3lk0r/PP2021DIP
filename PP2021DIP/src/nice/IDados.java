/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nice;

/**
 *
 * @author eduar
 */
public abstract class IDados {

    public String nome;
    public String email;
    public String celular;

    public IDados(String nome, String email, String celular) {
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    }
}
