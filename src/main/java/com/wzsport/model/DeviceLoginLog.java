package com.wzsport.model;

public class DeviceLoginLog {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_device_login_log.id
     * @mbg.generated  Sat Oct 07 23:32:43 CST 2017
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_device_login_log.device_id
     * @mbg.generated  Sat Oct 07 23:32:43 CST 2017
     */
    private String deviceId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_device_login_log.user_agent
     * @mbg.generated  Sat Oct 07 23:32:43 CST 2017
     */
    private String userAgent;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_device_login_log.id
     * @return  the value of wzsport_device_login_log.id
     * @mbg.generated  Sat Oct 07 23:32:43 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_device_login_log.id
     * @param id  the value for wzsport_device_login_log.id
     * @mbg.generated  Sat Oct 07 23:32:43 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_device_login_log.device_id
     * @return  the value of wzsport_device_login_log.device_id
     * @mbg.generated  Sat Oct 07 23:32:43 CST 2017
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_device_login_log.device_id
     * @param deviceId  the value for wzsport_device_login_log.device_id
     * @mbg.generated  Sat Oct 07 23:32:43 CST 2017
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_device_login_log.user_agent
     * @return  the value of wzsport_device_login_log.user_agent
     * @mbg.generated  Sat Oct 07 23:32:43 CST 2017
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_device_login_log.user_agent
     * @param userAgent  the value for wzsport_device_login_log.user_agent
     * @mbg.generated  Sat Oct 07 23:32:43 CST 2017
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}