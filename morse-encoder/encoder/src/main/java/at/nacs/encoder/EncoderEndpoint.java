package at.nacs.encoder;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/encode")
@RequiredArgsConstructor
public class EncoderEndpoint {
    private final Encoder encoder;

    @PostMapping
    String get(@RequestBody String word) {
        return encoder.encode(word);


    }
}
