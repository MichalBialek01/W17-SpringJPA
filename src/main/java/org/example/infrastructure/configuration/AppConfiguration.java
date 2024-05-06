package org.example.infrastructure.configuration;

import org.example.ComponentScanMarker;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackageClasses = ComponentScanMarker.class)
@Import(JPAConfiguration.class )
public class AppConfiguration {
}
