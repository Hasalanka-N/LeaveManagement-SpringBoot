package com.example.leave_request.Data;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "LeaveRequest")
public class Leave {

    @Id
    @Column(name = "leave_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int leave_id;

    @Column(name = "emp_id")
    private int emp_id;

    @Column(name = "leave_type")
    private String leave_type;

    @Column(name ="from_date")
    private LocalDate from_date;

    @Column(name ="to_date")
    private LocalDate to_date;

    @Column(name = "reason")
    private String reason;

    @Column(name = "document_path")
    private String doc;

    public int getLeave_id() {
        return leave_id;
    }

    public void setLeave_id(int leave_id) {
        this.leave_id = leave_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getLeave_type() {
        return leave_type;
    }

    public void setLeave_type(String leave_type) {
        this.leave_type = leave_type;
    }

    public LocalDate getFrom_date() {
        return from_date;
    }

    public void setFrom_date(LocalDate from_date) {
        this.from_date = from_date;
    }

    public LocalDate getTo_date() {
        return to_date;
    }

    public void setTo_date(LocalDate to_date) {
        this.to_date = to_date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
}
