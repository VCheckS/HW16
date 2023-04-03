import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
   @Test
    public void testRoundWhenFirstPlayerWin() {
        Game game = new Game();
        Player jon = new Player(1,"Jon", 85);
        Player jack = new Player(2,"Jack", 75);
        game.register(jon);
        game.register(jack);
        int actual = game.round("Jon", "Jack");
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testRoundWhenSecondPlayerWin() {
        Game game = new Game();
        Player jon = new Player(1,"Jon", 85);
        Player jack = new Player(2,"Jack", 95);
        game.register(jon);
        game.register(jack);
        int actual = game.round("Jon", "Jack");
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testRoundWhenNoOneWins() {
        Game game = new Game();
        Player jon = new Player(1,"Jon", 95);
        Player jack = new Player(2,"Jack", 95);
        game.register(jon);
        game.register(jack);
        int actual = game.round("Jon", "Jack");
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testRoundWhenFirstPlayerNotRegistered() {
        Game game = new Game();
        Player jon = new Player(1,"Jon", 95);
        Player jack = new Player(2,"Jack", 95);

        game.register(jack);
        Assertions.assertThrows(NotRegisteredExcepction.class,
                () -> game.round("Jon", "Jack")
        );
    }
    @Test
    public void testRoundWhenSecondPlayerNotRegistered() {
        Game game = new Game();
        Player jon = new Player(1,"Jon", 95);
        Player jack = new Player(2,"Jack", 95);

        game.register(jon);

        Assertions.assertThrows(NotRegisteredExcepction.class,
                () -> game.round("Jon", "Jack")
        );
    }
    @Test
    public void testRoundWhenBothPlayersNotRegistered() {
        Game game = new Game();
        Player jon = new Player(1,"Jon", 95);
        Player jack = new Player(2,"Jack", 95);


        Assertions.assertThrows(NotRegisteredExcepction.class,
                () -> game.round("Jon", "Jack")
        );
    }
}
