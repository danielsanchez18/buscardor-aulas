package pe.edu.utp;

public class Aula {
    String idAmbiente;
    String codigo;
    int piso;
    String torre;

    public Aula(String idAmbiente, String codigo, int piso, String torre) {
        this.idAmbiente = idAmbiente;
        this.codigo = codigo;
        this.piso = piso;
        this.torre = torre;
    }

    @Override
    public String toString() {
        return "IDAmbiente: " + idAmbiente + ", Código: " + codigo + ", Piso: " + piso + ", Torre: " + torre;
    }

    public String getIdAmbiente() {
        return idAmbiente;
    }

    public void setIdAmbiente(String idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getTorre() {
        return torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
    }

}

