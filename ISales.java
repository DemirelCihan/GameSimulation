public interface ISales {
    void gameSales(NewMemberInfo newMemberInfo);
    //bu metot ile NewMemberInfo dan aldığımız bilgiler ile oyunun kime satıldığını kontrol ediyoruz.

    void checkCampaign();
    //bu metot ile satışlarda kampanya entegrasyonu kontrol edilmiştir.

}
