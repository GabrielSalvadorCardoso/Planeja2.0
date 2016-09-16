package classes;
public class Conta {
    private final float JUROS = 0.5f; 
    private int cod=1;
    private String banco;
    private String dono;
    private float valor;
    private String data;
    private int anos;
    private float estimativa; //(valor * JUROS) * anos = estimativa

    Conta(int code, String bank, String owner, float value, String date){
        setCod(code);
        setBanco(bank);
        setDono(owner);
        setValor(value);
        setData(date);
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public float getEstimativa() {
        return estimativa;
    }

    public void setEstimativa(float estimativa) {
        this.estimativa = estimativa;
    }
    
    void estado(){
        System.out.println("Dados da conta");
        System.out.println("Código da conta: "+this.getCod());
        System.out.println("Banco: "+this.getBanco());
        System.out.println("Propietario: "+this.getDono());
        System.out.println("Valor atual: "+this.getValor()+" ("+this.getData()+")");
        System.out.println("Estimativa: "+this.getEstimativa()+" (em "+this.getAnos()+"ano(s)");
    }
}
