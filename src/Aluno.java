public class Aluno {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String matricula;
    private String curso;
    private String turno;

    //construtor
    public Aluno (String nome,String sobrenome,String cpf,String email,String matricula,String curso,String turno){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.cpf=cpf;
        this.email=email;
        this.matricula = matricula;
        this.curso=curso;
        this.turno=turno;
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
    public String getEmail() {
        return email;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }
    public String getTurno() {
        return turno;
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
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

}
