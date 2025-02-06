package com.example.sensors.configuration;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.r2dbc.core.DatabaseClient;

@Configuration
@EnableR2dbcRepositories(basePackages = "com.example.sensors.repository.reactor") // specify your reactive repository package
public class R2dbcConfig {

    @Bean(name = "reactiveConnectionFactory")
    public ConnectionFactory connectionFactory() {
        // Configure the R2DBC connection factory for the secondary datasource
        return ConnectionFactories.get(ConnectionFactoryOptions.builder()
                .option(ConnectionFactoryOptions.DRIVER, "postgresql")
                .option(ConnectionFactoryOptions.HOST, "localhost")
                .option(ConnectionFactoryOptions.PORT, 5434)
                .option(ConnectionFactoryOptions.DATABASE, "sensors") // Secondary database
                .option(ConnectionFactoryOptions.USER, "postgres")
                .option(ConnectionFactoryOptions.PASSWORD, "postgres")
                .build());
    }

    @Bean(name = "reactiveDatabaseClient")
    public DatabaseClient databaseClient(ConnectionFactory reactiveConnectionFactory) {
        return DatabaseClient.create(reactiveConnectionFactory);
    }
}