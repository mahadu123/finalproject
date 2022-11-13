package com.sdl.homeloan.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
public class SanctionLetter 
{ 
	@Id
   private int sid;
   private String SanctionDate;
   private int prospectno;
   private String Applicantname;
   private long Contactdetails;
   private String product;
   private double LoanAmtSanctioned;
   private String interestType;
   private int RateofInterest;
   private int LoanTennur;
   private double EmiAmount;
   private String ModeofPayment;
   private String Remarks;
   private String TermCondition;
   private String status;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSanctionDate() {
	return SanctionDate;
}
public void setSanctionDate(String sanctionDate) {
	SanctionDate = sanctionDate;
}
public int getProspectno() {
	return prospectno;
}
public void setProspectno(int prospectno) {
	this.prospectno = prospectno;
}
public String getApplicantname() {
	return Applicantname;
}
public void setApplicantname(String applicantname) {
	Applicantname = applicantname;
}
public long getContactdetails() {
	return Contactdetails;
}
public void setContactdetails(long contactdetails) {
	Contactdetails = contactdetails;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public double getLoanAmtSanctioned() {
	return LoanAmtSanctioned;
}
public void setLoanAmtSanctioned(double loanAmtSanctioned) {
	LoanAmtSanctioned = loanAmtSanctioned;
}
public String getInterestType() {
	return interestType;
}
public void setInterestType(String interestType) {
	this.interestType = interestType;
}
public int getRateofInterest() {
	return RateofInterest;
}
public void setRateofInterest(int rateofInterest) {
	RateofInterest = rateofInterest;
}
public int getLoanTennur() {
	return LoanTennur;
}
public void setLoanTennur(int loanTennur) {
	LoanTennur = loanTennur;
}
public double getEmiAmount() {
	return EmiAmount;
}
public void setEmiAmount(double emiAmount) {
	EmiAmount = emiAmount;
}
public String getModeofPayment() {
	return ModeofPayment;
}
public void setModeofPayment(String modeofPayment) {
	ModeofPayment = modeofPayment;
}
public String getRemarks() {
	return Remarks;
}
public void setRemarks(String remarks) {
	Remarks = remarks;
}
public String getTermCondition() {
	return TermCondition;
}
public void setTermCondition(String termCondition) {
	TermCondition = termCondition;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "SanctionLetter [sid=" + sid + ", SanctionDate=" + SanctionDate + ", prospectno=" + prospectno
			+ ", Applicantname=" + Applicantname + ", Contactdetails=" + Contactdetails + ", product=" + product
			+ ", LoanAmtSanctioned=" + LoanAmtSanctioned + ", interestType=" + interestType + ", RateofInterest="
			+ RateofInterest + ", LoanTennur=" + LoanTennur + ", EmiAmount=" + EmiAmount + ", ModeofPayment="
			+ ModeofPayment + ", Remarks=" + Remarks + ", TermCondition=" + TermCondition + ", status=" + status + "]";
}
   
}
