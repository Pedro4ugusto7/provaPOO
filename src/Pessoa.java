public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;
    private double altura;
    private String sexo;
    private String rg;

    //construtor
    public Pessoa(String nome,String sobrenome,String cpf, int idade,String sexo){
        this.nome = nome;
        this.sobrenome=sobrenome;
        this.cpf=cpf;
        this.idade=idade;
        this.sexo=sexo;
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
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    public String getSexo() {
        return sexo;
    }
    public String getRg() {
        return rg;
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
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

}
