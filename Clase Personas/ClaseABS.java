package EjerciciosClase;

public class ClaseABS {
    public static void main(String[] args) {
    	
        Persona[] personas = new Persona[10];

        for (Persona persona : personas) {
            persona.saludar();
        }
    }
}
