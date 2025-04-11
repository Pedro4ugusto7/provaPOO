public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String tipo_combustivel;
    private String cambio;
    private String chassi;
    private double km;

    //construtor
    public Carro(String marca,String modelo,int ano,String cor,String tipo_combustivel,String cambio,String chasi,int km){
        this.marca = marca;
        this.modelo=modelo;
        this.ano=ano;
        this.cor=cor;
        this.tipo_combustivel=tipo_combustivel;
        this.cambio=cambio;
        this.km=km;
    }
    //gets
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    public String getTipo_combustivel() {
        return tipo_combustivel;
    }
    public String getCambio() {
        return cambio;
    }
    public String getChassi() {
        return chassi;
    }
    public double getKm() {
        return km;
    }

    //sets
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setTipo_combustivel(String tipo_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
    }
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public void setKm(double km) {
        this.km = km;
    }

    public double Kms(double km){
        return km;
    }

    public void kms(double km){
        System.out.println(km);
    }


}
