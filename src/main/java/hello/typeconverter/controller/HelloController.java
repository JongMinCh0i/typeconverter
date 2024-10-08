package hello.typeconverter.controller;

import hello.typeconverter.type.IpPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request) {
        String data = request.getParameter("data"); // 문자 타입 조회
        Integer intValue = Integer.valueOf(data);          // 숫자 타입으로 변경
        System.out.println("intValue = " + intValue);
        return "ok";
    }

    // RequestParam 을 사용하면 문자 10을 Integer 타입의 숫자 10으로 편리하게 받을 수 있다.
    @GetMapping("/hello-v2")
    public String hellov2(@RequestParam Integer data) {
        System.out.println("data = " + data);
        return "ok";
    }

    // ModelAttribute , PathVariable도 정상 작동 가능
    @GetMapping("ip-port")
    public String ipPort(@RequestParam IpPort ipPort) {
        System.out.println("ipPort Ip = " + ipPort.getIp());
        System.out.println("ipPort Port = " + ipPort.getPort());
        return "ok";
    }
}
