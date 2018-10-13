package Banco;

public class Basics {
    private int Id;
    private String Usuario;
    private String Senha;
    private String Primeiro_Nome;
    private String Segundo_Nome;
    private String Local_Trabalho;
    private String Descricao;
    private String Informacao;

// Método Construtor
    public Basics(int Id, String Usuario, String Senha, String Primeiro_Nome, String Segundo_Nome, String Local_Trabalho, String Descricao, String Informacao) {
        this.Id = Id;
        this.Usuario = Usuario;
        this.Senha = Senha;
        this.Primeiro_Nome = Primeiro_Nome;
        this.Segundo_Nome = Segundo_Nome;
        this.Local_Trabalho = Local_Trabalho;
        this.Descricao = Descricao;
        this.Informacao = Informacao;
    }

    public Basics() {
    }

// Getters & Setters
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getPrimeiro_Nome() {
        return Primeiro_Nome;
    }

    public void setPrimeiro_Nome(String Primeiro_Nome) {
        this.Primeiro_Nome = Primeiro_Nome;
    }

    public String getSegundo_Nome() {
        return Segundo_Nome;
    }

    public void setSegundo_Nome(String Segundo_Nome) {
        this.Segundo_Nome = Segundo_Nome;
    }

    public String getLocal_Trabalho() {
        return Local_Trabalho;
    }

    public void setLocal_Trabalho(String Local_Trabalho) {
        this.Local_Trabalho = Local_Trabalho;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getInformacao() {
        return Informacao;
    }

    public void setInformacao(String Informacao) {
        this.Informacao = Informacao;
    }
}
