package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)  //runner in cucumber ile calismasini saglar bu uyum
@CucumberOptions(

        plugin={"html:target\\Pcucumber-reports.html",
                "json:target/json-reports/Pcucumber.json",
                "junit:target/xml-report/Pcucumber.xml"},
        features ="src/test/resources/features",  //bilgisayarsaki features in yolunu koy
        glue="stepdefinitions",  //yapistirici demek glue,features ile nereyi yapistirayim(calistiracak birlikte),stepdefinitions kismini path aliriz
        tags ="@TC_26",          //buraya features teki feature icine senario nun ustune yazilian yazilir
        dryRun = false
)


public class Runner {

}
