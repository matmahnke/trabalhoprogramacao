
import java.util.ArrayList;

public class USB extends Dispositivo implements IUnidade {

    // ATRIBUTOS
    private TipoDispositivo tipo;

    // CONSTRUTOR
    public USB(String letra, int limite, int tipo) {
        super(letra, limite);
        super.setTipo(tipo);
        this.setTipoDispositivo(tipo);
    }

    // MÉTODO QUE SETA O TIPO DE DISPOSITIVO
    public void setTipoDispositivo(int value) {
        switch (value) {
            // 0 PARA HD EXTERNO
            case 0:
                this.tipo = TipoDispositivo.HDExterno;
                break;
            // 1 PARA PENDRIVE
            case 1:
                this.tipo = TipoDispositivo.PenDrive;
                break;
            default:
                throw new IllegalArgumentException("Tipo de dispositivo inválido.");
        }
    }

    // MÉTODO QUE RETORNA O TIPO DE DISPOSITIVO
    public String getTipoDispositivo() {
        if (this.tipo == TipoDispositivo.HDExterno) {
            return "HD Externo";
        } else {
            return "PenDrive";
        }
    }

    // MÉTODO QUE RETORNA OS DIRETÓRIOS DO DISPOSITIVO
    @Override
    public ArrayList<Diretorio> listarConteudo() {
        return super.getDiretorios();
    }
    
    // ENUMERADOR COM OS TIPOS DE DISPOSITIVO
    public enum TipoDispositivo {
        HDExterno, PenDrive;
    }
}
