package cakar.springframework.springbootaop.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageService {
    public String mesajVer(String param) {
        log.info("Mesaj veriliyor: " + param);
        return param;
    }
}
