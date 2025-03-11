package app.model;

import java.util.ArrayList;
import java.util.List;

public class Contato {
    private List<String>listaContatos = new ArrayList<>();

    public List<String> getContatos(){
        this.listaContatos.add("administracao@site.com.br");
        this.listaContatos.add("agronegocio@site.com.br");
        this.listaContatos.add("direito@site.com.br");
        return this.listaContatos;
    }
}
