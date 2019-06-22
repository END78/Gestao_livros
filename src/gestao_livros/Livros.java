/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao_livros;

/**
 *
 * @author danielpires
 */
public class Livros 
{
    private String ISBN;
    private String autor;
    private String ano_publ;
    private String nome;
    private boolean is_loaned = false ;

    public boolean isIs_loaned() {
        return is_loaned;
    }

    public void setIs_loaned(boolean is_loaned) {
        this.is_loaned = is_loaned;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno_publ() {
        return ano_publ;
    }

    public void setAno_publ(String ano_publ) {
        this.ano_publ = ano_publ;
    }
}
