package com.example.userservice.entity.redisCache;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash(value = "TOKEN", timeToLive = 60L)
public class TokenCache {

    @Id
    @Indexed
    private String key;

    private String token;

}
