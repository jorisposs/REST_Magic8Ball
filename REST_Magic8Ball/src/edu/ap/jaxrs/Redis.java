package edu.ap.jaxrs;

import redis.clients.jedis.Jedis;

public class Redis {

  public static void main(String[] args) throws Exception {
    Jedis jedis = new Jedis("hostname.redislabs.com", 6379);
    jedis.auth("password")
    System.out.println("Connected to Redis");
  }
}


	