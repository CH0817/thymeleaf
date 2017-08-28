package tw.com.rex.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tw.com.rex.service.ScanService;

/**
 * Root Spring configuration
 */
@Configuration
@ComponentScan(basePackageClasses = {ScanService.class})
public class RootConfig {}
