package Send_Email_SpringBoot.Send_Email_SpringBoot.Controller;

import Send_Email_SpringBoot.Send_Email_SpringBoot.Service.MailService;
import Send_Email_SpringBoot.Send_Email_SpringBoot.model.MailStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mail/")
@RestController
public class MailController {


    //53915884
    //flur bwef gmsi szqr
    @Autowired
    private MailService mailService;

    @PostMapping("send/{mail}")
    public String sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure){
    mailService.SendMail(mail,mailStructure);
    return "Successfully  sent the mail";
    }
}
