package website.automate.waml.io.reader;

import org.junit.Test;
import website.automate.waml.io.WamlConfig;
import website.automate.waml.io.reader.WamlDeserializationException;
import website.automate.waml.io.reader.WamlReader;

public class WamlReaderIT {

    private WamlReader reader = WamlConfig.getInstance().getWamlReader();

    @Test(expected = WamlDeserializationException.class)
    public void readerFailsWithDeserializationException() {
        reader.read(WamlReaderIT.class.getClassLoader().getResourceAsStream(
                "website/automate/waml/io/reader/unknown-action-scenario.yaml"));
    }
}
