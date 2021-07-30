package Day4.GameStroeProject.Concrete;

import Day4.GameStroeProject.Abstract.GameSaleService;
import Day4.GameStroeProject.Entities.Campaign;
import Day4.GameStroeProject.Entities.Game;
import Day4.GameStroeProject.Entities.User;

public class GameSaleManager implements GameSaleService{

	
	public void sell(User user, Game game, Campaign campaign) {
		double lastprice =game.getPrice()-(game.getPrice()*campaign.getDiscount()/100);
		
		System.out.println(user.getFirstName() + " isimli oyuncuya " + game.getPrice() + " tutarýndaki " + game.getGameName() + " isimli oyun " + campaign.getCampaignName() + " kampanyasý ile yüzde " + 
				campaign.getDiscount() + " indirimle " + lastprice + " fiyatýna satýlmýþtýr.");
	}

}
