
import java.util.*;

public class Paralelo extends Dispositivo implements IUnidade {

    // ATRIBUTOS
    private TipoDispositivo tipo;
    private Midia midiaConectada;

    // CONSTRUTOR
    public Paralelo(String letra, int limite, int tipo) {
        super(letra, limite);
        super.setTipo(tipo);
        this.setTipoDispositivo(tipo);
    }

    // MÉTODO QUE SETA O TIPO DE DISPOSITIVO
    public void setTipoDispositivo(int value) {
        switch (value) {
            // 0 PARA HD
            case 0:
                this.tipo = TipoDispositivo.HD;
                break;
            // 1 PARA CD
            case 1:
                this.tipo = TipoDispositivo.CD;
                break;
            // 2 PARA DVD
            case 2:
                this.tipo = TipoDispositivo.DVD;
                break;
            default:
                throw new IllegalArgumentException("Tipo de dispositivo inválido.");
        }
    }

    // MÉTODO QUE RETORNA O TIPO DE DISPOSITIVO
    public String getTipoDispositivo() {
        if (this.tipo == TipoDispositivo.HD) {
            return "HD";
        } else if (this.tipo == TipoDispositivo.CD) {
            return "CD";
        } else {
            return "DVD";
        }
    }

    // MÉTODO QUE CONECTA UMA MÍDIA
    public void setMidia(Midia mid) {
        // VERIFICA COMPATIBILIDADE, LANÇANDO EXCEÇÃO CASO HAJA ALGUM PROBLEMA
        verificarCompatibilidade(mid);
        // VERIFICA SE NÃO HÁ UMA MÍDIA JÁ CONECTADA
        if (this.midiaConectada != null) {
            throw new IllegalArgumentException("Dispositivo já conectado a outra mídia!");
        }
        this.midiaConectada = mid;
    }

    // MÉTODO QUE RETORNA A MÍDIA CONECTADA
    public Midia getMidia() {
        return this.midiaConectada;
    }

    // MÉTODO QUE VERIFICA A COMPATIBILIDADE DA MÍDIA COM O DISPOSITIVO
    private void verificarCompatibilidade(Midia mid) {
        // VERIFICA SE É POSSÍVEL ADICIONAR MÍDIA
        if (this.tipo == TipoDispositivo.HD) {
            throw new IllegalArgumentException("Tipo de dispositivo inválido para mídias.");
        }
        // VERIFICA SE É ACEITÁVEL
        if (this.tipo == TipoDispositivo.CD && mid.getTipoMidia() == "DVD") {
            throw new IllegalArgumentException("Tipo de dispositivo inválido para mídias do tipo DVD.");
        }
    }

    // MÉTODO QUE ADICIONA DIRETÓRIOS, CASO SEJA HD
    @Override
    public void addDiretorio(Diretorio dir) {
        if (this.tipo != TipoDispositivo.HD) {
            throw new IllegalArgumentException("Tipo de dispositivo inválido para diretórios.");
        }
        super.addDiretorio(dir);
    }

    // MÉTODO QUE RETORNA OS DIRETÓRIOS
    @Override
    public ArrayList<Diretorio> getDiretorios() {
        return super.getDiretorios();
    }

    // MÉTODO QUE RETORNA OS DIRETÓRIOS DO DISPOSITIVO
    @Override
    public ArrayList<Diretorio> listarConteudo() {
        return super.getDiretorios();
    }

    // ENUMERADOR COM OS TIPOS DE DISPOSITIVO
    public enum TipoDispositivo {
        HD, CD, DVD;
    }
}
