public class Veiculos {
    public static void main(String args[]){
        Carro carro = new Carro();
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao();

        /**
         * Metodo cadastra os veículos
         * guardando a quantidade de rodas
         * e as marcas
         */

        moto.cadastrarMarca("Harley Davidson");
        moto.imprimirMarca();

        moto.cadastrarRodas("2 Rodas");
        moto.imprimirRodas();

        carro.cadastrarMarca1("BMW");
        carro.cadastrarRodas1("4 Rodas");
        carro.imprimirMarca1();
        carro.imprimirRodas1();


    }
}
