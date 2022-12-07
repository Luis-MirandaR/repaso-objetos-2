package uaslp.objetos.escuela;

public abstract class SalaDeJuntasFactory {
    public static SalaDeJuntas get(String sala) {
        if(sala.equals("Sala A")) {
            return SalaDeJuntasA.getInstance();
        }
        if(sala.equals("Sala B")){
            return SalaDeJuntasB.getInstance();
        }
        if(sala.equals("Sala C")){
            return SalaDeJuntasC.getInstance();
        }
        return null;
    }

    public abstract SalaDeJuntas getNombre();
}
