package DAO;

import Carros.Carro;

import java.util.HashMap;
import java.util.Map;

public class CarroDAO<T extends Carro> implements ICarroDAO<T> {

     public Map<Class, Map<String, T >> map  ;

    public CarroDAO() {
        this.map = new HashMap<>();
    }


    @Override
    public boolean adicionar(T dado) {

        Map<String, T> mapaInterno = this.map.get(dado.getClass());

        if(mapaInterno == null ){
            mapaInterno = new HashMap<>();
            this.map.put(dado.getClass(), mapaInterno );
            mapaInterno.put(dado.getNome(), dado);
            return true;

        } else mapaInterno.put(dado.getNome(), dado);
        return true;
    }

}
