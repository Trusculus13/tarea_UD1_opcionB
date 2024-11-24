package ud1_practica1_opcionb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UD1_Practica1_OpcionB {

    public static void main(String[] args) {
        try {
            // Crear el proceso con ProcessBuilder
            ProcessBuilder processBuilder = new ProcessBuilder("ip", "a");
            processBuilder.redirectErrorStream(true);

            // Iniciar el proceso
            Process process = processBuilder.start();

            // Leer la salida del proceso con cierre automático de reader
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            System.out.println("Información de las tarjetas de red:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
