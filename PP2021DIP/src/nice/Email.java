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
public class Email extends IEmail {

    @Override
    public void EnviarEmail(IDados cliente, String assunto, String mensagem) {
        System.out.println("Email enviado para " + cliente.email + ". Assunto: " + assunto + ". Mensagem: " + mensagem + "");
    }
}
