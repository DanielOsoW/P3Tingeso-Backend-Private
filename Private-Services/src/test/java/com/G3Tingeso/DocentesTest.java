package com.G3Tingeso;
import com.G3Tingeso.PrivateServices.repositories.Docente_Repository;
import com.G3Tingeso.PrivateServices.repositories.Docente_RepositoryImp;
import com.G3Tingeso.PrivateServices.models.Docente;
import com.G3Tingeso.PrivateServices.services.DocenteService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class DocentesTest{

    String resultado1= '[{\¨id\":1,\"nombre\":\"Alcides Quispes\",\"id_rol_docente\":1,\"titulos\":null},{\"id\":2,\"nombre\":\"Manuel Villalobos-Cid\",\"id_rol_docente\":1,\"titulos\":null},{\"id\":3,\"nombre\":\"Felipe-Andrés Bello Robles\",\"id_rol_docente\":1,\"titulos\":null},{\"id\":4,\"nombre\":\"Carolina Bonacic Castro\",\"id_rol_docente\":2,\"titulos\":null},{\"id\":5,\"nombre\":\"Diego Caro Alarcón\",\"id_rol_docente\":2,\"titulos\":null},{\"id\":6,\"nombre\":\"Mario Inostroza Ponta\",\"id_rol_docente\":3,\"titulos\":null},{\"id\":7,\"nombre\":\"Mauricio Marín Caihuán\",\"id_rol_docente\":3,\"titulos\":null},{\"id\":8,\"nombre\":\"Roberto González Ibáñez\",\"id_rol_docente\":2,\"titulos\":null},{\"id\":9,\"nombre\":\"Eric Donders\",\"id_rol_docente\":3,\"titulos\":null},{\"id\":10,\"nombre\":\"Andrés Pumarino\",\"id_rol_docente\":1,\"titulos\":null},{\"id\":11,\"nombre\":\"Daniel Pacheco Pacheco\",\"id_rol_docente\":1,\"titulos\":null},{\"id\":12,\"nombre\":\"Arturo Terra\",\"id_rol_docente\":3,\"titulos\":null},{\"id\":13,\"nombre\":\"Gonzalo Concha\",\"id_rol_docente\":1,\"titulos\":null},{\"id\":14,\"nombre\":\"Juan Rodrigo Anabalón\",\"id_rol_docente\":1,\"titulos\":null},{\"id\":15,\"nombre\":\"Claudio Ossa Rojas\",\"id_rol_docente\":2,\"titulos\":null},{\"id\":16,\"nombre\":\"Waldo Gómez Román\",\"id_rol_docente\":2,\"titulos\":null},{\"id\":17,\"nombre\":\"Julián Márquez López\",\"id_rol_docente\":3,\"titulos\":null},{\"id\":18,\"nombre\":\"Felipe Sánchez Fabres\",\"id_rol_docente\":1,\"titulos\":null},{\"id\":19,\"nombre\":\"Gregorio Zaviezo\",\"id_rol_docente\":2,\"titulos\":null},{\"id\":20,\"nombre\":\"Marcelo Huerta Miranda\",\"id_rol_docente\":2,\"titulos\":null},{\"id\":21,\"nombre\":\"Carlos Lobos Medina\",\"id_rol_docente\":2,\"titulos\":null},{\"id\":22,\"nombre\":\"Armando Muñoz Moreno\",\"id_rol_docente\":2,\"titulos\":null}]';
    String resultado2 = "Tienes en total, 22 de la lista.";
    String resultado3 = '{\"id\":1,\"nombre\":\"Alcides Quispes\",\"id_rol_docente\":1,\"titulos\":null}'
    String resultado4 = '[{\"id\":2,\"nombre\":\"Manuel Villalobos-Cid\",\"id_rol_docente\":0,\"titulos\":null}]'
    String resultado5 = '[{\"id\":2,\"nombre\":\"Manuel Villalobos-Cid\",\"id_rol_docente\":0,\"titulos\":null},{\"id\":3,\"nombre\":\"Felipe-Andrés Bello Robles\",\"id_rol_docente\":0,\"titulos\":null},{\"id\":4,\"nombre\":\"Carolina Bonacic Castro\",\"id_rol_docente\":0,\"titulos\":null},{\"id\":5,\"nombre\":\"Diego Caro Alarcón\",\"id_rol_docente\":0,\"titulos\":null},{\"id\":6,\"nombre\":\"Mario Inostroza Ponta\",\"id_rol_docente\":0,\"titulos\":null},{\"id\":7,\"nombre\":\"Mauricio Marín Caihuán\",\"id_rol_docente\":0,\"titulos\":null},{\"id\":8,\"nombre\":\"Roberto González Ibáñez\",\"id_rol_docente\":0,\"titulos\":null}]'
    Docente_RepositoryImp docente = new Docente_RepositoryImp();
    
    @Test
    public void testGet(){
        Assertions.assertEquals(resultado1, docente.getAllDocentes(), "Se espera un 9");
    }
    @Test
    public void testCount(){
        Assertions.assertEquals(resultado2, docente.countDocente(), "Se espera un 5");
    }
    @Test
    public void testGetDocente(){
        Assertions.assertEquals(resultado3, docente.getDocente(1), "Se espera un 1");
    }
    @Test
    public void testGetCoordinadores(){
        Assertions.assertEquals(resultado4, docente.getCoordinadores(1), "Se espera un 1");
    }
    @Test
    public void testGetDocentesDiplomado(){
        Assertions.assertEquals(resultado5, docente.getDocentes(1), "Se espera un 1");
    }
}
