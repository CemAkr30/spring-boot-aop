package cakar.springframework.springbootaop.api;


import cakar.springframework.springbootaop.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(MessageAPI.BASE_URL)
@RequiredArgsConstructor
public class MessageAPI {

    public static final String BASE_URL = "api/message";

    private final MessageService messageService;

    @GetMapping("/{message}")
    public ResponseEntity<String> getMessage(@PathVariable("message") String message) {
        return ResponseEntity.ok(messageService.mesajVer(message));
    }
}
