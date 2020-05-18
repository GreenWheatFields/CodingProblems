import org.junit.Test;
import static org.junit.Assert.assertEquals;

//Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode
//algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoedd to the original URL.
//535 could be much better
class CodecLT {

    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        char[] a = longUrl.toCharArray();
        StringBuilder v = new StringBuilder();
        for(int i =0; i < a.length; i++){
            int ascii = (int)a[i];
            String ascii2 = Integer.toString(ascii);
            switch(ascii2.length()){
                case 1:
                    v.append(ascii2).append("@@");
                    break;
                case 2:
                    v.append(ascii2).append("@");
                    break;
                case 3:
                    v.append(ascii2);
                    break;
            }
        }
        return v.toString();
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
        char[] b = shortUrl.toCharArray();
        StringBuilder w = new StringBuilder();
        String ascii = null;
        for(int i = 0; i < b.length; i += 3){
            ascii = Character.toString(b[i]) +
                    Character.toString(b[i + 1]) +
                    Character.toString(b[i + 2]);
            w.append(Character.toString((char)Integer.parseInt(ascii.replace("@", ""))));
        }
        return w.toString();
    }
}

public class ExampleTests {
    @Test
    public void test_1() {
        assertEquals("url.comhttps://leetcode.com/problems/design-tinyurl", CodecLT.decode(CodecLT.encode("https://leetcode.com/problems/design-tinyurl")));
    }
}

