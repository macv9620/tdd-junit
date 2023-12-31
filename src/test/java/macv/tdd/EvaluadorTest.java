package macv.tdd;

import macv.tdd.subasta.Evaluador;
import macv.tdd.subasta.Oferta;
import macv.tdd.subasta.Subasta;
import macv.tdd.subasta.Usuario;
import org.junit.Assert;
import org.junit.Test;



public class EvaluadorTest {
    @Test
    public void deberiaRetornarElMayorValor() {
        Usuario diego = new Usuario(1, "Diego");
        Usuario alexiz = new Usuario(2, "Alexiz");
        Usuario daniel = new Usuario(3, "Daniel");

        Oferta oferta1 = new Oferta(diego, 300.00);
        Oferta oferta2 = new Oferta(alexiz, 500.00);
        Oferta oferta3 = new Oferta(daniel, 700.00);

        Subasta subasta = new Subasta("Auto del anho");
        subasta.propone(oferta1);
        subasta.propone(oferta2);
        subasta.propone(oferta3);

        Evaluador evaluador = new Evaluador();
        evaluador.evalua(subasta);

        Assert.assertEquals(700, evaluador.getMayorQueTodos(), 0.00001);
        Assert.assertEquals(300, evaluador.getMenorQueTodos(), 0.00001);
    }

    }