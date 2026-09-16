package br.com.starlog.model;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import br.com.starlog.model.ModuloCarga;
import br.com.starlog.model.Carga;

public class BaseLancamento {
    private Map<String, ModuloCarga> modulos = new HashMap<>(); 
    
    public BaseLancamento(Map<String, ModuloCarga> modulos) {
        this.modulos = modulos;
    }

    public void cadastrarModulo(){
       modulos.put(modulos.getcodigoModulo(), modulos);
    }

    public Optional<ModuloCarga> buscarModulo(){
        return Optional.ofNullable(modulos.get(codigoModulo));
    }

    public Map<String, ModuloCarga> getModulos() {
        return modulos;
    }
}
