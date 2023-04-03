import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<Player>();

    public void register(Player player) {
        players.add(player);

    }


        public int round(String playerName1, String playerName2) {
            Player player1 = findByName(playerName1);
            Player player2 = findByName(playerName2);;
            if (player1 == null) {
                throw new NotRegisteredExcepction(playerName1);
            }
            if (player2 == null) {
                throw new NotRegisteredExcepction(playerName2);
            }
            if (player1.getStrenght() > player2.getStrenght()) {
                return 1;
            }
            if (player1.getStrenght() < player2.getStrenght()) {
                return 2;
            }
            return 0;
        }

        public Player findByName(String name) {
            for (Player player : players) {
                if (player.getName() == name) {
                    return player;
                }
            }
            return null;
        }

}
