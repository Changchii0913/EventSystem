package chang.eventsystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class EventService {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public int getEventCount(int type){
    String sql="SELECT count(*) FROM event where type="+type;
    return jdbcTemplate.queryForObject(sql,Integer.class);
    }

}
