public class Player {
    public int getId() {
        return id;
    }


    private int id;
    private String name;
    private int strenght;


    public Player(int id, String name, int strenght) {
        this.id = id;
        this.name = name;
        this.strenght = strenght;
    }

    public String getName() {
        return name;
    }

    public int getStrenght() {
        return strenght;
    }
}
