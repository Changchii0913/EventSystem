package chang.eventsystem.Controller;

import chang.eventsystem.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EventController {
    @Autowired
    EventService eventService;
    @GetMapping("/event/count")
    public String eventCount(@RequestParam("cate") int type, Model m){
        //轉換為type
        int count = eventService.getEventCount(type);
        m.addAttribute("ant",count);
        return  "event_count";
    }
    @PostMapping("event/new")
    public String eventNew(@ResponseBody EventParam, Model m){
        System.out.println("接收表單 type="+eventParam.getType());
        System.out.println("接收表單 subject="+eventParam.getSubject());
    }
}
