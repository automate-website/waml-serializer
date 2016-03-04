package website.automate.waml.io.deserializer;

import website.automate.waml.io.WamlConfig;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class DeserializerBase {

    protected ObjectMapper mapper = WamlConfig.getInstance().getMapper();
    
    protected String getBasePath(){
        return "./website/automate/waml/io/deserializer";
    }
}
