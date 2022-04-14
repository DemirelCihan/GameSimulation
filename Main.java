public class Main {
    public static void main(String[] args) {
        KimlikDogrulama kimlikDogrulama = new KimlikDogrulama();
        System.out.println("Kimlik doğrulama işlemi yapılıyor.....\n");
        kimlikDogrulama.dogrulama(123456789,"cihan", "demirel", 1999);

        Member member = new Member();
         NewMemberInfo ilkSatıs = new NewMemberInfo(123456789,"cihan", "demirel", 1999);
         member.addMember(ilkSatıs);

         Game game = new Game();
         NewMemberInfo ilkSatısBilgileri = new NewMemberInfo(123456789,"cihan","demirel",1999);
         game.gameSales(ilkSatısBilgileri);

         CampaignManager campaignManager = new CampaignManager();
         campaignManager.addCampaign();

         Game game1 = new Game();
         game1.checkCampaign();


    }
}
