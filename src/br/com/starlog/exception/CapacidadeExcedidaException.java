package br.com.starlog.exception;
import br.com.starlog.model.Carga;
import br.com.starlog.model.ModuloCarga;
import br.com.starlog.model.BaseLancamento;

import java.util.ArrayList;
import java.util.List;

public class CapacidadeExcedidaException extends Exception{
    private List<Carga> capacidade = new ArrayList<>();

    public void limiteCargas(){
        return ("Modulo: " + codigoModulo + "atingiu a capacidade maxima de" + capacidade + "cargas.");
    }    
}
