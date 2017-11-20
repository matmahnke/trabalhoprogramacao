
import java.util.*;

public class Diretorio {

    // ATRIBUTOS
    private String nome;
    private int tamanho;
    private TipoDiretorio tipo;
    private ArrayList<Diretorio> diretorios = new ArrayList();

    // CONSTRUTOR
    public Diretorio(String nome, int tamanho, int tipo) {
        this.setNome(nome);
        this.setTipoDiretorio(tipo);
        this.setTamanho(tamanho);
    }

    // MÉTODO PARA ADICIONAR UM NOVO DIRETÓRIO
    public void addDiretorio(Diretorio dir) {
        // SÓ ADICIONA UM DIRETÓRIO NA LISTA SE O TIPO DE DIRETÓRIO FOR PASTA
        if (tipo == TipoDiretorio.Pasta) {
            this.diretorios.add(dir);
        } else {
            throw new IllegalArgumentException("Impossível adicionar arquivo/pasta em diretório do tipo arquivo.");
        }
    }

    // MÉTODO QUE RETORNA OS DIRETÓRIOS DESTE DIRETÓRIO
    public ArrayList<Diretorio> getDiretorios() {
        return this.diretorios;
    }

    // MÉTODO QUE RETORNA O TAMANHO TOTAL DESTE DIRETÓRIO
    public float getTamanho() {
        float total = this.tamanho;
        // SE O DIRETÓRIO FOR DO TIPO PASTA
        if (this.tipo == TipoDiretorio.Pasta) {
            total += 8;
            // PEGA OS DIRETÓRIOS DENTRO DESSES DIRETÓRIOS
            for (Diretorio d : this.diretorios) {
                total += d.getTamanho();
            }
        }
        // SOMA O TOTAL DE CARACTERES DO NOME
        total += this.nome.length();

        return total;
    }

    // MÉTODO QUE SETA O TAMANHO DO DIRETÓRIO
    public void setTamanho(int value) {
        if (this.tipo == TipoDiretorio.Arquivo) {
            if (value <= 0) {
                throw new IllegalArgumentException("Tamanho inválido.");
            }
            // SÓ É POSSIVEL DEFINIR O TAMANHO DE DIRETÓRIOS DO TIPO ARQUIVO
            this.tamanho = value;
        } else {
            // CASO CONTRÁRIO, SE FOR UMA PASTA, O TAMANHO COMEÇA ZERADO 
            // E CRESCE CONFORME SÃO ADICIONADOS DIRETÓRIOS NELA
            this.tamanho = 0;
        }
    }

    // MÉTODO QUE SETA O NOME DO DIRETÓRIO
    public void setNome(String value) {
        // SE O NOME FOR NULO OU O NÚMERO DE CARACTERES, REMOVENDO O ESPAÇO 
        // INICIAL E FINAL, FOR IGUAL A ZERO
        if (value == null || value.trim().length() == 0) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = value.trim();
    }

    // MÉTODO QUE RETORNA O NOME DO DIRETÓRIO
    public String getNome() {
        return this.nome;
    }

    // MÉTODO QUE SETA O TIPO DE DIRETÓRIO
    public void setTipoDiretorio(int value) {
        switch (value) {
            // 0 PARA ARQUIVO
            case 0:
                this.tipo = TipoDiretorio.Arquivo;
                break;
            // 1 PARA PASTA
            case 1:
                this.tipo = TipoDiretorio.Pasta;
                break;
            default:
                throw new IllegalArgumentException("Tipo de diretório inválido.");
        }
    }

    // MÉTODO QUE RETORNA O TIPO DE DIRETÓRIO
    public String getTipoDiretorio() {
        if (this.tipo == TipoDiretorio.Arquivo) {
            return "Arquivo";
        } else {
            return "Pasta";
        }
    }

    // ENUMERADOR COM OS TIPOS DE DIRETÓRIO
    public enum TipoDiretorio {
        Arquivo, Pasta;
    }
}
