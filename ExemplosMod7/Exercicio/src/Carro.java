public class Carro {

    private int codigo;

    private String marca;

    private String rodas;

    public String getMarca1() {
        return marca;
    }

    public String getRodas1() {
        return rodas;
    }

    public void setMarca1(String marca) {
        this.marca = marca;
    }

    public void cadastrarMarca1(String marca){
        setMarca1(marca);
    }

    public void imprimirMarca1(){
        System.out.println(this.marca);
    }


    public void setRodas1(String rodas) {
        this.rodas = rodas;
    }

    public void cadastrarRodas1(String rodas){
        setRodas1(rodas);
    }

    public void imprimirRodas1(){
        System.out.println(this.rodas);
    }
}

