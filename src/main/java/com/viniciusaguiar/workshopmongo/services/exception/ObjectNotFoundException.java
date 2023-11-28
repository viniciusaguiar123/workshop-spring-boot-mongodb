package com.viniciusaguiar.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException{
    private static long serialVersionUID = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }

}
