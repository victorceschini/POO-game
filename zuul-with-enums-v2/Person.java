
public class Person
{
    private Inventario inventario;
    private int movimentos;

    public Person(){
        inventario = new Inventario();
        movimentos =  100;
    }

    public Inventario getInventario(){
        return inventario;
    }

    public int getMovimentos(){
        return movimentos;
    }

    public void setMovimentos(int movimentos){
        this.movimentos = movimentos;
    }

    public boolean addItem(Item item){
        return inventario.addItem(item);
    }
    
    public void removeItem(Item item) {
    	inventario.removeItem(item);
    }
}
