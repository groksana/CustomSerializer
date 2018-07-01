package com.gromoks.serializer.impl;

import com.gromoks.serializer.Serializer;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import static com.gromoks.serializer.constant.SerializerHeader.*;

public class ByteSerializer implements Serializer {

    @Override
    public void serialize(DataOutput output, Object object) throws IOException {
        final Class clazz = object != null ? object.getClass() : null;

        if (object == null) {
            output.write(NULL);
            return;
        } else if (clazz == Boolean.class) {
            if (((Boolean) object).booleanValue()) {
                output.write(BOOLEAN_TRUE);
            } else {
                output.write(BOOLEAN_FALSE);
            }
            return;
        } else if (clazz == Byte.class) {
            byte value = (Byte) object;
            output.write(BYTE);
            output.writeByte(value);
            return;
        } else if (clazz == Short.class) {
            short value = (Short) object;
            output.write(SHORT);
            output.writeShort(value);
            return;
        } else if (clazz == Integer.class) {
            int value = (Integer) object;
            output.write(INTEGER);
            output.writeInt(value);
            return;
        } else if (clazz == Long.class) {
            long value = (Long) object;
            output.write(LONG);
            output.writeLong(value);
            return;
        } else if (clazz == Float.class) {
            float value = (Float) object;
            output.write(FLOAT);
            output.writeFloat(value);
            return;
        } else if (clazz == Double.class) {
            double value = (Double) object;
            output.write(DOUBLE);
            output.writeDouble(value);
            return;
        } else if (clazz == Character.class) {
            char value = (Character) object;
            output.write(CHAR);
            output.writeChar(value);
        } else if (clazz == String.class) {
            String value = (String) object;
            output.write(STRING);
            output.writeChars(value);
        }
    }

    @Override
    public Object deserialize(DataInput input) throws IOException {
        Object result = null;

        int head = input.readUnsignedByte();
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
                result = input.readByte();
                break;
            case SHORT:
                result = input.readShort();
                break;
            case INTEGER:
                result = input.readInt();
                break;
            case LONG:
                result = input.readLong();
                break;
            case FLOAT:
                result = input.readFloat();
                break;
            case DOUBLE:
                result = input.readDouble();
                break;
            case CHAR:
                result = input.readChar();
                break;
            case STRING:
                result = input.readLine();
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
