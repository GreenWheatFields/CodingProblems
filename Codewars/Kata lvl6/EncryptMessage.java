
//Your message is a string containing space separated words.
//You need to encrypt each word in the message using the following rules:
//The first letter needs to be converted to its ASCII code.
//The second letter needs to be switched with the last letter
//Keepin' it simple: There are no special characters in input.
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
class Kata {
    public static String encryptThis(String text) {
        if (text.length() == 0) return "";
        String[] words = text.split(" ");
        StringBuilder password = new StringBuilder();
        for (String word : words) {
            String[] chars = word.split("");
            int ascii = word.charAt(0);
            chars[0] = Integer.toString(ascii);
            if (chars.length > 1) {
                String temp = chars[chars.length - 1];
                chars[chars.length - 1] = chars[1];
                chars[1] = temp;
            }
            password.append(Arrays.toString(chars).replace("[", "").replace("]", "").replace(",", "").replace(" ", "")).append(" ");
        }
        return password.toString().strip();
    }
}

public class ExampleTests {
    @Test
    public void exampleTests() {
        assertEquals("", Kata.encryptThis(""));
        assertEquals("65 119esi 111dl 111lw 108dvei 105n 97n 111ka", Kata.encryptThis("A wise old owl lived in an oak"));
        assertEquals("84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp", Kata.encryptThis("The more he saw the less he spoke"));
        assertEquals("84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare", Kata.encryptThis("The less he spoke the more he heard"));
        assertEquals("87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri", Kata.encryptThis("Why can we not all be like that wise old bird"));
        assertEquals("84kanh 121uo 80roti 102ro 97ll 121ruo 104ple", Kata.encryptThis("Thank you Piotr for all your help"));
    }
}
