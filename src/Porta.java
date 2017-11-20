
public class Porta {

    // ATRIBUTOS
    private String nomePorta;
    private Dispositivo dispositivoConectado;
    private Boolean isConectada;
    private TipoPorta tipo;

    // CONSTRUTOR
    public Porta(String nome, int tipo) {
        this.setNomePorta(nome);
        this.setTipoPorta(tipo);
        // QUANDO CRIA UMA, ELA COMEÇA COM NENHUM DISPOSITIVO CONECTADO
        this.setIsConectada(false);
    }

    // MÉTODO QUE RETORNA O DISPOSITIVO CONECTADO
    public Dispositivo getDispositivo() {
        if (!isConectada) {
            throw new IllegalArgumentException("Nenhum dispositivo conectado.");
        }
        return dispositivoConectado;
    }

    // MÉTODO QUE CONECTA UM DISPOSITIVO
    public void conectarDispositivo(Dispositivo dis) {
        if (isConectada) {
            throw new IllegalArgumentException("Porta já ligada a algum dispositivo.");
        }
        if ((this.tipo == TipoPorta.Paralela && (dis instanceof USB)) || (this.tipo == TipoPorta.USB && (dis instanceof Paralelo))) {
            throw new IllegalArgumentException("Dispositivo incompatível com o tipo de porta.");
        }
        this.dispositivoConectado = dis;
        this.setIsConectada(true);
    }

    // MÉTODO QUE DESCONECTA UM DISPOSITIVO
    public void desconectarDispositivo() {
        this.dispositivoConectado = null;
        this.setIsConectada(false);
    }

    // MÉTODO QUE RETORNA O ESTADO DA PORTA
    public Boolean getIsConectada() {
        return isConectada;
    }

    // MÉTODO QUE SETA O ESTADO DA PORTA
    public void setIsConectada(Boolean value) {
        this.isConectada = value;
    }

    // MÉTODO QUE RETORNA O NOME DA PORTA
    public String getNomePorta() {
        return nomePorta;
    }

    // MÉTODO QUE SETA O NOME DA PORTA
    public void setNomePorta(String value) {
        if (value == null || value.trim().length() == 0) {
            throw new IllegalArgumentException("Nome para porta inválido.");
        }
        this.nomePorta = value;
    }

    // MÉTODO QUE SETA O TIPO DE PORTA
    public void setTipoPorta(int value) {
        switch (value) {
            // 0 PARA PARALELA
            case 0:
                this.tipo = TipoPorta.Paralela;
                break;
            // 1 PARA USB
            case 1:
                this.tipo = TipoPorta.USB;
                break;
            default:
                throw new IllegalArgumentException("Tipo de porta inválido.");
        }
    }

    // MÉTODO QUE RETORNA O TIPO DE PORTA
    public String getTipoPorta() {
        if (this.tipo == TipoPorta.Paralela) {
            return "Paralela";
        } else {
            return "USB";
        }
    }

    // MÉTODO QUE RETORNA O ESTADO EM STRING
    public String getEstadoString() {
        if (isConectada) {
            return "Ocupada";
        }
        return "Livre";
    }

    // ENUMERADOR COM OS TIPOS DE DIRETÓRIO
    private enum TipoPorta {
        Paralela, USB;
    }
}
