package hello.typeconverter.type;


import lombok.EqualsAndHashCode;
import lombok.Getter;


//"127.0.0.1:8080" 이들어오면 숫자로 변경
@Getter
@EqualsAndHashCode
public class IpPort {

    private String ip;
    private int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
