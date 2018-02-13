package website.automate.waml.io.model.step;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import website.automate.waml.io.model.criteria.FilterCriteria;
import website.automate.waml.io.report.StepReport;

public class SelectStep extends BasicStep {

  static final String TYPE_NAME = "select";
  
  private FilterCriteria select;

  @JsonCreator
  public SelectStep(@JsonProperty("when") String when,
      @JsonProperty("unless") String unless,
      @JsonProperty("register") String register, 
      @JsonProperty("timeout") String timeout,
      @JsonProperty("invert") String invert,
      @JsonProperty("select") FilterCriteria select,
      @JsonProperty("report") StepReport report){
    super(when, unless, register, timeout, invert, report);
    this.select = select;
  }
  
  public FilterCriteria getSelect() {
    return select;
  }

  @Override
  public String getName() {
    return TYPE_NAME;
  }
}
