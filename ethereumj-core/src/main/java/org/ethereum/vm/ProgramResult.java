package org.ethereum.vm;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/**
 * www.ethereumJ.com
 * @author: Roman Mandeleil
 * Created on: 07/06/2014 17:45
 */

public class ProgramResult {

    private int gasUsed = 0;
    private ByteBuffer  hReturn = null;
    private RuntimeException exception;
    private Map<DataWord, DataWord> storage;


    public void spendGas(int gas){
        gasUsed += gas;
    }

    public void setHReturn(byte[] hReturn){

        this.hReturn = ByteBuffer.allocate(hReturn.length);
        this.hReturn.put(hReturn);
    }

    public ByteBuffer gethReturn() {
        return hReturn;
    }

    public RuntimeException getException() {
        return exception;
    }

    public int getGasUsed() {
        return gasUsed;
    }

    public void setException(RuntimeException exception) {
        this.exception = exception;
    }

    public Map<DataWord, DataWord> getStorage() {
        return storage;
    }

    public void setStorage(Map<DataWord, DataWord> storage) {
        this.storage = storage;
    }
}
