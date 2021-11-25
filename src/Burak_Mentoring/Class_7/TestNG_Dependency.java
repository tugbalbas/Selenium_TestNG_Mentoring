package Burak_Mentoring.Class_7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Dependency {

    @Test
    public void log_in(){
        System.out.println("Log In oluyorum");
    }

    @Test (dependsOnMethods = "log_in")
    public void kullanici_bilgileri(){
        System.out.println("Kullanıcı bilgilerine erişiyorum");
    }

    @Test (dependsOnMethods = "kullanici_bilgileri")
    public void bilgi_değiştirme(){
        System.out.println("Kullanıcı bilgilerini değiştiriyorum"); // yukardan aşağıya okuduğu için bunu da yazdırdı
        Assert.fail();
    }

    @Test (dependsOnMethods = "bilgi_değiştirme") // Test ignored.
    public void degisiklikleri_kaydetme(){
        System.out.println("Kullanıcı değişikliklerini kaydediyorum");
    }



}
