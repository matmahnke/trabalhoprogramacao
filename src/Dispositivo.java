
import java.util.*;

public abstract class Dispositivo {

    // ATRIBUTOS
    private String letra;
    private int limiteCapacidade;
    private ArrayList<Diretorio> diretorios = new ArrayList();
    private int tipo;

    // CONSTRUTOR
    public Dispositivo(String letra, int limite) {
        this.setLetra(letra);
        this.setLimiteCapacidade(limite);
    }

    // MÉTODO QUE SETA A LETRA DO DISOSITIVO
    public void setLetra(String value) {
        // SE O VALOR NÃO FOR NULO, NÃO FOR VAZIO E NÃO TIVER APENAS UM CARACTERE
        if (value == null || value.trim().length() != 1) {
            throw new IllegalArgumentException("Valor para letra inválido.");
        }
        this.letra = value.trim().toUpperCase();
    }

    // MÉTODO QUE RETORNA A LETRA DO DISPOSITIVO
    public String getLetra() {
        return this.letra;
    }

    // MÉTODO QUE SETA O LIMITE DE CAPACIDADE DO DISPOSITIVO
    public void setLimiteCapacidade(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Tamanho inválido.");
        }
        this.limiteCapacidade = value;
    }

    // MÉTODO QUE RETORNA O LIMITE DE CAPACIDADE DESTE DISPOSITIVO
    public int getLimiteCapadidade() {
        return this.limiteCapacidade;
    }

    // MÉTODO QUE ADICIONA UM NOVO DIRETÓRIO AO DISPOSITIVO
    public void addDiretorio(Diretorio dir) {
        if (verificarEspacoDisponivel(dir)) {
            throw new IllegalArgumentException("Tamanho do arquivo ou pasta maior que o disponível no dispositivo.");
        }
        this.diretorios.add(dir);
    }

    // MÉTODO QUE RETORNA OS DIRETÓRIOS DESTE DISPOSITIVO
    public ArrayList<Diretorio> getDiretorios() {
        return this.diretorios;
    }

    // MÉTODO QUE RETORNA TODO O TAMANHO USADO DO DISPOSITIVO
    public int getEspaco() {
        int total = 0;
        for (Diretorio dir : diretorios) {
            total += dir.getTamanho();
        }

        return total;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int value) {
        if (value < 0 || value > 3) {
            throw new IllegalArgumentException("Tipo inválido!");
        }
        this.tipo = value;
    }

    // MÉTODO QUE VERIFICA SE HÁ ESPAÇO DISPONÍVEL NO DISPOSITIVO
    public Boolean verificarEspacoDisponivel(Diretorio dir) {
        // VERDADEIRO SE O TAMANHO DO DIRETÓRIO FOR MAIOR QUE O DISPONÍVEL
        return dir.getTamanho() > this.limiteCapacidade - this.getEspaco();
    }

    // MÉTODO QUE RETORNA TODOS OS DIRETÓRIOS EM STRING
    public String listarDiretorios() {
        String tudo = "Dispositivo: " + this.getLetra() + " - " + this.getEspaco() + " bytes\r\n";
        for (Diretorio dire : diretorios) {
            tudo += "_ " + dire.getNome() + "\r\n";
            if (dire.getTipoDiretorio() == "Pasta") {
                for (Diretorio diret : dire.getDiretorios()) {
                    tudo += "    |_ " + diret.getNome() + "\r\n";
                }
            }
        }
        return tudo;
    }
}
