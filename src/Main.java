public class Main {
    public static void main(String[] args) {
        // utilizo la interfaz para crear el objeto del proxy para poder acceder al resto de metodos de las clases que lo implementen
        Documento documento1 = new DocumentoProxy("documento.pdf", true);
        documento1.mostrar();

        Documento documento2 = new DocumentoProxy("documento.pdf", false);
        documento2.mostrar();
    }
}