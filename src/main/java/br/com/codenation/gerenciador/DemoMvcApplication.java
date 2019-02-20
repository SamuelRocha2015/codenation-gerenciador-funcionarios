package br.com.codenation.gerenciador;

import com.mongodb.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMvcApplication.class, args);
	}

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

}
