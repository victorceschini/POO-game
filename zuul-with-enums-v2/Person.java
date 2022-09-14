
public class Person
{
    private Inventario inventario;
    private int movimentos;

    public Person(){
        inventario = new Inventario();
        movimentos =  50;
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

}