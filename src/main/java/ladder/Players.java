package ladder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Players {

    private List<Player> players;

    public Players(String playersNames) {
        this.players = addPlayers(playersNames);
    }

    private List<Player> addPlayers(String playersNames) {
        return Arrays.stream(playersNames.split(","))
                .map(playername -> new Player(playername))
                .collect(Collectors.toList());
    }

    public int size() {
        return players.size();
    }

    public List<String> getPlayerList() {
        return players.stream()
                .map(player -> player.getPlayerName())
                .collect(Collectors.toList());
    }
}
