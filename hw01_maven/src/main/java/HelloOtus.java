import com.google.common.base.Charsets;
import com.google.common.io.BaseEncoding;

public class HelloOtus {
    public static void main(String[] args) {
        String test_word = "Hello, Otus!";
        String word_base64;
        System.out.println(test_word);
        word_base64 = BaseEncoding.base32().encode(test_word.getBytes(Charsets.US_ASCII));
        System.out.println(word_base64);
        }
}

