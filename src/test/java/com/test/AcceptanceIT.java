package com.test;

import io.cucumber.junit.platform.engine.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.RunWith;

  /*(
       plugin = {
                "pretty",
                "json:target/AcceptanceTestResults.json"
        },
        features = "src/test/resources/com/test/InitialTest.feature",
        
       //When not explicitly stated in the @CucumberOptions annotation, the glue path is implicitly specified
        // as the package of the class with the @CucumberOptions annotation.
        //https://github.com/cucumber/cucumber-jvm/issues/1127
        //because stepdefs and feature are in different package , we need to specify glue
         glue = {"com.test.stepdefs"}
      //  stepNotifications = true
      
        
)
*/
   
@Cucumber
public class AcceptanceIT {
}
