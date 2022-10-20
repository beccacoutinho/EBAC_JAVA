public class Moto {
    private int codigo;

    private String marca;

    private String rodas;

    public String getMarca() {
        return marca;
    }

    public String getRodas() {
        return rodas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void cadastrarMarca(String marca){
        setMarca(marca);
    }

    public void imprimirMarca(){
        System.out.println(this.marca);
    }


    public void setRodas(String rodas) {
        this.rodas = rodas;
    }

    public void cadastrarRodas(String rodas){
        setRodas(rodas);
    }

    public void imprimirRodas(){
        System.out.println(this.rodas);
    }
}
