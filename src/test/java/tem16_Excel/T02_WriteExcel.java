package tem16_Excel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class T02_WriteExcel {
    @Test
    public void writeExcelTest() throws IOException {
        // WORKBOOK > WORKSHEET > ROW > CELL > YAZ > KAYDET

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

        //ILK SATIR 3. SUTUNU CREATE ET
        Cell cell3 = row1.createCell(2); // sadece hucreye gelip tiklama yaptik

        // O HUCREYE NUFUS YAZDIR
        cell3.setCellValue("NUFUS");

        //  2. satir 3. sutuna 450000
        sheet1.getRow(1).createCell(2).setCellValue("450000");

        //3. satir 3. sutuna 350000
        sheet1.getRow(2).createCell(2).setCellValue("350000");

        //  KAYDET  : KAYIT ISLEMI FILE OUTPUT STREAM ILE YAPILIR.
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);






    }
}
