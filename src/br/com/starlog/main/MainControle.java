package br.com.starlog.main;
import br.com.starlog.model.Carga;
import br.com.starlog.model.ModuloCarga;
import br.com.starlog.model.BaseLancamento;

import java.util.HashSet;

import br.com.starlog.exception.CapacidadeExcedidaException;

public class MainControle {
    public static void main(String[] args) {

    Carga c1 = new Carga("ORB-101-SP","CRIOGENICA",2.5,450.00);
    Carga c2 = new Carga("ORB-102-RJ","PADRAO",8.0,120.00);
    Carga c3 = new Carga("ORB-101-MG","CRIOGENICA",12.0,450.00);
    Carga c4 = new Carga("ORB-101-PR","BIOLOGICA",15.0,300.00);

    System.out.println(c1);
    System.out.println(c4);

    ModuloCarga modulo = new ModuloCarga("MOD-ALFA-01",3);
    BaseLancamento base = new BaseLancamento(carregarCarga(c1,c2,c3));
    
    try{
        modulo.add.Carga(c4);
    } catch (CapacidadeExcedidaException e){
        System.out.println("excecao" + limiteCargas);
        }
    }

    modulo.contarCargasPorCategoria("CRIOGENICA",5.0);
     System.out.println(c3);

    HashSet<Carga> manifesto = new HashSet<>(); 
    manifesto = new Carga ("ORB-101-SP","CRIOGENICA",9.0,990.00);
    manifesto.size(c2);

    try{
        new Carga ("","PADRAO",1.0,50.00);
    } catch (IllegalArgumentException e){
        System.out.println();
        }
    }
}
