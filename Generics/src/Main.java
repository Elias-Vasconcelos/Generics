import Carros.Carro;
import Carros.Chevrolet;
import Carros.Nissan;
import DAO.CarroDAO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Chevrolet onix = new Chevrolet("onix", "branco", 100);
        Chevrolet tracker = new Chevrolet("tracker", "preto", 150);
        Chevrolet camaro = new Chevrolet("camaro", "amarelo", 200);

        Nissan kicks = new Nissan("kicks","branco", 120);
        Nissan sentra = new Nissan("sentra","cinza", 150);
        Nissan frontier = new Nissan("frontier","preto", 300);


        CarroDAO<Carro> bancoDados = new CarroDAO<Carro>();

        bancoDados.adicionar(onix);
        bancoDados.adicionar(tracker);
        bancoDados.adicionar(camaro);

        bancoDados.adicionar(kicks);
        bancoDados.adicionar(sentra);
        bancoDados.adicionar(frontier);


        System.out.println(bancoDados.map.size());
        System.out.println(bancoDados.map.get(onix.getClass()));
        System.out.println(bancoDados.map.get(kicks.getClass()));
    }
}