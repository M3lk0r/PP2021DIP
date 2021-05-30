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
public class SMS extends ISMS {

    @Override
    public void EnviarSMS(IDados cliente, String mensagem) {
        System.out.println("SMS enviada para " + cliente.celular + ": " + cliente.nome + ", " + mensagem + "");
    }
}
