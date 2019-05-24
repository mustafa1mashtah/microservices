package at.nacs.morse;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/morse")
@RequiredArgsConstructor
public class MorseEndpoint {
    private final MorseService morseService;

    @PostMapping
    String get(@RequestBody String letter){
        return morseService.encode(letter);
    }

}
