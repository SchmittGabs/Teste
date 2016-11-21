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
public class ContaCorrente extends Conta{
    double limite;
    @Override
     public void Sacar(double v) {
        saldo = saldo - v*1.2;
        System.out.println("Sacado: "+saldo);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
}
