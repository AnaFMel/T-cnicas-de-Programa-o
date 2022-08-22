public class Carro {

    //Atributos:
     String placa;
     String marca;
     String modelo;
     String cor;
     double valor;

    //métodos:
    void acelerar(){
        //aqui fica a lógica para acelerar
    }

    void estacionar(){

    }

    void mostrarDados(){
        System.out.println("Dados do carro:");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Valor:  R$" + valor);
        System.out.println("-----------------");
    }
}
