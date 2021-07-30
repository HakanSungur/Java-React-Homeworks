package Day4.GameStroeProject.Concrete;

import Day4.GameStroeProject.Abstract.GameService;
import Day4.GameStroeProject.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getCategoryName()+" oyun eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getCategoryName()+" oyun silindi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getCategoryName()+" oyun güncellendi.");
	}

}
