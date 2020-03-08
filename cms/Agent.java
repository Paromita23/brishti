<<<<<<< HEAD
package com.hexaware.mlp178.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Agent {

/**
 * AgentId to store AgentId.
 */
  private int agentId;
  /**
 * Name to store Agent name.
 */
  private String name;
  /**
 * City to store city name.
 */
  private String city;
  /**
 * Gender to store gender.
 */
  private AgentCat gender;
  /**
 * MaritalStatus to store marital status.
 */
  private int maritalStatus;
  /**
 * Premium to store password.
 */
  private Double premium;
/** 
 * Default constructor 
 */
public Agent() {

}
/**
 * @param argAgentId to initialize Agent id.
 * used to get details through constructor.
 * @param argName to initialize AGENT NAME.
 * @param argCity to initialize agent city.
 * @param argGender to initialize gender.
 * @param argMaritalStatus to marital status.
 * @param argPremium to initialize premium.
 * used to get details through constructor.
 */
  public Agent(final int argAgentId, final String argName, final String argCity,
        final AgentCat argGender, final int argMaritalStatus, final Double argPremium) {
    this.agentId = argAgentId;
    this.name = argName;
    this.city = argCity;
    this.gender = argGender;
    this.maritalStatus = argMaritalStatus;
    this.premium = argPremium;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Agent Agent = (Agent) obj;
    if (Objects.equals(agentId, Agent.agentId)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(agentId);
  }
  @Override
  public final String toString() {
    return String.format("%10s %10s %10s %10s %10s %10s ", agentId, name, city,
     gender,  maritalStatus, premium);
  }
    /**
     * @return this agent ID.
     */
  public final int getAgentId() {
    return agentId;
  }
    /**
     * @param argAgentId gets the agent id.
     */
  public final void setAgentId(final int argAgentId) {
    this.agentId = argAgentId;
  }
  /**
     * @return this agent name.
     */
  public final String getName() {
    return name;
  }
  /**
     * @param argName gets the agent name.
     */
  public final void setName(final String argName) {
    this.name = argName;
  }
    /**
     * @return this city.
     */
  public final String getCity() {
    return city;
  }
  /**
   * @param argCity gets the city.
   */
  public final void setCity(final String argCity) {
    this.city = argCity;
  }
   /**
     * @return this gender.
     */
  public final AgentCat getGender() {
    return gender;
  }
  /**
   * @param argGender gets the gender.
   */
  public final void setGender(final AgentCat argGender) {
    this.gender = argGender;
  }
  /**
     * @return this marital status.
     */
  public final int getMaritalStatus() {
    return maritalStatus;
  }
  /**
   * @param argMaritalStatus gets the marital status.
   */
  public final void setMaritalStatus(final int argMaritalStatus) {
    this.maritalStatus = argMaritalStatus;
  }
  /**
     * @return this premium.
     */
  public final Double getPremium() {
    return premium;
  }
  /**
   * @param argPremium gets the password.
   */
  public final void setPremium(final Double argPremium) {
    this.premium = argPremium;
  }
}
=======
package com.hexaware.mlp178.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Agent {

/**
 * AgentId to store AgentId.
 */
  private int agentId;
  /**
 * Name to store Agent name.
 */
  private String name;
  /**
 * City to store city name.
 */
  private String city;
  /**
 * Gender to store gender.
 */
  private AgentCat gender;
  /**
 * MaritalStatus to store marital status.
 */
  private int maritalStatus;
  /**
 * Premium to store password.
 */
  private Double premium;
/** 
 * Default constructor 
 */
public Agent() {

}
/**
 * @param argAgentId to initialize Agent id.
 * used to get details through constructor.
 * @param argName to initialize AGENT NAME.
 * @param argCity to initialize agent city.
 * @param argGender to initialize gender.
 * @param argMaritalStatus to marital status.
 * @param argPremium to initialize premium.
 * used to get details through constructor.
 */
  public Agent(final int argAgentId, final String argName, final String argCity,
        final AgentCat argGender, final int argMaritalStatus, final Double argPremium) {
    this.agentId = argAgentId;
    this.name = argName;
    this.city = argCity;
    this.gender = argGender;
    this.maritalStatus = argMaritalStatus;
    this.premium = argPremium;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Agent Agent = (Agent) obj;
    if (Objects.equals(agentId, Agent.agentId)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(agentId);
  }
  @Override
  public final String toString() {
    return String.format("%10s %10s %10s %10s %10s %10s ", agentId, name, city,
     gender,  maritalStatus, premium);
  }
    /**
     * @return this agent ID.
     */
  public final int getAgentId() {
    return agentId;
  }
    /**
     * @param argAgentId gets the agent id.
     */
  public final void setAgentId(final int argAgentId) {
    this.agentId = argAgentId;
  }
  /**
     * @return this agent name.
     */
  public final String getName() {
    return name;
  }
  /**
     * @param argName gets the agent name.
     */
  public final void setName(final String argName) {
    this.name = argName;
  }
    /**
     * @return this city.
     */
  public final String getCity() {
    return city;
  }
  /**
   * @param argCity gets the city.
   */
  public final void setCity(final String argCity) {
    this.city = argCity;
  }
   /**
     * @return this gender.
     */
  public final AgentCat getGender() {
    return gender;
  }
  /**
   * @param argGender gets the gender.
   */
  public final void setGender(final AgentCat argGender) {
    this.gender = argGender;
  }
  /**
     * @return this marital status.
     */
  public final int getMaritalStatus() {
    return maritalStatus;
  }
  /**
   * @param argMaritalStatus gets the marital status.
   */
  public final void setMaritalStatus(final int argMaritalStatus) {
    this.maritalStatus = argMaritalStatus;
  }
  /**
     * @return this premium.
     */
  public final Double getPremium() {
    return premium;
  }
  /**
   * @param argPremium gets the password.
   */
  public final void setPremium(final Double argPremium) {
    this.premium = argPremium;
  }
}
>>>>>>> 94efc40dcb80642c275cc9a8e864ed8eee42c31a
