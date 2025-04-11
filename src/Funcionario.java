import javax.xml.parsers.SAXParser;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String cargo;
    private double salario;
    private String departamento;
    private String telefone;

    //construtor
    public Funcionario(String nome,String sobrenome,String cpf,String cargo,double salario,String departamento){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.cpf=cpf;
        this.cargo = cargo;
        this.salario=salario;
        this.departamento=departamento;
        this.telefone=telefone;
    }
    //gets
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getTelefone() {
        return telefone;
    }

    //sets
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setIdade(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
