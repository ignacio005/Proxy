public class DocumentoReal implements Documento{
    private String nombre;
    public DocumentoReal(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void mostrar(){
        System.out.println("Mostrando documento real: " + nombre);
    }

}
