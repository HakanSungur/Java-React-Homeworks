package Day4.GameStroeProject.Concrete;

import Day4.GameStroeProject.Abstract.GameSaleService;
import Day4.GameStroeProject.Entities.Campaign;
import Day4.GameStroeProject.Entities.Game;
import Day4.GameStroeProject.Entities.User;

public class GameSaleManager implements GameSaleService{

	
	public void sell(User user, Game game, Campaign campaign) {
		double lastprice =game.getPrice()-(game.getPrice()*campaign.getDiscount()/100);
		
		System.out.println(user.getFirstName() + " isimli oyuncuya " + game.getPrice() + " tutar�ndaki " + game.getGameName() + " isimli oyun " + campaign.getCampaignName() + " kampanyas� ile y�zde " + 
				campaign.getDiscount() + " indirimle " + lastprice + " fiyat�na sat�lm��t�r.");
	}

}
