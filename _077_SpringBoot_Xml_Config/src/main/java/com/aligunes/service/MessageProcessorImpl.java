package com.aligunes.service;

public class MessageProcessorImpl implements MessageProcessor {
    private SelectService selectService; //interface i getirip sınıfın içine enjeckde edildi.

    public void setSelectService(SelectService selectService) {
        this.selectService = selectService;
    }

    @Override
    public void processingMsg(String message) {
    selectService.sendMsg(message);
    }

}
