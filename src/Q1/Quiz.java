package Q1;

public class Quiz {


    private String nomeUsuario;
    private String pergunta;
    private String resposta;

    //iniciador
    public Quiz (String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public Quiz() {
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }



}

