package com.trendcore.mongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

public class Setup {

    public static void main(String[] args) {
        DB db = new MongoClient().getDB("dbname");

        Jongo jongo = new Jongo(db);
        MongoCollection friends = jongo.getCollection("friends");

    }

}
