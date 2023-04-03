public class NotRegisteredExcepction extends RuntimeException{
    public NotRegisteredExcepction(String name) {
        super("Player" + name + "isn't exist");
    }
}
