package jenkinsExample.JenkinsCRUD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsREST {
    @GetMapping("/")
    public String welcome(){
        return "Jenkins REST";
    }
}
