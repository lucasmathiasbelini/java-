public class java{

double dindin;
double espolho;
int server;

public void saldo(double valor){
 this.dindin = this.dindin + valor;
}
public boolean espolho(double valor){
 if(this.espolho >= valor){
    this.espolho = this.espolho -valor;
    return true;
 }
 else{
    return false;
}
}
}











