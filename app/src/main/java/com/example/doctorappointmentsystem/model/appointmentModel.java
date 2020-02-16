package com.example.doctorappointmentsystem.model;

public class appointmentModel {
    private String DoctorId;
    private String AppointmentDate;
    private String AppointmentTime;
    private String Query;

    public appointmentModel(String DoctorId, String AppointmentDate, String AppointmentTime, String Query){
        this.DoctorId = DoctorId;
        this.AppointmentDate = AppointmentDate;
        this.AppointmentTime = AppointmentTime;
        this.Query = Query;
    }

    public String getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(String doctorId) {
        DoctorId = doctorId;
    }

    public String getAppointmentDate() {
        return AppointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        AppointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return AppointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        AppointmentTime = appointmentTime;
    }

    public String getQuery() {
        return Query;
    }

    public void setQuery(String query) {
        Query = query;
    }

}
