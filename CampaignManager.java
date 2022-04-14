public class CampaignManager implements ICampaignManagement{
    @Override
    public void addCampaign() {
        System.out.println("Sistem tarafınfan yeni bir kampanya eklendi.");
    }

    @Override
    public void deleteCampaign() {
        System.out.println("Kampanya silme işlemi tamamlandı.");
    }

    @Override
    public void updateCampaign() {
        System.out.println("Kampanya güncellendi.");
    }
}
