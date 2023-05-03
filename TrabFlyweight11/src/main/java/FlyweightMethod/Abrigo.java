package FlyweightMethod;

import java.util.ArrayList;
import java.util.List;

public class Abrigo {

    private List<Animal> animais = new ArrayList<>();

    public void cadastrar(String nomeAnimal, String nomeCidade, String uf) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Animal animal = new Animal(nomeAnimal, cidade);
        animais.add(animal);
    }

    public List<String> obterAnimal() {
        List<String> saida = new ArrayList<String>();
        for (Animal animal : this.animais) {
            saida.add(animal.obterAnimal());
        }
        return saida;
    }


}