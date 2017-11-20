
import java.util.*;

public class Midia implements IUnidade {

    // ATRIBUTOS
    private String nome;
    private int limiteCapacidade;
    private TipoMidia tipo;
    private ArrayList<Diretorio> diretorios = new ArrayList();

    // CONSTRUTOR
    public Midia(String nom, int lim, int tipo) {
        this.setNome(nome);
        this.setLimiteCapacidade(lim);
        this.setTipoMidia(tipo);
    }

    // MÉTODO PARA ADICIONAR UM NOVO DIRETÓRIO
    public void addDiretorio(Diretorio dir) {
        this.diretorios.add(dir);
    }

    // MÉTODO QUE RETORNA O ESPAÇO USADO DA MIDIA
    public int getTamanho() {
        int total = 0;
        // PEGA O TAMANHO DOS DIRETÓRIOS
        for (Diretorio d : this.diretorios) {
            total += d.getTamanho();
        }

        return total;
    }

    // MÉTODO QUE SETA O LIMITE DA MÍDIA
    public void setLimiteCapacidade(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Valor inválido.");
        }
        this.limiteCapacidade = value;
    }

    // MÉTODO QUE SETA O NOME DA MIDIA
    public void setNome(String value) {
        // SE O NOME FOR NULO OU O NÚMERO DE CARACTERES, REMOVENDO O ESPAÇO 
        // INICIAL E FINAL, FOR IGUAL A ZERO
        if (value == null || value.trim().length() == 0) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = value.trim();
    }

    // MÉTODO QUE RETORNA O NOME DA MIDIA
    public String getNome() {
        return this.nome;
    }

    // MÉTODO QUE SETA O TIPO DE MIDIA
    public void setTipoMidia(int value) {
        switch (value) {
            // 0 PARA CD
            case 0:
                this.tipo = TipoMidia.CD;
                break;
            // 1 PARA DVD
            case 1:
                this.tipo = TipoMidia.DVD;
                break;
            default:
                throw new IllegalArgumentException("Tipo de midia inválido.");
        }
    }

    // MÉTODO QUE RETORNA O TIPO DE DIRETÓRIO
    public String getTipoMidia() {
        if (this.tipo == TipoMidia.CD) {
            return "CD";
        } else {
            return "DVD";
        }
    }

    // MÉTODO QUE RETORNA OS DIRETÓRIOS DA MÍDIA
    @Override
    public ArrayList<Diretorio> listarConteudo() {
        return this.diretorios;
    }

    private enum TipoMidia {
        CD, DVD;
    }
}
