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

    @Test
    public void serializeMaxNegativeLongTest() throws IOException, ClassNotFoundException {
        Long longNumber = Long.MIN_VALUE;
        byte[] longBytes = byteSerializer.serialize(longNumber);
        Long deserializedLongNumber = (Long) byteSerializer.deserialize(longBytes);
        assertEquals(longNumber, deserializedLongNumber);
    }

    @Test
    public void serializeMaxPositiveLongTest() throws IOException, ClassNotFoundException {
        Long longNumber = Long.MAX_VALUE;
        byte[] longBytes = byteSerializer.serialize(longNumber);
        Long deserializedLongNumber = (Long) byteSerializer.deserialize(longBytes);
        assertEquals(longNumber, deserializedLongNumber);
    }

    @Test
    public void serializeZeroLongTest() throws IOException, ClassNotFoundException {
        Long longNumber = 0L;
        byte[] longBytes = byteSerializer.serialize(longNumber);
        Long deserializedLongNumber = (Long) byteSerializer.deserialize(longBytes);
        assertEquals(longNumber, deserializedLongNumber);
    }

    @Test
    public void serializeMaxNegativeFloatTest() throws IOException, ClassNotFoundException {
        Float floatNumber = Float.MIN_VALUE;
        byte[] floatBytes = byteSerializer.serialize(floatNumber);
        Float deserializedFloatNumber = (Float) byteSerializer.deserialize(floatBytes);
        assertEquals(floatNumber, deserializedFloatNumber);
    }

    @Test
    public void serializeMaxPositiveFloatTest() throws IOException, ClassNotFoundException {
        Float floatNumber = Float.MAX_VALUE;
        byte[] floatBytes = byteSerializer.serialize(floatNumber);
        Float deserializedFloatNumber = (Float) byteSerializer.deserialize(floatBytes);
        assertEquals(floatNumber, deserializedFloatNumber);
    }

    @Test
    public void serializeZeroFloatTest() throws IOException, ClassNotFoundException {
        Float floatNumber = 0.0F;
        byte[] floatBytes = byteSerializer.serialize(floatNumber);
        Float deserializedFloatNumber = (Float) byteSerializer.deserialize(floatBytes);
        assertEquals(floatNumber, deserializedFloatNumber);
    }

    @Test
    public void serializeMaxNegativeDoubleTest() throws IOException, ClassNotFoundException {
        Double doubleNumber = Double.MIN_VALUE;
        byte[] doubleBytes = byteSerializer.serialize(doubleNumber);
        Double deserializedDoubleNumber = (Double) byteSerializer.deserialize(doubleBytes);
        assertEquals(doubleNumber, deserializedDoubleNumber);
    }

    @Test
    public void serializeMaxPositiveDoubleTest() throws IOException, ClassNotFoundException {
        Double doubleNumber = Double.MAX_VALUE;
        byte[] doubleBytes = byteSerializer.serialize(doubleNumber);
        Double deserializedDoubleNumber = (Double) byteSerializer.deserialize(doubleBytes);
        assertEquals(doubleNumber, deserializedDoubleNumber);
    }

    @Test
    public void serializeZeroDoubleTest() throws IOException, ClassNotFoundException {
        Double doubleNumber = 0.0;
        byte[] doubleBytes = byteSerializer.serialize(doubleNumber);
        Double deserializedDoubleNumber = (Double) byteSerializer.deserialize(doubleBytes);
        assertEquals(doubleNumber, deserializedDoubleNumber);
    }

    @Test
    public void serializeMinCharTest() throws IOException, ClassNotFoundException {
        Character character = Character.MIN_VALUE;
        byte[] charBytes = byteSerializer.serialize(character);
        Character deserializedChar = (Character) byteSerializer.deserialize(charBytes);
        assertEquals(character, deserializedChar);
    }

    @Test
    public void serializeMaxCharTest() throws IOException, ClassNotFoundException {
        Character character = Character.MAX_VALUE;
        byte[] charBytes = byteSerializer.serialize(character);
        Character deserializedChar = (Character) byteSerializer.deserialize(charBytes);
        assertEquals(character, deserializedChar);
    }

    @Test
    public void serializeStringTest() throws IOException, ClassNotFoundException {
        String string = "Hello World";
        byte[] stringBytes = byteSerializer.serialize(string);
        String deserializedString = (String) byteSerializer.deserialize(stringBytes);
        assertEquals(string, deserializedString);
    }
}
