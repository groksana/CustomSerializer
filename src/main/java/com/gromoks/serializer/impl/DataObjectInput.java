package com.gromoks.serializer.impl;

import java.io.DataInput;
import java.io.IOException;
import java.io.ObjectInput;

public class DataObjectInput implements DataInput, ObjectInput {

    private int position = 0;
    private byte[] byteArray;
    private int count = 0;

    public DataObjectInput() {
        this.byteArray = new byte[8];
    }

    public DataObjectInput(byte[] data) {
        byteArray = data;
        count = data.length;
    }

    @Override
    public void readFully(byte[] b) throws IOException {

    }

    @Override
    public void readFully(byte[] b, int off, int len) throws IOException {

    }

    @Override
    public int skipBytes(int n) throws IOException {
        return 0;
    }

    @Override
    public boolean readBoolean() throws IOException {
        return false;
    }

    @Override
    public byte readByte() throws IOException {
        return byteArray[position++];
    }

    @Override
    public int readUnsignedByte() throws IOException {
        return byteArray[position++] & 0xff;
    }

    @Override
    public short readShort() throws IOException {
        return (short)
                (((short) (byteArray[position++] & 0xff) << 8) |
                        ((short) (byteArray[position++] & 0xff) << 0));
    }

    @Override
    public int readUnsignedShort() throws IOException {
        return 0;
    }

    @Override
    public char readChar() throws IOException {
        return 0;
    }

    @Override
    public int readInt() throws IOException {
        return
                (((byteArray[position++] & 0xff) << 24) |
                        ((byteArray[position++] & 0xff) << 16) |
                        ((byteArray[position++] & 0xff) << 8) |
                        ((byteArray[position++] & 0xff) << 0));
    }

    @Override
    public long readLong() throws IOException {
        return 0;
    }

    @Override
    public float readFloat() throws IOException {
        return 0;
    }

    @Override
    public double readDouble() throws IOException {
        return 0;
    }

    @Override
    public String readLine() throws IOException {
        return null;
    }

    @Override
    public String readUTF() throws IOException {
        return null;
    }

    @Override
    public Object readObject() throws ClassNotFoundException, IOException {
        return null;
    }

    @Override
    public int read() throws IOException {
        return 0;
    }

    @Override
    public int read(byte[] b) throws IOException {
        return 0;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public long skip(long n) throws IOException {
        return 0;
    }

    @Override
    public int available() throws IOException {
        return count - position;
    }

    @Override
    public void close() throws IOException {

    }
}
