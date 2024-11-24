package ud1_practica1_opcionb;

public class UD1_Practica1_OpcionB {

    public static void main(String[] args) {
        try {
            // Crear el proceso con ProcessBuilder
            ProcessBuilder processBuilder = new ProcessBuilder("ip", "a");
            processBuilder.redirectErrorStream(true);

            // Iniciar el proceso
            Process process = processBuilder.start();

            System.out.println("Proceso iniciado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
