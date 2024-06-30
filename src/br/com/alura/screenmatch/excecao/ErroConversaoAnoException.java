package br.com.alura.screenmatch.excecao;

public class ErroConversaoAnoException extends RuntimeException {
    private String mensagem;

    public ErroConversaoAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
