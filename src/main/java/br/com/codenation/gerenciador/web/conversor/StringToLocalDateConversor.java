package br.com.codenation.gerenciador.web.conversor;

import com.google.common.base.Strings;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class StringToLocalDateConversor implements Converter<String, LocalDate> {

    @Override
    public LocalDate convert(String data) {
        if (Strings.isNullOrEmpty(data))
            return null;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        return LocalDate.parse(data, formatter);
    }
}
