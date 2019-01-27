package AppHealth;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyCustomHealthIndication implements HealthIndicator {
    @Override
    public Health health() {
       // return Health.down().build();
      //  return Health.down().withDetail("someKey","someValue").build();
       // return Health.up();
        return Health.unknown().build();
    }
}
