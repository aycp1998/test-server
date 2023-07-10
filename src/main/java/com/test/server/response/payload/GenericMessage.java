package com.test.server.response.payload;

import com.test.server.model.Data;

import java.util.List;

public class GenericMessage {

    private String message;
    private List<Data> listData;

    private Data data;

    public GenericMessage() {
    }

    public GenericMessage(String message) {
        this.message = message;
    }

    public GenericMessage(String message, List<Data> listData) {
        this.message = message;
        this.listData = listData;
    }

    public GenericMessage(String message, Data data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Data> getListData() {
        return listData;
    }

    public void setListData(List<Data> listData) {
        this.listData = listData;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}
