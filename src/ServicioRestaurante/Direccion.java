package ServicioRestaurante;

public class Direccion {

    private String provincia;

    private String canton;

    private String distrito;

    private String dirExacta;

    public Direccion() {
    }

    public Direccion(String provincia, String canton, String distrito, String dirExacta) {
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.dirExacta = dirExacta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDirExacta() {
        return dirExacta;
    }

    public void setDirExacta(String dirExacta) {
        this.dirExacta = dirExacta;
    }

    @Override
    public String toString() {
        return "Direccion{" + "provincia=" + provincia + ", canton=" + canton + ", distrito=" + distrito + ", dirExacta=" + dirExacta + '}';
    }
    
    
    
}
