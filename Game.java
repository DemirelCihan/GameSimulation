public class Game implements ISales{
    @Override
    public void gameSales(NewMemberInfo newMemberInfo) {
        System.out.println("oyun satın alındı\t"+ "satın alan:\t"  +newMemberInfo.getFirstName());

    }

    @Override
    public void checkCampaign(){
        System.out.println("oyun satışlarında kampanya entegrasyonu sağlandı");
    }
}
