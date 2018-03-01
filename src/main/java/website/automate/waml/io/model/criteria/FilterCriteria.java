package website.automate.waml.io.model.criteria;

public class FilterCriteria implements Criteria {

    private static final String DEFAULT_CRITERION_NAME = "selector";

    private String selector;

    private String text;

    private String value;

    private String parent;

    private String element;

    public FilterCriteria(String selector) {
        this();
        this.selector = selector;
    }

    public FilterCriteria() {
        super();
    }

    public String getSelector() {
        return selector;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }

    public String getParent() {
        return parent;
    }

    public String getElement() {
        return element;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public boolean canBeShortNotated() {
        return text == null && value == null && parent == null && element == null;
    }

    @Override
    public String getDefaultCriterionName() {
        return DEFAULT_CRITERION_NAME;
    }

    @Override
    public String getDefaultCriterionValue() {
        return getSelector();
    }

    public boolean hasFilterCriteria() {
        return selector != null || text != null || value != null || parent != null;
    }
}
