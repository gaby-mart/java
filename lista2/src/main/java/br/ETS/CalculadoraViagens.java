package br.ETS;

public class CalculadoraViagens {

    public static double CalcularTaxaAlimentacao(int destino, int servico, double valorInicial){
        if (destino == 1) { // Maceió
            if (servico == 2) {
                return valorInicial * 0.85;
            } else if (servico == 1) {
                return valorInicial;
            }
        } else if (destino == 2) { // Porto de Galinhas
            if (servico == 1) {
                return valorInicial * 0.60;
            } else if (servico == 2) {
                return valorInicial * 0.85;
            }
        }
        return 0.00;
    }
}
