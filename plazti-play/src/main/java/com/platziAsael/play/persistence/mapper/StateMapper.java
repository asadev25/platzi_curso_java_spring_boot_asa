package com.platziAsael.play.persistence.mapper;

import org.mapstruct.Named;

public class StateMapper {

    @Named("stringToBoolean")
    public static boolean stringToBoolean(String estado){
        if (estado == null) return false;

        return switch (estado.toUpperCase()){
            case "D" -> true;
            case "N" -> false;
            default -> false;
        };
    }

    @Named("booleanToString")
    public static String booleanToString(boolean estado){
        return estado ? "D" : "N";
    }
}
