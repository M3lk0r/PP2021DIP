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
class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Eduardo", "eduardoaugustogomes@gmail.com", "99999-9999");

        Email email = new Email();
        email.EnviarEmail(cliente, "Fatura", "sua fatura ficou no valor de R$ 1.000,00");

        SMS sms = new SMS();
        sms.EnviarSMS(cliente, "Sua fatura está pronta para ser paga.");

        //cliente seria de baixo nível porque não depende de ninguém, diferente das outras que dependem de cliente, então elas são de alto nível
        //sempre que instanciamos um novo objeto (cliente), estamos adicionando uma forte dependência no código, deixando ele altamente acoplado.
    }
}
