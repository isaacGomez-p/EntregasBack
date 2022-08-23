package com;



        //import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cache.annotation.EnableCaching;
        import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableCaching
//@EnableEncryptableProperties
/*@PropertySources({
        @PropertySource(value = "file:/home/ec2-user/SAINBack/SAIN-CONFIG/application.properties",
                ignoreResourceNotFound = true)
})*/
public class AppTrackingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppTrackingApplication.class, args);
    }

}
