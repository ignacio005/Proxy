public class DocumentoProxy implements Documento {
    private String nombre;
    private DocumentoReal documentoReal;
    private boolean autorizado;
    public DocumentoProxy(String nombre, boolean autorizado){
        this.nombre = nombre;
        this.documentoReal = new DocumentoReal(nombre); // Creo el documento real para que se guarde en el cajón documentoReal y tenga el nombre del documentoProxy
                                                        // de esta forma nunca esta vacío el cajón
        this.autorizado = autorizado;
    }
    @Override
    public void mostrar(){
        if (!autorizado){
            System.out.println("El usuario no está autorizado para acceder al documento.");
            return;
        }else {
            System.out.println("El usuario está autorizado para ver el documento.");
            documentoReal.mostrar();
        }
    }
}
