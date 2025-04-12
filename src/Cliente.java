public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String data_nascimento;
    private String email;
    private String endereco;
    private String telefone;

    //construtor
    public Cliente(String nome,String sobrenome, String cpf,String endereco,String telefone){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.cpf = cpf;
        this.endereco=endereco;
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
    public String getData_nascimento() {
        return data_nascimento;
    }
    public String getEmail() {
        return email;
    }
    public String getEndereco() {
        return endereco;
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
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
