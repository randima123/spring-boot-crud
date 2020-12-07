//package com.java.demo.springbootcrud.model;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//import java.util.UUID;
//
//@Entity
//public class Event {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "event_id", updatable = false, nullable = false)
//    @JsonProperty("eventId")
//    private Long eventId;
//
//    @Column(name="trans_id")
//    @JsonProperty("transId")
//    private String transId;
//
//    @Column(name="trans_tms")
//    @JsonProperty("transTms")
//    private String transTms;
//
//    @Column(name="rc_num")
//    @JsonProperty("rcNum")
//    private String rcNum;
//
//    @Column(name="client_id")
//    @JsonProperty("clientId")
//    private String clientId;
//
//    @Column(name="event_cnt")
//    @JsonProperty("eventCnt")
//    private String eventCnt;
//
//    @Column(name="location_cd")
//    @JsonProperty("locationCd")
//    private String locationCd;
//
//    @Column(name="location_id1")
//    @JsonProperty("locationId1")
//    private String locationId1;
//
//    @Column(name="location_id2")
//    @JsonProperty("locationId2")
//    private String locationId2;
//
//    @Column(name="addr_nbr")
//    @JsonProperty("addrNbr")
//    private String addrNbr;
//
//    public Long getEventId() {
//        return eventId;
//    }
//
//    public void setEventId(Long eventId) {
//        this.eventId = eventId;
//    }
//
//    public String getTransId() {
//        return transId;
//    }
//
//    public void setTransId(String transId) {
//        this.transId = transId;
//    }
//
//    public String getTransTms() {
//        return transTms;
//    }
//
//    public void setTransTms(String transTms) {
//        this.transTms = transTms;
//    }
//
//    public String getRcNum() {
//        return rcNum;
//    }
//
//    public void setRcNum(String rcNum) {
//        this.rcNum = rcNum;
//    }
//
//    public String getClientId() {
//        return clientId;
//    }
//
//    public void setClientId(String clientId) {
//        this.clientId = clientId;
//    }
//
//    public String getEventCnt() {
//        return eventCnt;
//    }
//
//    public void setEventCnt(String eventCnt) {
//        this.eventCnt = eventCnt;
//    }
//
//    public String getLocationCd() {
//        return locationCd;
//    }
//
//    public void setLocationCd(String locationCd) {
//        this.locationCd = locationCd;
//    }
//
//    public String getLocationId1() {
//        return locationId1;
//    }
//
//    public void setLocationId1(String locationId1) {
//        this.locationId1 = locationId1;
//    }
//
//    public String getLocationId2() {
//        return locationId2;
//    }
//
//    public void setLocationId2(String locationId2) {
//        this.locationId2 = locationId2;
//    }
//
//    public String getAddrNbr() {
//        return addrNbr;
//    }
//
//    public void setAddrNbr(String addrNbr) {
//        this.addrNbr = addrNbr;
//    }
//
//    @Override
//    public String toString() {
//        return "Event{" +
//                "eventId=" + eventId +
//                ", transId='" + transId + '\'' +
//                ", transTms='" + transTms + '\'' +
//                ", rcNum='" + rcNum + '\'' +
//                ", clientId='" + clientId + '\'' +
//                ", eventCnt='" + eventCnt + '\'' +
//                ", locationCd='" + locationCd + '\'' +
//                ", locationId1='" + locationId1 + '\'' +
//                ", locationId2='" + locationId2 + '\'' +
//                ", addrNbr='" + addrNbr + '\'' +
//                '}';
//    }
//}
