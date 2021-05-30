/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nope;

/**
 *
 * @author eduar
 */
public class Email {

    public void EnviarEmail(Cliente cliente, String assunto, String mensagem) {
        System.out.println("Email enviado para " + cliente.email + ". Assunto: " + assunto + ". Mensagem: " + mensagem + "");
    }
}
