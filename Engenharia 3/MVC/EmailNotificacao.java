interface NotificacaoStrategy {
    void enviarNotificacao(String mensagem);
}

class EmailNotificacao implements NotificacaoStrategy {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("enviando Email" + mensagem);
    }
}

class SMSNotificacao implements NotificacaoStrategy {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("enviando SMS" + mensagem);
    }
}