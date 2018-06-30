package com.gromoks.serializer.impl;

import java.io.IOException;
import java.io.ObjectOutput;
import java.util.Arrays;

public class DataObjectOutput implements ObjectOutput {

    private int position = 0;
    private byte[] byteArray;
    private int count = 0;

    public DataObjectOutput() {
        this.byteArray = new byte[8];
    }

    @Override
    public void writeObject(Object obj) throws IOException {

    }

    @Override
    public void write(int b) throws IOException {
        byteArray[position++] = (byte) b;
    }

    @Override
    public void write(byte[] b) throws IOException {

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {

    }

    @Override
    public void writeBoolean(boolean v) throws IOException {

    }

    @Override
    public void writeByte(int v) throws IOException {
        ensureCapacity(1);
        byteArray[position++] = (byte) v;
    }

    @Override
    public void writeShort(int v) throws IOException {
        ensureCapacity(2);
        byteArray[position++] = (byte) (0xff & (v >> 8));
        byteArray[position++] = (byte) (0xff & (v >> 0));
    }

    @Override
    public void writeChar(int v) throws IOException {

    }

    @Override
    public void writeInt(int v) throws IOException {
        ensureCapacity(4);
        byteArray[position++] = (byte) (0xff & (v >> 24));
        byteArray[position++] = (byte) (0xff & (v >> 16));
        byteArray[position++] = (byte) (0xff & (v >> 8));
        byteArray[position++] = (byte) (0xff & (v >> 0));
    }

    @Override
    public void writeLong(long v) throws IOException {

    }

    @Override
    public void writeFloat(float v) throws IOException {

    }

    @Override
    public void writeDouble(double v) throws IOException {

    }

    @Override
    public void writeBytes(String s) throws IOException {

    }

    @Override
    public void writeChars(String s) throws IOException {

    }

    @Override
    public void writeUTF(String s) throws IOException {

    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }

    public byte[] toByteArray() {
            byte[] d = new byte[position];
            System.arraycopy(byteArray, 0, d, 0, position);
            return d;
    }

    private void ensureCapacity(int n) {
        if (position + n >= byteArray.length) {
            int newSize = Math.max(position + n, byteArray.length * 2);
            byteArray = Arrays.copyOf(byteArray, newSize);
        }
    }
}
