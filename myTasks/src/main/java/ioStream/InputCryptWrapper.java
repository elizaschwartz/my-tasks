package ioStream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputCryptWrapper extends FilterInputStream {

    protected InputCryptWrapper(InputStream in) {
        super(in);
    }
 @Override
    public int read() throws IOException {
        int original = in.read();
        if (original == -1){
            return -1;
        }
        return original +1;
    }

}
