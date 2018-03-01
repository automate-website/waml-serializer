package website.automate.waml.io.model.action;

import website.automate.waml.io.model.criteria.EnterCriteria;

public class EnterAction extends FilterAction<EnterCriteria> {

    static final String TYPE_NAME = "enter";

    private EnterCriteria enter;

    public EnterCriteria getEnter() {
        return enter;
    }

    public void setEnter(EnterCriteria enter) {
        this.enter = enter;
    }

    @Override
    public String getName() {
        return TYPE_NAME;
    }

    @Override
    public EnterCriteria getFilter() {
        return enter;
    }

    @Override
    public void setFilter(EnterCriteria filter) {
        this.enter = filter;
    }
}
