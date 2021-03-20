package com.intemanage;

import com.newbetter.sdk.commons.CodedMessage;
import com.newbetter.sdk.invoking.Response;
import com.newbetter.sdk.invoking.Responses;

public class GetResponse extends Response<String> {

    public static void main(String[] args) {
        GetResponse response = Responses.of(GetResponse.class, CodedMessage.of(1, "nihao"));
        System.out.println(response);
    }
}
