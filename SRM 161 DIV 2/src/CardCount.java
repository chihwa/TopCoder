import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CardCount {
	
	public String[] dealHands(int numPlayers, String deck) {
		int playerId = 0;
		String r[] = new String[numPlayers];
		Arrays.fill(r, "");
		for (int i = 0; i < deck.length() - (deck.length()%numPlayers); i++) {
			r[playerId++] += deck.charAt(i);
			playerId %= numPlayers;
		}
		return r;
	}
}
