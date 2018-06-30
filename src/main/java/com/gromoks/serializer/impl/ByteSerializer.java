package com.gromoks.serializer.impl;

import com.gromoks.serializer.Serializer;
import com.gromoks.serializer.constant.SerializerHeader;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import static com.gromoks.serializer.constant.SerializerHeader.*;

public class ByteSerializer implements Serializer {

    @Override
    public void serialize(DataOutput dataOutput, Object object) throws IOException {
        final Class clazz = object != null ? object.getClass() : null;

        if (object == null) {
            dataOutput.write(NULL);
            return;
        } else if (clazz == Boolean.class) {
            if (((Boolean) object).booleanValue()) {
                dataOutput.write(BOOLEAN_TRUE);
            } else {
                dataOutput.write(BOOLEAN_FALSE);
            }
            return;
        } else if (clazz == Byte.class) {
            byte value = (Byte) object;
            dataOutput.write(BYTE);
            dataOutput.writeByte(value);
            return;
        } else if (clazz == Short.class) {
            short value = (Short) object;
            dataOutput.write(SHORT);
            dataOutput.writeShort(value);
            return;
        } else if (clazz == Integer.class) {
            int value = (Integer) object;
            dataOutput.write(INTEGER);
            dataOutput.writeInt(value);
            return;
        }
    }

    @Override
    public Object deserialize(DataInput in) throws IOException {
        Object result = null;

        int head = in.readUnsignedByte();
        switch (head) {
            case NULL:
                break;
            case BOOLEAN_TRUE:
                result = Boolean.TRUE;
                break;
            case BOOLEAN_FALSE:
                result = Boolean.FALSE;
                break;
            case BYTE:
                result = in.readByte();
                break;
            case SHORT:
                result = in.readShort();
                break;
            case INTEGER:
                result = in.readInt();
                break;
        }
        return result;
    }

    public byte[] serialize(Object object) throws IOException {
        DataObjectOutput dataOutput = new DataObjectOutput();
        serialize(dataOutput, object);

        return dataOutput.toByteArray();
    }

    public Object deserialize(byte[] buf) throws ClassNotFoundException,
            IOException {
        DataObjectInput dataInput = new DataObjectInput(buf);
        Object object = deserialize(dataInput);
        if (dataInput.available() != 0)
            throw new InternalError("bytes left: " + dataInput.available());

        return object;
    }
}
