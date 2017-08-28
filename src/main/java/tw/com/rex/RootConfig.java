package tw.com.rex;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import tw.com.rex.controller.WebConfig;

/**
 * Root Spring configuration
 */
@Configuration
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = WebConfig.class),
                                 @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
public class RootConfig {

    public RootConfig() {
        super();
        System.out.println("RootConfig()");
    }
}
