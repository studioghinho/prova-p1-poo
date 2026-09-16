package br.com.starlog.model;
import br.com.starlog.model.Carga;
import java.util.ArrayList;
import java.util.List;

public class ModuloCarga {
    private String codigoModulo;
    private int capacidadeMaxima;
    private List<Carga> cargas = new ArrayList<>();

    public ModuloCarga(String codigoModulo, int capacidadeMaxima, List<Carga> cargas) {
        this.codigoModulo = codigoModulo;
        this.capacidadeMaxima = capacidadeMaxima;
        this.cargas = cargas;
    }

    public void carregarCarga(String codigoModulo, int capacidadeMaxima, List cargas){
       super ("Carga " + codigoModulo + "carregada no modulo com sucesso"); 
    }

    public double calcularSeguroTotal(){
        return cargas.stream()
        .mapToDouble(cargas:: get.valorSeguro)
        .sum();
    }

    public long contarCargasPorCategoria(String categoria){
        return cargas.stream()
        .filter(cargas -> cargas.getCategoria() .equalsIgnoreCase(categoria))
        .count();
    }

    public double calcularSeguroCargasPesadas(String categoria, double pesoMinimo){
        return pesoMinimo.stream()
        .mapToDouble(pesoMinimo:: getPesoKg)
        .sum();
    }

    public String getCodigoModulo() {
        return codigoModulo;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public List<Carga> getCargas() {
        return cargas;
    }
}
