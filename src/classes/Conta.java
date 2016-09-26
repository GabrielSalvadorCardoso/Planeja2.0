package classes;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conta {
    private final float JUROS = 0.5f; 
    private int cod=1;
    private String banco;
    private String dono;
    private float valor;
    private String data;
    private int anos;
    private float estimativa; //(valor * JUROS) * anos = estimativa
    //Implementação de arquivos
    private File dir;
    private Formatter arquivo;
    //variaveis de leitura
    private Scanner ler;
    private String texto[] = {"","","","",""};
    //conexões de consulta
    private Connection con_consulta = null;
    private PreparedStatement stm_consulta = null;
    private ResultSet res = null;

    Conta(int code, String bank, String owner, float value, String date){
        setCod(code);
        setBanco(bank);
        setDono(owner);
        setValor(value);
        setData(date);
    }

    //setters e getters
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
    //metodos de comportaento
    void estado(){
        System.out.println("Dados da conta");
        System.out.println("Código da conta: "+this.getCod());
        System.out.println("Banco: "+this.getBanco());
        System.out.println("Propietario: "+this.getDono());
        System.out.println("Valor atual: "+this.getValor()+" ("+this.getData()+")");
        System.out.println("Estimativa: "+this.getEstimativa()+" (em "+this.getAnos()+"ano(s)");
    }
    //criação e escrita do arquivo
    /*void record(){
        dir = new File("C://Planeja//Contas");
        dir.mkdirs();
        
        try{
            arquivo = new Formatter("C://Planeja//Contas//"+this.getCod()+".txt");
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Diretório inacessivel");
        }
        
        try{
            arquivo.format(this.getCod()+"\r\n"+
                    this.getBanco()+"\r\n"+
                    this.getDono()+"\r\n"+
                    this.getValor()+"\r\n"+
                    this.getData());
        }catch(FormatterClosedException ex){
            JOptionPane.showMessageDialog(null, "Arquivo não acessivel");
        }
        
        arquivo.close();
    }
    //leitura do conteudo do arquivo
    void search(int num){
        try {
            ler = new Scanner(new File("C://Planeja//Contas//"+num+".txt"));
            //System.out.println("ESTAGIO 1");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado");
            System.exit(1);
        }
        
        try{
            //System.out.println("ESTAGIO 2");
            for(int cont=0; ler.hasNext(); cont++){
                texto[cont] = ler.nextLine();
            }
        }catch(NoSuchElementException s){
                JOptionPane.showMessageDialog(null, "Tipo de entrada diferente da esperada");
                System.exit(1);
        }
        //System.out.println(texto[0]+texto[1]+texto[2]+texto[3]+texto[4]);
        //System.out.println("ESTAGIO 3");
        ler.close();
    }    
    String retornarValor(int cont){
        return texto[cont];
    }*/
    
    
    
    
    //////////////////////////////////////////BANCO DE DADOS////////////////////
    //GRAVAÇÃO
    public void record(){
        Connection conexao = new ConnectionFactory().getConnection("planeja","root","");
        //System.out.println(conexao);
        String sql = "insert into conta(numero,banco,proprietario,valor,data)values(?,?,?,?,?)";
        PreparedStatement stm = new PreparaDeclaracao().statement(conexao,sql);
        //int code, String bank, String owner, float value, String date
        try{
            stm.setString(1, Integer.toString(this.getCod()));
            stm.setString(2, this.getBanco());
            stm.setString(3, this.getDono());
            stm.setString(4, Float.toString(this.getValor()));
            stm.setString(5, this.getData());
        }catch(SQLException ex){
            System.out.println("Não foi possivel especificar SQL");
        }
        
        try{
            stm.execute();
        }catch(SQLException ex){
            System.out.println("Não foi possivel executar commit");
        }
        
        try{
            stm.close();
            conexao.close();
        }catch(SQLException ex){
            System.out.println("Não foi possivel fechar conexão ...forçando fechamento");
        }
    }
    //CONSULTA
    public ResultSet search(int numero){
        con_consulta = new ConnectionFactory().getConnection("planeja","root","");
        String sql = "select * from conta where numero="+numero;
        stm_consulta = new PreparaDeclaracao().statement(con_consulta, sql);       
        
        try {
            res = stm_consulta.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Não foi possivel executar Query");
        }
        
        return res;
    }
    
    public void closeConnections(){
        try{
           this.con_consulta.close();
           this.stm_consulta.close();
           this.res.close(); 
        }catch(SQLException ex){
            System.out.println("Não foi possivel fechar connexões de consulta");
        }        
    }
}
