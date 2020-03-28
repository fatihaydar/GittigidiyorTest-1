package com.gittigidiyor.page;

import com.gittigidiyor.base.BasePage;
import org.openqa.selenium.WebDriver;
import static com.gittigidiyor.constans.ConstantLoginPage.*;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage writeInput(String urun){
        sendKeys(INPUT, urun);
        return this;
    }
    public SearchPage ClickSearch() {
        clickElement(ARAMA_YAP);
        return this;
    }
    public SearchPage chooseProduct(){
        clickElement(URUN_SEC);
        return this;
    }
    public SearchPage addBasket(){
        clickElement(SEPETE_EKLE);
        return this;
    }

    public SearchPage goBasket(){
        clickElement(SEPETE_GIT);
        return this;
    }

    public SearchPage compare(String basket, String produckt){
        try {
        }catch (Exception e){
            System.out.println("Ürün isimleri farklı!");
        }
        return this;
    }

}
