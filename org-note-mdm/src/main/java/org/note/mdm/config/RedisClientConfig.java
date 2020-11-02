package org.note.mdm.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.io.IOException;
import java.net.URL;

@Configuration
public class RedisClientConfig {


    @Bean
    public RedissonClient redisClient() throws IOException {
        URL resource = RedisClientConfig.class.getClassLoader().getResource("redisson-config.yml");
        Config config = Config.fromYAML(resource);
        return Redisson.create(config);
    }

//    @Bean
//    public RedissonClient redisClient() {
//        Config config = new Config();
//        config.useClusterServers()
//                .setScanInterval(2000) // 集群状态扫描间隔时间，单位是毫秒，默认是1000
//                //host:port格式，也可以用"rediss://"来启用SSL连接
//                .addNodeAddress("redis://127.0.0.1:7000", "redis://127.0.0.1:7001")
//                .addNodeAddress("redis://127.0.0.1:7002");
//        config.setCodec(null);
//        config.setAddressResolverGroupFactory(null);
//        config.setCleanUpKeysAmount(100);
//        config.setEventLoopGroup(null);
//        config.setExecutor(null);
//        config.setKeepPubSubOrder(false); //保持订阅发布顺序 默认true ，通过该参数来修改是否按订阅发布消息的接收顺序出来消息，如果选否将对消息实行并行处理，该参数只适用于订阅发布消息的情况。
//        config.setLockWatchdogTimeout(15L);
//        config.setMaxCleanUpDelay(11);
//        config.setMinCleanUpDelay(11);
//        config.setNettyHook(null);
//        config.setNettyThreads(11);
//        config.setReferenceEnabled(false);
//        config.setUseThreadClassLoader(false);
//        config.setTransportMode(null);
//        config.setUseScriptCache(false);
//        return  Redisson.create(config);
//    }





}
