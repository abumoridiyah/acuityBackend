package com.comsoftacuity.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;

/**
 * Created by peter on 9/18/15.
 */
@Provider
public class JacksonProvider implements ContextResolver<ObjectMapper> {


    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    static {
        OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        OBJECT_MAPPER.disable(MapperFeature.USE_GETTERS_AS_SETTERS);
        OBJECT_MAPPER.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        OBJECT_MAPPER.setDateFormat(dateFormat);
        OBJECT_MAPPER.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public JacksonProvider() {

    }


    @Override
    public ObjectMapper getContext(Class<?> aClass) {
        StringWriter stringWriter = new StringWriter();
        try {
            if(aClass.isAnnotationPresent(JsonRootName.class)){
                OBJECT_MAPPER.writerWithDefaultPrettyPrinter().withRootName(aClass.getAnnotation(JsonRootName.class).value().toLowerCase());
            }
            OBJECT_MAPPER.writerWithDefaultPrettyPrinter().writeValue(stringWriter, aClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return OBJECT_MAPPER;
    }


}
