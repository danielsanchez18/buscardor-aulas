package pe.edu.utp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CargadorCSV {
    public static List<Aula> cargarAulasDesdeCSV(String archivoCSV) {
        List<Aula> aulas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 4) {
                    String idAmbiente = partes[0];
                    String codigo = partes[1];
                    int piso = Integer.parseInt(partes[2]);
                    String torre = partes[3];
                    aulas.add(new Aula(idAmbiente, codigo, piso, torre));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return aulas;
    }
}

