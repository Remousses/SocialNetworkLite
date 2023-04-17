package com.remousses.social_network_lite.model.entity.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

public @Converter(autoApply = true)
class LocalDateConverter implements AttributeConverter<LocalDate, Date> {
    @Override
    public Date convertToDatabaseColumn(LocalDate localDateTime) {
        return localDateTime != null ? Date.valueOf(localDateTime) : null;
    }

    @Override
    public LocalDate convertToEntityAttribute(Date date) {
        return date != null ? date.toLocalDate() : null;
    }
}
