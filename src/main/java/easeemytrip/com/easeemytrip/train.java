package easeemytrip.com.easeemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class train {
    @GetMapping("/train")
    public String getData() {return  "Please book your vande bharat train for shimla at 60  % discount" ; }
}
