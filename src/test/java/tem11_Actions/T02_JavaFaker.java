package tem11_Actions;

import com.github.javafaker.Faker;
import org.junit.Test;
import utilities.TestBase;

public class T02_JavaFaker {

    Faker faker;

   @Test
   public void javaFakertest(){
       //    1.Faker objesi olustur.
     faker = new Faker();

     //     2. Faker objesi ile fake data olustur.

       //first name datasi
      String fName = faker.name().firstName();
       System.out.println(fName);

       //  meslek ismi
       System.out.println(faker.name().title());

       //sehir
       System.out.println(faker.address().city());

       //eyalet
       System.out.println(faker.address().state());

       //full address
       System.out.println(faker.address().fullAddress());

       //cep telefon numarası
       System.out.println(faker.phoneNumber().cellPhone());

       //email
       System.out.println(faker.internet().emailAddress());

       //last name datasi
       String fLastName = faker.name().lastName();
       System.out.println(fLastName);

       //  kullanici adi
       String userName = faker.name().username();
       System.out.println(userName);

        //posta kodu
       System.out.println(faker.address().zipCode());

       //rasgele 15 haneli numara
       System.out.println(faker.number().digits(15));

       //   TEST DATA  : kullanici adi, sifre, tel no, email, sehir, kredi kart no.....

                //Test datalarini kimden alir?
       //---1. BA- Business analyst(Acceptance Criteria lari yazar)
       // --2. Test Lead
       // --3. Manuel Tester
       // --4. Teac Lead & Team Lead & Dev Lead
       // --5. Dwvwloper
       // --6. Database
       // --7. API call lar
       // --8. Documantosyonlar. Ornegin; API swagger documani
       // --9. Java Faker da fake data almak icin kullaniyoruz.

       //NEREDEN GELMEZ : kullanicidan, scrum master


   }
}
