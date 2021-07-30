package Day4.GameStroeProject.Abstract;

import Day4.GameStroeProject.Entities.Campaign;
import Day4.GameStroeProject.Entities.Game;
import Day4.GameStroeProject.Entities.User;

public interface GameSaleService {

	void sell(User user, Game game, Campaign campaign);
}
