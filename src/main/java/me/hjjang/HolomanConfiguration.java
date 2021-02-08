package me.hjjang;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HolomanProperties.class)
public class HolomanConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Holomen holomen(HolomanProperties properties) {
        Holomen holomen = new Holomen();
        holomen.setHowLong(properties.getHowLong());
        holomen.setName(properties.getName());

        return holomen;
    }
}
