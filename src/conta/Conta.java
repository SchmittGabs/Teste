package conta;

/**
 * @author aluno
 */
public class Conta {

    int numero;
    double saldo;
    int agencia;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void MostraSaldo() {
        System.out.println("Saldo disponível: " + saldo);
    }

    public void Sacar(double v) {
        saldo = saldo - v;
        System.out.println("Sacado: "+saldo);
    }
}
