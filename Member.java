public class Member implements INewMember{

    @Override
    public void addMember(NewMemberInfo newMemberInfo) {
        System.out.println("yeni bir üye eklendi.\t" + " Üye ismi:\t" + newMemberInfo.getFirstName() +" " + "Üye soyismi:\t" +newMemberInfo.getLastName());
    }

    @Override
    public void updateMember(NewMemberInfo newMemberInfo) {
        System.out.println("üye güncellenmesi tamamlandı." + "Güncellenen isim:\t" +newMemberInfo.getFirstName());
    }

    @Override
    public void deleteMember(NewMemberInfo newMemberInfo) {
        System.out.println("üye kaydınız silindi!\t" +"Silinen isim:\t" +newMemberInfo.getFirstName());
    }
}
