/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author aluno
 */
public class Heranca {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente ();
        corrente.setSaldo(4000);
        corrente.MostraSaldo();
        corrente.Sacar(450);
        corrente.MostraSaldo();
        
        
        ContaPoupança pou = new ContaPoupança ();
        pou.setSaldo(5000);
        pou.MostraSaldo();
        pou.Sacar(2500);
        pou.MostraSaldo();
    }
}
