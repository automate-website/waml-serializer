package website.automate.waml.io.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import website.automate.waml.io.model.main.criteria.Criteria;

import java.io.IOException;

public class CriteriaSerializer extends StdSerializer<Criteria> implements ResolvableSerializer {

    private static final long serialVersionUID = 7861146712268855092L;

    @SuppressWarnings("rawtypes")
    private final JsonSerializer defaultSerializer;

    @SuppressWarnings("rawtypes")
    public CriteriaSerializer(JsonSerializer defaultSerializer) {
        super(Criteria.class);
        this.defaultSerializer = defaultSerializer;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void serialize(Criteria criteria, JsonGenerator generator, SerializerProvider provider)
            throws IOException {
        if (criteria.canBeShortNotated()) {
            Object defaultCriterionValue = criteria.getDefaultCriterionValue();
            generator.writeObject(defaultCriterionValue);
        } else {
            defaultSerializer.serialize(criteria, generator, provider);
        }
    }

    @Override
    public void resolve(SerializerProvider provider) throws JsonMappingException {
        ((ResolvableSerializer) defaultSerializer).resolve(provider);
    }

}
