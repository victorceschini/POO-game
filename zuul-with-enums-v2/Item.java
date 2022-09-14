public class Item
{
    private String nome;
    private String descricao;
    private float peso;

    public Item(String n, String d, float p)
    {
        nome = n;
        descricao = d;
        peso = p;
    }

    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public float getPeso(){
        return peso;
    }
}