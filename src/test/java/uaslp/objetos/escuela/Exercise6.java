package uaslp.objetos.escuela;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }

    @Test
    public void AEqualToB(){
        //Given
        Dependencia1 dependencia1;
        Dependencia2 dependencia2;
        Dependencia3 dependencia3;

        //When


        //Then
    }
    @Test
    public void ASmallerThanB(){
        //Given

        //When

        //Then
    }

    @Test
    public void ABiggerThanB(){
        //Given

        //When

        //Then
    }
}
