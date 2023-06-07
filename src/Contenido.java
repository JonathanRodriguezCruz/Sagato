/**
 * Clase Contenido
 *
 * Contine la informacion de todo el contenido
 *
 * @author Jonathan I. Rodriguez Cruz
 * @version v.1
 */
public class Contenido {
    //Atributos
    private String tipo;
    private String titulo;
    private String genero;
    private String informacion;
    private String idioma;
    private Contenido[] lista = new Contenido[20];
    private String valoraciones;
    private Contenido[] verMasTarde = new Contenido[20];

    /**
     * Constructor que contiene 5 parametros
     *
     * @param tipo
     * @param titulo
     * @param genero
     * @param info
     * @param idioma
     */
    public Contenido(String tipo, String titulo, String genero, String info, String idioma){
        this.tipo = tipo;
        this.titulo = titulo;
        this.genero = genero;
        this.informacion = info;
        this.idioma = idioma;
        this.valoraciones = "";
    }

    //Getters and Setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getInformacion() {
        return informacion;
    }
    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public Contenido[] getLista() {
        return lista;
    }
    public void setLista(Contenido[] lista) {
        this.lista = lista;
    }
    public String getValoraciones() {
        return valoraciones;
    }
    public void setValoraciones(String valoraciones) {
        this.valoraciones = valoraciones;
    }
    public Contenido[] getVerMasTarde() {
        return verMasTarde;
    }
    public void setVerMasTarde(Contenido[] verMasTarde) {
        this.verMasTarde = verMasTarde;
    }

    //Metodos
    /**
     * Guarda el contenido en una lista
     *
     * @param conten
     */
    public void guardar(Contenido conten){
        for(int i = 0; i < lista.length; i++){
            if (lista[i] == null){
                lista[i] = conten;
            }
        }
    }

    /**
     * Añade la opinion a las valoraciones
     *
     * @param opinion
     */
    public String valorar(String opinion){
        return valoraciones += opinion;
    }

    /**
     * Añade el contenido especificado a la lista "ver mas tarde"
     *
     * @param conten
     */
    public void verMasTarde(Contenido conten){
        for(int i = 0; i < verMasTarde.length; i++){
            if (verMasTarde[i] == null){
                verMasTarde[i] = conten;
            }
        }
    }
}
