package pe.edu.utp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BuscadorAulas {

    // Método para buscar aulas por ID de Ambiente utilizando búsqueda lineal
    static Aula buscarPorIDAmbiente(List<Aula> aulas, String idAmbiente) {
        Aula aulaEncontrada = null;
        for (Aula aula : aulas) {
            if (aula.idAmbiente.equals(idAmbiente)) {
                aulaEncontrada = aula;
                break;
            }
        }

        mostrarResultado(aulaEncontrada);
        return aulaEncontrada;
    }

    // Método para buscar aulas por código utilizando búsqueda lineal
    static Aula buscarPorCodigo(List<Aula> aulas, String codigo) {
        Aula aulaEncontrada = null;
        for (Aula aula : aulas) {
            if (aula.codigo.equals(codigo)) {
                aulaEncontrada = aula;
                break;
            }
        }

        mostrarResultado(aulaEncontrada);
        return aulaEncontrada;
    }

    // Método para mostrar el resultado (imagen del aula) en una página HTML y guardarla en un archivo
    static void mostrarResultado(Aula aulaEncontrada) {
        if (aulaEncontrada != null) {
            // Construir la ruta completa de la imagen basada en el ID de Ambiente
            String rutaImagen = "C:\\Users\\Benjamin\\Downloads\\Nueva carpeta\\imagenesAulas\\" + aulaEncontrada.idAmbiente + ".jpg";

            // Construir la ruta completa donde se guardará la página HTML
            String rutaArchivoHTML = "C:\\Users\\Benjamin\\Downloads\\Nueva carpeta\\" + aulaEncontrada.idAmbiente + ".html";

            // Crear una página HTML para mostrar la imagen
            String html = "<html><head><meta charset='UTF-8'></head><body><h1>Aula encontrada:</h1>" +
                    "<style>\n"+"" + ".imagen { width: 100px; height: 100px; margin-right: 10px; }\n" + "</style>\n" +
                    "<img class=\"imagen\" src=" + rutaImagen + "' alt='Imagen del aula'>" +
                    "</body></html>";

            // Guardar la página HTML en la ubicación específica
            guardarPaginaHTML(html, rutaArchivoHTML);
        } else {
            System.out.println("Aula no encontrada.");
        }
    }



    // Método para guardar una página HTML en un archivo
    static void guardarPaginaHTML(String html, String archivo) {
        try (PrintWriter writer = new PrintWriter(archivo)) {
            writer.println(html);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

