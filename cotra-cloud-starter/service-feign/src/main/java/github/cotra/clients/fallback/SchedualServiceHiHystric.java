package github.cotra.clients.fallback;
;
import github.cotra.clients.SchedualServiceHello;
import org.springframework.stereotype.Component;

/**
 * Email miles02@163.com
 *
 * @author fangzhipeng
 * create 2018-07-09
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHello {

    @Override
    public String sayHiFromClientOne() {
        return "sorry, you are fail,";
    }
}