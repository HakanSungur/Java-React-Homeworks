package Day4.GameStroeProject.Concrete;

import Day4.GameStroeProject.Abstract.CampaignService;
import Day4.GameStroeProject.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi!");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi");
		
	}

}
