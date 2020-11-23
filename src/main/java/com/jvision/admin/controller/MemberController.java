package com.jvision.admin.controller;

import com.jvision.admin.dto.MemberDto;
import com.jvision.admin.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.ConstructorResult;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;
    @GetMapping("/")
    public  String index(){return "/index";}
    @GetMapping("/user/signup")
    public String dispSignup(){return "/signup";}
    @PostMapping("/user/signup")
    public String execSignup(MemberDto memberDto){
        memberService.joinUser(memberDto);
        return "redirect:/user/login";
    }
    @GetMapping("/user/login")
    public  String dispLogin(){return  "/login";}
    @GetMapping("/user/login/result")
    public  String dispLoginResult(){return  "/loginSuccess";}
    @GetMapping("/user/logout/result")
    public  String dispLogout(){return  "/logout";}
    @GetMapping("/user/denied")
    public  String dispDenied(){return  "/denied";}
    @GetMapping("/user/info")
    public  String dispMyInfo(){return  "/myinfo";}
    @GetMapping("/admin")
    public  String dispAdmin(){return  "/admin";}
}
