package org.apache.kafka.clients.consumer;

import java.util.Map;

/**
 * Created by Vijay on 7/17/16.
 */
public class MaprConsumerConfig extends ConsumerConfig {

    public MaprConsumerConfig(Map<?, ?> props) {
        super(props);
    }
}
