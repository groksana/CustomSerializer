package com.gromoks.serializer;

import com.gromoks.serializer.impl.ByteSerializer;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ByteSerializerTest {
    private ByteSerializer byteSerializer = new ByteSerializer();

    @Test
    public void serializeMaxNegativeIntegerTest() throws IOException, ClassNotFoundException {
        Integer intNumber = Integer.MIN_VALUE;
        byte[] integerBytes = byteSerializer.serialize(intNumber);
        Integer deserializedIntNumber = (Integer) byteSerializer.deserialize(integerBytes);
        assertEquals(intNumber, deserializedIntNumber);
    }

    @Test
    public void serializeMaxPositiveIntegerTest() throws IOException, ClassNotFoundException {
        Integer intNumber = Integer.MAX_VALUE;
        byte[] integerBytes = byteSerializer.serialize(intNumber);
        Integer deserializedIntNumber = (Integer) byteSerializer.deserialize(integerBytes);
        assertEquals(intNumber, deserializedIntNumber);
    }

    @Test
    public void serializeZeroIntegerTest() throws IOException, ClassNotFoundException {
        Integer intNumber = 0;
        byte[] integerBytes = byteSerializer.serialize(intNumber);
        Integer deserializedIntNumber = (Integer) byteSerializer.deserialize(integerBytes);
        assertEquals(intNumber, deserializedIntNumber);
    }

    @Test
    public void serializeTrueBooleanTest() throws IOException, ClassNotFoundException {
        Boolean trueValue = true;
        byte[] booleanBytes = byteSerializer.serialize(trueValue);
        Boolean deserializedTrueValue = (Boolean) byteSerializer.deserialize(booleanBytes);
        assertEquals(trueValue, deserializedTrueValue);
    }

    @Test
    public void serializeFalseBooleanTest() throws IOException, ClassNotFoundException {
        Boolean falseValue = false;
        byte[] booleanBytes = byteSerializer.serialize(falseValue);
        Boolean deserializedFalseValue = (Boolean) byteSerializer.deserialize(booleanBytes);
        assertEquals(falseValue, deserializedFalseValue);
    }

    @Test
    public void serializeMaxNegativeByteTest() throws IOException, ClassNotFoundException {
        Byte byteNumber = Byte.MIN_VALUE;
        byte[] bytes = byteSerializer.serialize(byteNumber);
        Byte deserializedByteNumber = (Byte) byteSerializer.deserialize(bytes);
        assertEquals(byteNumber, deserializedByteNumber);
    }

    @Test
    public void serializeMaxPositiveByteTest() throws IOException, ClassNotFoundException {
        Byte byteNumber = Byte.MAX_VALUE;
        byte[] bytes = byteSerializer.serialize(byteNumber);
        Byte deserializedByteNumber = (Byte) byteSerializer.deserialize(bytes);
        assertEquals(byteNumber, deserializedByteNumber);
    }

    @Test
    public void serializeZeroByteTest() throws IOException, ClassNotFoundException {
        Byte byteNumber = 0;
        byte[] bytes = byteSerializer.serialize(byteNumber);
        Byte deserializedByteNumber = (Byte) byteSerializer.deserialize(bytes);
        assertEquals(byteNumber, deserializedByteNumber);
    }

    @Test
    public void serializeMaxNegativeShortTest() throws IOException, ClassNotFoundException {
        Short shortNumber = Short.MIN_VALUE;
        byte[] shortBytes = byteSerializer.serialize(shortNumber);
        Short deserializedShortNumber = (Short) byteSerializer.deserialize(shortBytes);
        assertEquals(shortNumber, deserializedShortNumber);
    }

    @Test
    public void serializeMaxPositiveShortTest() throws IOException, ClassNotFoundException {
        Short shortNumber = Short.MAX_VALUE;
        byte[] shortBytes = byteSerializer.serialize(shortNumber);
        Short deserializedShortNumber = (Short) byteSerializer.deserialize(shortBytes);
        assertEquals(shortNumber, deserializedShortNumber);
    }

    @Test
    public void serializeZeroShortTest() throws IOException, ClassNotFoundException {
        Short shortNumber = 0;
        byte[] shortBytes = byteSerializer.serialize(shortNumber);
        Short deserializedShortNumber = (Short) byteSerializer.deserialize(shortBytes);
        assertEquals(shortNumber, deserializedShortNumber);
    }

}
