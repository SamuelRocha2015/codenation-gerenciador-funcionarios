package br.com.codenation.gerenciador;

import com.mongodb.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMvcApplication.class, args);
	}

	/**
	 * Config Server Cloud-MongoDB
	 */
	@Bean
	public MongoClient mongoClient() {
		List<ServerAddress> saList = new ArrayList<>();
		saList.add(new ServerAddress("cluster0-shard-00-00-uvlrm.mongodb.net", 27017));
		saList.add(new ServerAddress("cluster0-shard-00-01-uvlrm.mongodb.net", 27017));
		saList.add(new ServerAddress("cluster0-shard-00-02-uvlrm.mongodb.net", 27017));

		char[] pwd =  "NKE2O69CDnx8iEfH".toCharArray();
		MongoCredential credential = MongoCredential.createCredential("codenation-student", "admin", pwd);

		//set sslEnabled to true here
		MongoClientOptions options = MongoClientOptions.builder()
				.readPreference(ReadPreference.primaryPreferred())
				.retryWrites(true)
				.requiredReplicaSetName("Cluster0-shard-0")
				.maxConnectionIdleTime(6000)
				.sslEnabled(true)
				.build();

		MongoClient mongoClient = new MongoClient(saList, credential, options);
		return mongoClient;
	}


	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory jedisConFactory
				= new JedisConnectionFactory();
		jedisConFactory.setHostName("redis-11070.c8.us-east-1-2.ec2.cloud.redislabs.com");
		jedisConFactory.setPort(11070);
		jedisConFactory.setPassword("7PvcLiv91j0feGfdHW49ZXsW5cuzYniE");
		return jedisConFactory;
	}

	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		RedisTemplate<String, Object> template = new RedisTemplate<>();
		template.setConnectionFactory(jedisConnectionFactory());
		return template;
	}

}
