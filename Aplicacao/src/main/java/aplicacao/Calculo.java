package aplicacao;

public class Calculo {
    private int valorDesconto;
    private int valorTotal;
    
    public int calcularDesconto (int valor, int idade) {
        if (idade > 65){
            valorDesconto = valor*10/100;
        }
            else{
            valorDesconto = valor*1/100;
        }
        return valorDesconto;
    }
    
    public int calculartotal (int valor, int desconto){
        valorTotal = valor-desconto;
        return valorTotal;
    }
    
}
