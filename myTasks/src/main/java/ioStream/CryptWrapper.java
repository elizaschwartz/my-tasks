package ioStream;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CryptWrapper extends FilterOutputStream {
    public CryptWrapper(OutputStream out) throws IOException {
        super(out);

        }
@Override
    public void write(int b) throws IOException {
        out.write(b+1);
    }
}

