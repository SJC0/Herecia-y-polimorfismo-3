
package mainbanco;


abstract class Cuenta {
    
    protected float saldo, cantretiro, cantconsig;
    protected int nconsig;
    protected int nretiro;
    protected String tipocuenta, tipotrans;

    public Cuenta(float saldo, int nconsig, int nretiro, String tipocuenta, String tipotrans,float cantretiro, float cantconsig) {
        this.saldo = saldo;
        this.nconsig = nconsig;
        this.nretiro = nretiro;
        this.tipocuenta = tipocuenta;
        this.tipotrans = tipotrans;
        this.cantretiro = cantretiro;
        this.cantconsig = cantconsig;
        
    }


    public float getSaldo() {
        return saldo;
    }

    public int getNconsig() {
        return nconsig;
    }

    public int getNretiro() {
        return nretiro;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public String getTipotrans() {
        return tipotrans;
    }
    public float getCantretiro(){
        return cantretiro;
    }
    public float getCantconsig(){
        return cantconsig;
    }
    
    
    abstract void calcularSaldo();
    
    public float obtSaldo(){
        return saldo;
    }
    public int obtNconsig (){
        return nconsig;
    }
    public int obtNretiro(){
        return nretiro;
    }
    public String obtTipocuenta(){
        return tipocuenta;
    }
    public String obtTipotrans(){
        return tipotrans;
    }
    public float obtCantretiro(){
        return cantretiro;
    }
    public float obtCantconsig(){
        return cantconsig;
    }
    
    
    
    
}
