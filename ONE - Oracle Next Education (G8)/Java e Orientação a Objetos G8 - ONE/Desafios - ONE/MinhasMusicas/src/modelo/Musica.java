package modelo;

public class Musica extends Audio {
    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibeDetalhes() {
        System.out.println("""
                Titulo da música: %s
                Artista: %s
                Genero: %s
                Curtidas: %d
                Reproduções: %d
                """.formatted(getTitulo(), getCantor(), getGenero(), getTotalCurtidas(), getTotalReproducao()));
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducao() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }

}
