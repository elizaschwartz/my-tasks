package ioStream;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DecryptWrapper extends FilterOutputStream {

    public DecryptWrapper(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        out.write(b-1);
    }


}
