public class KimlikDogrulama implements IDogrulama{
    @Override
    public void dogrulama(int id , String firstName,String lastName,int birthyear) {
        System.out.println("Kimlik doğrulaması başarılı\t" + "giriş yapan kullanıcı ismi:\t" + firstName);

    }
}
