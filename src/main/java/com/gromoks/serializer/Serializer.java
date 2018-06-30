package com.gromoks.serializer;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Interface is used to provide a serialization for objects
 */
public interface Serializer {
    void serialize(DataOutput output, Object obj) throws IOException;

    Object deserialize(DataInput in) throws IOException;
}
