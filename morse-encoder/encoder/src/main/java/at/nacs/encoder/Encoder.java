package at.nacs.encoder;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class Encoder {
    private final MorseClient morseClient;

    public String encode(String word) {
        String[] letters = word.split("");
        return Stream.of(letters)
                .map(morseClient::encode)
                .collect(Collectors.joining());

    }

}
