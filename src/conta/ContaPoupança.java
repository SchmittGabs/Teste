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
public class ContaPoupança extends Conta {
    String data;
    
    @Override
     public void Sacar(double v) {
        saldo = saldo - v*0.5;
        System.out.println("Sacado: "+saldo);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
