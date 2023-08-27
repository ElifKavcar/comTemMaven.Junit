package tem16_Excel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class T01_ExcelRead {
    @Test
    public void readExcelTest() throws IOException {
        //   WORKBOOK > WORKSHEET/SHEET > ROW(SATIR) > CELL(VERI HUCRESI)
        String path = "./src/test/java/resources/Capitals.xlsx";

        //DOSYAYI AC
        FileInputStream fileInputStream = new FileInputStream(path);

        //EXCEL DOSYASINI AC / WORKBOOK AC
        Workbook workbook = WorkbookFactory.create(fileInputStream);


        //SAYFAYI AC / SHEETI AC
       // Sheet sheet1 = workbook.getSheetAt(0); // index o dan baslar.
        Sheet sheet1 = workbook.getSheet("Sheet1"); // Sheet1 isimli sayfaya git


          //ILK SATIRA GIT  / ROW
       Row row1=  sheet1.getRow(0);  // ilk satira git

          //ILK SATIRDAKI ILK VERIYI AL
       Cell cell1 = row1.getCell(0); // ilk hücredeki datayi ver

           //O VERIYI YAZDIR
        System.out.println(cell1);

           //1. SATIR 2. SUTUN
        Cell cell12 = sheet1.getRow(0).getCell(1);
        System.out.println(cell12);

            //3. SATIR 1. SUTUN
        //Cell cell31 = sheet1.getRow(2).getCell(0);
        //System.out.println(cell31);

        //3. SATIR 1. SUTUN yazdir ve o verinin France oldugunu dogrula
        // ONEMLİ: Data tipi string olmadan Assert dogrulama yapamayiz
           //      DATA TİPİ CELL OLAN YAPIYI STRİNGE DONUSTURDUK
        String cell31 = sheet1.getRow(2).getCell(0).toString();
        System.out.println(cell31);
        Assert.assertEquals("France", cell31);

        //Exceldeki toplam kullanilan satir sayisini bulunuz
        // 1. YOL
        int toplamSatirSayisi = sheet1.getLastRowNum()+1; //Beklentim 11
        System.out.println(toplamSatirSayisi); // gelen 10 o yüzden +1 ekledik

        //2. YOL  Boş satirlari atlayarak sayi verir
        int kullanilanSatirSayisi = sheet1.getPhysicalNumberOfRows(); //sayma sayilari gibi 1 den basliyor
        System.out.println(kullanilanSatirSayisi);// 1 den basliyor

        //  COUNTRY , CAPITALS key ve value lari map a alip print et
        //{{USA, D.C},{FRANCE,PARIS},    }

        //Variable olusturalim. Bu variable exceldeki country, capital verilerini tutacak
        Map<String, String> ulkeBaskentleri = new HashMap<>();

        for(int satirSayisi=1;satirSayisi<kullanilanSatirSayisi;satirSayisi++) {
            String country = sheet1.getRow(satirSayisi).getCell(0).toString();
            String capital = sheet1.getRow(satirSayisi).getCell(1).toString();
            ulkeBaskentleri.put(country, capital);
        }
        System.out.println(ulkeBaskentleri);


    }
}
