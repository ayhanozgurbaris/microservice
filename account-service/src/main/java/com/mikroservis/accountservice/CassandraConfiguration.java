package com.mikroservis.accountservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
@Configuration
@EnableCassandraRepositories
public class CassandraConfiguration extends AbstractCassandraConfiguration {

    @Value("${spclod.cassanra.contact.point}")
    private String keyspaceName;

    @Value("${spclod.cassanra.point}")
    private int port;

    @Value("${spclod.cassanra.keyspace.name}")
    private int keySpaceName;

    @Override
    protected String getKeyspaceName() {
        return keyspaceName;
        //bad imp return "spring-cloud";
    }

    @Override
    protected int getPort(){
        return this.port;
    }

    @Override
    protected String getContactPoints(){
        return this.keyspaceName;
    }
}
