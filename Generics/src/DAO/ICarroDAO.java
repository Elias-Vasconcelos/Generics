package DAO;

import Carros.Carro;

import java.util.HashMap;
import java.util.Map;

public interface ICarroDAO<T extends Carro> {

    boolean adicionar(T dado);

}
