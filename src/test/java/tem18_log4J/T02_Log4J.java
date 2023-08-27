package tem18_log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import utilities.TestBase;

public class T02_Log4J  {


     //  3. Logger object olustur:
     //  private static Logger logger = LogManager.getLogger(Demo1.class.getName());
     //  4. Logger fonksiyonuyla istenilen fonksiyonu kullan
     //  logger.debug("Debug logger");
     //  logger.info("Info logger");
     //  logger.error("Error logger");
     //  logger.fatal("Fatal logger");
     //  5. Consoldeki loglari kontrol edelim. Default olarak error or fatal gorunmus olacaktır
     //  Log4j ayarlari

        //  3. Logger object olustur:
    //    !!!!!!Logger objesi sinif seviyesinde olusturmak gerekiyor
      private static Logger logger = LogManager.getLogger(T02_Log4J.class.getName());
            @Test
           public void test01() {
        //  private static Logger logger = LogManager.getLogger(Demo1.class.getName());
        //  4. Logger fonksiyonuyla istenilen fonksiyonu kullan
                logger.fatal("Fatal log!");  // konsolda  11:43:41.780 [main] FATAL tem18_log4J.T02_Log4J - Fatal log!
                                             //           11:43:41.784 [main] ERROR tem18_log4J.T02_Log4J - Error log!
                logger.error("Error log!");
                logger.warn("Warn log!");
                logger.debug("Debug log!"); // bu diğer dördü konsolda gelmedi
                                            //proje adi altinda resources dosyasi icindede log4j2.xml klasoru actik.
                                            //icine ozel ayarlar yukledikten sonra diger dört log da calisti
                logger.info("Info log!");

        //  5. Consoldeki loglari kontrol edelim. Default olarak error or fatal gorunmus olacaktır
        //  Log4j ayarlari


    }
}
