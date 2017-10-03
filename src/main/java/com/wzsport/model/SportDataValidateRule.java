package com.wzsport.model;

import java.math.BigDecimal;

public class SportDataValidateRule {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_data_validate_rule.id
     * @mbg.generated  Tue Oct 03 08:21:52 CST 2017
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_data_validate_rule.distance_per_step
     * @mbg.generated  Tue Oct 03 08:21:52 CST 2017
     */
    private Double distancePerStep;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_data_validate_rule.speed
     * @mbg.generated  Tue Oct 03 08:21:52 CST 2017
     */
    private Double speed;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_sport_data_validate_rule.validate_mode
     * @mbg.generated  Tue Oct 03 08:21:52 CST 2017
     */
    private Byte validateMode;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_data_validate_rule.id
     * @return  the value of wzsport_sport_data_validate_rule.id
     * @mbg.generated  Tue Oct 03 08:21:52 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_data_validate_rule.id
     * @param id  the value for wzsport_sport_data_validate_rule.id
     * @mbg.generated  Tue Oct 03 08:21:52 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_data_validate_rule.distance_per_step
     * @return  the value of wzsport_sport_data_validate_rule.distance_per_step
     * @mbg.generated  Tue Oct 03 08:21:52 CST 2017
     */
    public Double getDistancePerStep() {
        return distancePerStep;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_data_validate_rule.distance_per_step
     * @param distancePerStep  the value for wzsport_sport_data_validate_rule.distance_per_step
     * @mbg.generated  Tue Oct 03 08:21:52 CST 2017
     */
    public void setDistancePerStep(Double distancePerStep) {
        this.distancePerStep = distancePerStep;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_data_validate_rule.speed
     * @return  the value of wzsport_sport_data_validate_rule.speed
     * @mbg.generated  Tue Oct 03 08:21:52 CST 2017
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_data_validate_rule.speed
     * @param speed  the value for wzsport_sport_data_validate_rule.speed
     * @mbg.generated  Tue Oct 03 08:21:52 CST 2017
     */
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_sport_data_validate_rule.validate_mode
     * @return  the value of wzsport_sport_data_validate_rule.validate_mode
     * @mbg.generated  Tue Oct 03 08:21:52 CST 2017
     */
    public Byte getValidateMode() {
        return validateMode;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_sport_data_validate_rule.validate_mode
     * @param validateMode  the value for wzsport_sport_data_validate_rule.validate_mode
     * @mbg.generated  Tue Oct 03 08:21:52 CST 2017
     */
    public void setValidateMode(Byte validateMode) {
        this.validateMode = validateMode;
    }
}