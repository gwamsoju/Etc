package com.example.etc.Controller;

import com.example.etc.Service.MailService;
import com.example.etc.VO.MailVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MailController {

    private final MailService mailService;

    @GetMapping("/")
    public String MailPage(){
        return "certification";
    }

    @PostMapping("/mail")
    public void MailSend(MailVo mailVo){
        mailService.CreateMail(mailVo);
    }

}
