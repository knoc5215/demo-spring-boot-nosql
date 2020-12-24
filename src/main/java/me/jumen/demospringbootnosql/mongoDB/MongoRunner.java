package me.jumen.demospringbootnosql.mongoDB;

import me.jumen.demospringbootnosql.mongoDB.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoRunner implements ApplicationRunner {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setEmail("knoc5215@naver.com");
        account.setUsername("jumen");

        mongoTemplate.save(account);

    }
}
