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
public abstract class IEmail {

    public abstract void EnviarEmail(IDados cliente, String assunto, String mensagem);
}
