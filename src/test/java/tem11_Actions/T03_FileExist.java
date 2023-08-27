package tem11_Actions;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class T03_FileExist {


    @Test
    public void isExistTest() {

        String userDIR = System.getProperty("user.dir");
        System.out.println(userDIR);  // \Users\HP\IdeaProjects\comTemMaven.Junit

        String userHome = System.getProperty("user.home");
        System.out.println(userHome); // \Users\HP

        //logo.jpeg indirip masa üstüne kaydedin
        //logo masa üstünde : /Users/HP/Desktop

       String dosyaYolu = userHome + "/Desktop/logo.jpeg";
        System.out.println(dosyaYolu);

        boolean isExist = Files.exists(Paths.get(dosyaYolu));//   dosya var ise true, yok ise false return eder.
        Assert.assertTrue(isExist);
/*
        1. fail  -> PATH YANLIS : dosya masa ustunde degil, dosya adi yanlis, ya da arada onedrive gibi ex dosyalar var
 */
    }
}
