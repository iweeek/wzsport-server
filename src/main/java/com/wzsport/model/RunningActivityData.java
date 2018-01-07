package com.wzsport.model;

import java.util.Date;

public class RunningActivityData {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_data.id
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_data.activity_id
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    private Long activityId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_data.acquisition_time
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    private Date acquisitionTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_data.step_count
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    private Integer stepCount;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_data.step_count_cal
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    private Short stepCountCal;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_data.distance
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    private Integer distance;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_data.distance_per_step
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    private Double distancePerStep;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_data.step_per_second
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    private Double stepPerSecond;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_data.longitude
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    private Double longitude;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_data.latitude
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    private Double latitude;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_data.location_type
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    private Integer locationType;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_running_activity_data.is_normal
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    private Boolean isNormal;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_data.id
     * @return  the value of wzsport_running_activity_data.id
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_data.id
     * @param id  the value for wzsport_running_activity_data.id
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_data.activity_id
     * @return  the value of wzsport_running_activity_data.activity_id
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_data.activity_id
     * @param activityId  the value for wzsport_running_activity_data.activity_id
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_data.acquisition_time
     * @return  the value of wzsport_running_activity_data.acquisition_time
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public Date getAcquisitionTime() {
        return acquisitionTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_data.acquisition_time
     * @param acquisitionTime  the value for wzsport_running_activity_data.acquisition_time
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public void setAcquisitionTime(Date acquisitionTime) {
        this.acquisitionTime = acquisitionTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_data.step_count
     * @return  the value of wzsport_running_activity_data.step_count
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public Integer getStepCount() {
        return stepCount;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_data.step_count
     * @param stepCount  the value for wzsport_running_activity_data.step_count
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public void setStepCount(Integer stepCount) {
        this.stepCount = stepCount;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_data.step_count_cal
     * @return  the value of wzsport_running_activity_data.step_count_cal
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public Short getStepCountCal() {
        return stepCountCal;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_data.step_count_cal
     * @param stepCountCal  the value for wzsport_running_activity_data.step_count_cal
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public void setStepCountCal(Short stepCountCal) {
        this.stepCountCal = stepCountCal;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_data.distance
     * @return  the value of wzsport_running_activity_data.distance
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public Integer getDistance() {
        return distance;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_data.distance
     * @param distance  the value for wzsport_running_activity_data.distance
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_data.distance_per_step
     * @return  the value of wzsport_running_activity_data.distance_per_step
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public Double getDistancePerStep() {
        return distancePerStep;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_data.distance_per_step
     * @param distancePerStep  the value for wzsport_running_activity_data.distance_per_step
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public void setDistancePerStep(Double distancePerStep) {
        this.distancePerStep = distancePerStep;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_data.step_per_second
     * @return  the value of wzsport_running_activity_data.step_per_second
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public Double getStepPerSecond() {
        return stepPerSecond;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_data.step_per_second
     * @param stepPerSecond  the value for wzsport_running_activity_data.step_per_second
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public void setStepPerSecond(Double stepPerSecond) {
        this.stepPerSecond = stepPerSecond;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_data.longitude
     * @return  the value of wzsport_running_activity_data.longitude
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_data.longitude
     * @param longitude  the value for wzsport_running_activity_data.longitude
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_data.latitude
     * @return  the value of wzsport_running_activity_data.latitude
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_data.latitude
     * @param latitude  the value for wzsport_running_activity_data.latitude
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_data.location_type
     * @return  the value of wzsport_running_activity_data.location_type
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public Integer getLocationType() {
        return locationType;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_data.location_type
     * @param locationType  the value for wzsport_running_activity_data.location_type
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public void setLocationType(Integer locationType) {
        this.locationType = locationType;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_running_activity_data.is_normal
     * @return  the value of wzsport_running_activity_data.is_normal
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public Boolean getIsNormal() {
        return isNormal;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_running_activity_data.is_normal
     * @param isNormal  the value for wzsport_running_activity_data.is_normal
     * @mbg.generated  Mon Jan 08 01:02:15 CST 2018
     */
    public void setIsNormal(Boolean isNormal) {
        this.isNormal = isNormal;
    }
}