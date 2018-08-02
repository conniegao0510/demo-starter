package com.testDemo.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tlabs_students")
public class TlabsStudents {
    @Id
    private Integer id;

    @Id
    @Column(name = "student_number")
    private Integer studentNumber;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "campus_code")
    private Integer campusCode;

    private String lastfirst;

    private String firstname;

    private String lastname;

    private String midname;

    private String prefname;

    /**
     * enroll status
     */
    private Boolean status;

    /**
     * student email
     */
    private String email;

    private String phone;

    private String family;

    @Column(name = "grade_level")
    private Integer gradeLevel;

    @Column(name = "grade_next")
    private Integer gradeNext;

    private String gender;

    private String language;

    private String nation;

    /**
     * date of birth
     */
    private Date dob;

    /**
     * place of birth
     */
    private String pob;

    private String fulltime;

    private String passport;

    private String visa;

    @Column(name = "visa_exp")
    private Date visaExp;

    private Date entrydate;

    private Date exitdate;

    private Integer ctime;

    private Integer mtime;

    private Integer stime;

    @Column(name = "profile_fields")
    private String profileFields;

    private String remark;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return student_number
     */
    public Integer getStudentNumber() {
        return studentNumber;
    }

    /**
     * @param studentNumber
     */
    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * @return student_id
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * @param studentId
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * @return campus_code
     */
    public Integer getCampusCode() {
        return campusCode;
    }

    /**
     * @param campusCode
     */
    public void setCampusCode(Integer campusCode) {
        this.campusCode = campusCode;
    }

    /**
     * @return lastfirst
     */
    public String getLastfirst() {
        return lastfirst;
    }

    /**
     * @param lastfirst
     */
    public void setLastfirst(String lastfirst) {
        this.lastfirst = lastfirst;
    }

    /**
     * @return firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return midname
     */
    public String getMidname() {
        return midname;
    }

    /**
     * @param midname
     */
    public void setMidname(String midname) {
        this.midname = midname;
    }

    /**
     * @return prefname
     */
    public String getPrefname() {
        return prefname;
    }

    /**
     * @param prefname
     */
    public void setPrefname(String prefname) {
        this.prefname = prefname;
    }

    /**
     * 获取enroll status
     *
     * @return status - enroll status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置enroll status
     *
     * @param status enroll status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取student email
     *
     * @return email - student email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置student email
     *
     * @param email student email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return family
     */
    public String getFamily() {
        return family;
    }

    /**
     * @param family
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * @return grade_level
     */
    public Integer getGradeLevel() {
        return gradeLevel;
    }

    /**
     * @param gradeLevel
     */
    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    /**
     * @return grade_next
     */
    public Integer getGradeNext() {
        return gradeNext;
    }

    /**
     * @param gradeNext
     */
    public void setGradeNext(Integer gradeNext) {
        this.gradeNext = gradeNext;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return nation
     */
    public String getNation() {
        return nation;
    }

    /**
     * @param nation
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * 获取date of birth
     *
     * @return dob - date of birth
     */
    public Date getDob() {
        return dob;
    }

    /**
     * 设置date of birth
     *
     * @param dob date of birth
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * 获取place of birth
     *
     * @return pob - place of birth
     */
    public String getPob() {
        return pob;
    }

    /**
     * 设置place of birth
     *
     * @param pob place of birth
     */
    public void setPob(String pob) {
        this.pob = pob;
    }

    /**
     * @return fulltime
     */
    public String getFulltime() {
        return fulltime;
    }

    /**
     * @param fulltime
     */
    public void setFulltime(String fulltime) {
        this.fulltime = fulltime;
    }

    /**
     * @return passport
     */
    public String getPassport() {
        return passport;
    }

    /**
     * @param passport
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * @return visa
     */
    public String getVisa() {
        return visa;
    }

    /**
     * @param visa
     */
    public void setVisa(String visa) {
        this.visa = visa;
    }

    /**
     * @return visa_exp
     */
    public Date getVisaExp() {
        return visaExp;
    }

    /**
     * @param visaExp
     */
    public void setVisaExp(Date visaExp) {
        this.visaExp = visaExp;
    }

    /**
     * @return entrydate
     */
    public Date getEntrydate() {
        return entrydate;
    }

    /**
     * @param entrydate
     */
    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    /**
     * @return exitdate
     */
    public Date getExitdate() {
        return exitdate;
    }

    /**
     * @param exitdate
     */
    public void setExitdate(Date exitdate) {
        this.exitdate = exitdate;
    }

    /**
     * @return ctime
     */
    public Integer getCtime() {
        return ctime;
    }

    /**
     * @param ctime
     */
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    /**
     * @return mtime
     */
    public Integer getMtime() {
        return mtime;
    }

    /**
     * @param mtime
     */
    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }

    /**
     * @return stime
     */
    public Integer getStime() {
        return stime;
    }

    /**
     * @param stime
     */
    public void setStime(Integer stime) {
        this.stime = stime;
    }

    /**
     * @return profile_fields
     */
    public String getProfileFields() {
        return profileFields;
    }

    /**
     * @param profileFields
     */
    public void setProfileFields(String profileFields) {
        this.profileFields = profileFields;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}