package cn.caijiajia.ratelimiter.server.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wukaiqiang
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RateLimiterVo {
    private Long id;
    private String name;
    private String apps;
    private Integer maxPermits;
    private Integer rate;
    private Integer currPermits;
    private String lastPermitTimestamp;

}
