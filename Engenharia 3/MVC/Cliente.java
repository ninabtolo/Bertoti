interface Observador {
    void atualizar(String promocao);
}

class Cliente implements Observador {
    private String nome;
    private NotificacaoStrategy estrategia;

    public Cliente(String nome, NotificacaoStrategy estrategia) {
        this.nome = nome;
        this.estrategia = estrategia;
    }

    @Override
    public void atualizar(String promocao) {
        estrategia.enviarNotificacao("Promoção para " + nome + ": " + promocao);
    }
}
