package Jogo;

import java.util.List;

public class Guilda {
    private List<Player> membros;

    public Guilda(List<Player> membros) {
        this.membros = membros;
    }   

    public Guilda() {
    }

    public List<Player> getMembros() {
        return membros;
    }

    public void setMembros(List<Player> membros) {
        this.membros = membros;
    }
    
    
    }

