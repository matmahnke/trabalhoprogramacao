
import java.util.*;

public class Computador implements IUnidade {

    // ATRIBUTOS
    private ArrayList<Porta> portas = new ArrayList();

    // MÉTODO QUE ADICIONA UMA PORTA
    public void addPorta(int tipoPorta) {
        Porta p;
        if (tipoPorta == 0) {
            p = new Porta("PAR" + contarPortas("Paralela"), 0);
            portas.add(p);
        } else if (tipoPorta == 1) {
            p = new Porta("USB" + contarPortas("USB"), 1);
            portas.add(p);
        } else {
            throw new IllegalArgumentException("Tipo de porta inválido.");
        }
    }

    @Override
    public ArrayList<Porta> listarConteudo() {
        return this.portas;
    }

    // MÉTODO QUE CONTA O TOTAL DE PORTAS DE UM TIPO
    private int contarPortas(String tipo) {
        int total = 0;
        for (int i = 0; i < portas.size(); i++) {
            if (portas.get(i).getTipoPorta() == tipo) {
                total++;
            }
        }
        return total + 1;
    }
}
