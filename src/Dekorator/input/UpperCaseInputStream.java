package Dekorator.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStream extends FilterInputStream {

    public UpperCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c=super.read();
        return (c==-1 ? c:Character.toUpperCase((char)c));
    }
}
