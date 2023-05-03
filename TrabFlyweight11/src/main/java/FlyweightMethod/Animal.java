package FlyweightMethod;
public class Animal {

    private String nome;
    private Cidade cidadeAtual;

    public Animal(String nome, Cidade cidadeAtual) {
        this.nome = nome;
        this.cidadeAtual = cidadeAtual;
    }

    public String obterAnimal() {
        return "Animal{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + cidadeAtual.getNome() + '\'' +
                ", uf='" + cidadeAtual.getUf() + '\'' +
                '}';
    }
}