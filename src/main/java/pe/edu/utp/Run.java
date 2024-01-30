package pe.edu.utp;

import java.util.List;
import javax.swing.JOptionPane;

public class Run {
    public static void main(String[] args) {
        // Ruta del archivo CSV con la lista de aulas
        String archivoCSV = "C:\\Users\\Benjamin\\Downloads\\Nueva carpeta\\aulasUTP.csv";

        // Cargar los datos de las aulas desde el archivo CSV
        List<Aula> aulas = CargadorCSV.cargarAulasDesdeCSV(archivoCSV);

        // Mostrar las opciones de búsqueda
        String[] opciones = {"Buscar por ID de Ambiente", "Buscar por código"};
        int opcion = JOptionPane.showOptionDialog(null, "Opciones de búsqueda:", "Búsqueda de Aulas",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        switch (opcion) {
            case 0:
                String idAmbiente = JOptionPane.showInputDialog("Ingrese el ID de Ambiente a buscar:");
                Aula aulaPorIDAmbiente = BuscadorAulas.buscarPorIDAmbiente(aulas, idAmbiente);
                if (aulaPorIDAmbiente != null) {
                    JOptionPane.showMessageDialog(null, "Aula encontrada: " + aulaPorIDAmbiente.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Aula no encontrada.");
                }
                break;
            case 1:
                String codigo = JOptionPane.showInputDialog("Ingrese el código a buscar:");
                Aula aulaPorCodigo = BuscadorAulas.buscarPorCodigo(aulas, codigo);
                if (aulaPorCodigo != null) {
                    JOptionPane.showMessageDialog(null, "Aula encontrada: " + aulaPorCodigo.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Aula no encontrada.");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }
}
