package FlyweightMethodTest;

import FlyweightMethod.Abrigo;
import FlyweightMethod.CidadeFactory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AbrigoTest {

    @Test
    void deveRetornarAnimais() {
        Abrigo abrigo = new Abrigo();
        abrigo.cadastrar("Tobias", "Tiradentes", "MG");
        abrigo.cadastrar("Ravena", "São José dos Campos", "SP");
        abrigo.cadastrar("Cacau", "Resende", "RJ");
        abrigo.cadastrar("Zeus", "São Lourenço", "MG");

        List<String> saida = Arrays.asList(
                "Animal{nome='Tobias', cidade='Tiradentes', uf='MG'}",
                "Animal{nome='Ravena', cidade='São José dos Campos', uf='SP'}",
                "Animal{nome='Cacau', cidade='Resende', uf='RJ'}",
                "Animal{nome='Zeus', cidade='São Lourenço', uf='MG'}");

        assertEquals(saida,  abrigo.obterAnimal());
    }

    @Test
    void deveRetornarTotalCidades() {
        Abrigo  abrigo = new Abrigo();
        abrigo.cadastrar("Tobias", "Tiradentes", "MG");
        abrigo.cadastrar("Ravena", "São José dos Campos", "SP");
        abrigo.cadastrar("Cacau", "Resende", "RJ");
        abrigo.cadastrar("Zeus", "São Lourenço", "MG");

        assertEquals(4, CidadeFactory.getTotalCidades());
    }

}
