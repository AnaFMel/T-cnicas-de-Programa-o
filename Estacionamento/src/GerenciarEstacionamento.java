
public class GerenciarEstacionamento {

    //método main, que serve para inicializar o programa
    public static void main(String[] args) {

        //Cadastrar o carro do Maromo
        Carro carro = new Carro();
        carro.placa = "FFF-000";
        carro.modelo = "C3";
        carro.marca = "Citroen";
        carro.valor = 30000.00;
        carro.cor = "Branca";

        carro.mostrarDados();

    }
}
