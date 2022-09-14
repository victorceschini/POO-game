import java.util.ArrayList;

public class Inventario {
    private ArrayList<Item> itens;
    private float pesoAtual;
    private float pesoTotal;

    public Inventario() {
        itens = new ArrayList<Item>();
        pesoAtual = 0;
        pesoTotal = 20;
    }

    public ArrayList<Item> getItens(){
        return itens;
    }
    
    public Item getItem(String nome){
        for(Item i : itens){
            if (nome.equals(i.getNome()) ){
                return i;
            }    
        }
        return null;
    }

    public boolean checaItem(String nome){
        for(Item i : itens){
            if (nome.equals(i.getNome()) ){
                return true;
            }    
        }
        return false;
    }

    public float getPesoAtual(){
        return pesoAtual;
    }

    public void setPesoAtual(float x){
        pesoAtual = x;
    }

    public float getPesoTotal(){
        return pesoTotal;
    }

    public void setPesoTotal(float x){
        pesoTotal = x;
    }

    public boolean addItem(Item i){
        if(pesoAtual + i.getPeso() <= pesoTotal) {
            itens.add(i);
            setPesoAtual(pesoAtual + i.getPeso());
            return true;
        }
        return false;
    }

    public void removeItem(Item i){
        itens.remove(i);
    }
}

