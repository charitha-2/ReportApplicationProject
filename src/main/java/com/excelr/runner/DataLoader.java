package com.excelr.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.excelr.entity.CitizenPlan;
import com.excelr.repository.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private CitizenPlanRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		repo.deleteAll();  // every time when we restart the server it will remove the existing data in the DB Table

		// cash plan Data
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("charitha");
		c1.setGender("Female");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now().minusMonths(6));
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(10000.00);
		c1.setTerminationRsn("--");
		c1.setDenialReason("--");
		
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Shreya");
		c2.setGender("Female");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Approved");
		c2.setPlanStartDate(LocalDate.now().minusMonths(6));
		c2.setPlanEndDate(LocalDate.now().plusMonths(24));
		c2.setBenefitAmt(10000.00);
		c2.setTerminationRsn("--");
		c2.setDenialReason("--");
		
		

		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("likhitha");
		c3.setGender("Female");
		c3.setPlanName("cash");
		c3.setPlanStatus("Denied");
		c3.setPlanStartDate(null);
		c3.setPlanEndDate(null);
		c3.setBenefitAmt(null);
		c3.setTerminationRsn("--");
		c3.setDenialReason("Rental Income");
		
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Sruthi");
		c4.setGender("Female");
		c4.setPlanName("Cash");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now().minusMonths(12));
		c4.setPlanEndDate(LocalDate.now().plusMonths(24));
		c4.setBenefitAmt(12000.00);
		c4.setTerminationRsn("--");
		c4.setDenialReason("--");

		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Hema");
		c5.setGender("Female");
		c5.setPlanName("cash");
		c5.setPlanStatus("terminated");
		c5.setPlanStartDate(LocalDate.now().minusMonths(12));
		c5.setPlanEndDate(LocalDate.now().plusMonths(24));
		c5.setBenefitAmt(8000.00);
		c5.setTerminatedDate(LocalDate.now().minusMonths(9));
		c5.setTerminationRsn("Employed");
		c5.setDenialReason("--");

		// Food plan Data
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Harsha");
		c6.setGender("Male");
		c6.setPlanName("Food");
		c6.setPlanStatus("Approved");
		c6.setPlanStartDate(LocalDate.now().minusMonths(6));
		c6.setPlanEndDate(LocalDate.now().plusMonths(12));
		c6.setBenefitAmt(9000.00);
		c6.setTerminationRsn("--");
		c6.setDenialReason("--");

		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Ravi");
		c7.setGender("Male");
		c7.setPlanName("Food");
		c7.setPlanStatus("Denied");
		c7.setPlanStartDate(null);
		c7.setPlanEndDate(null);
		c7.setBenefitAmt(null);
		c7.setTerminationRsn("--");
		c7.setDenialReason("Expects quality food");

		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Abhi");
		c8.setGender("Male");
		c8.setPlanName("Food");
		c8.setPlanStatus("Terminated");
		c8.setPlanStartDate(LocalDate.now().minusMonths(4));
		c8.setPlanEndDate(LocalDate.now().plusMonths(6));
		c8.setBenefitAmt(8000.00);
		c8.setTerminatedDate(LocalDate.now().plusMonths(6));
		c8.setTerminationRsn("Employed");
		c8.setDenialReason("--");
		
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Usha");
		c9.setGender("Female");
		c9.setPlanName("Food");
		c9.setPlanStatus("Denied");
		c9.setPlanStartDate(null);
		c9.setPlanEndDate(null);
		c9.setBenefitAmt(null);
		c9.setTerminationRsn("--");
		c9.setDenialReason("Expects quality food");

		// Medical plan Data
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Harshi");
		c10.setGender("Female");
		c10.setPlanName("Medical");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now().minusYears(2));
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmt(12000.00);
		c10.setTerminationRsn("--");
		c10.setDenialReason("--");

		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Muskan");
		c11.setGender("Female");
		c11.setPlanName("Medical");
		c11.setPlanStatus("Denied");
		c11.setPlanStartDate(null);
		c11.setPlanEndDate(null);
		c11.setBenefitAmt(null);
		c11.setTerminationRsn("--");
		c11.setDenialReason("--");

		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("kamal");
		c12.setGender("Male");
		c12.setPlanName("Medical");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(8));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmt(9000.00);
		c12.setTerminatedDate(LocalDate.now().plusMonths(10));
		c12.setTerminationRsn("Govt Job");
		c12.setDenialReason("--");

		// Employment plan Data
		CitizenPlan c13 = new CitizenPlan();
		c13.setCitizenName("Kalyani");
		c13.setGender("Female");
		c13.setPlanName("Employment");
		c13.setPlanStatus("Approved");
		c13.setPlanStartDate(LocalDate.now().minusYears(1));
		c13.setPlanEndDate(LocalDate.now().plusMonths(12));
		c13.setBenefitAmt(4000.00);
		c13.setTerminationRsn("--");
		c13.setDenialReason("--");

		CitizenPlan c14 = new CitizenPlan();
		c14.setCitizenName("Akshay");
		c14.setGender("Male");
		c14.setPlanName("Employment");
		c14.setPlanStatus("Denied");
		c14.setPlanStartDate(null);
		c14.setPlanEndDate(null);
		c14.setBenefitAmt(null);
		c14.setTerminationRsn("--");
		c14.setDenialReason("Expects good package");

		CitizenPlan c15 = new CitizenPlan();
		c15.setCitizenName("Balu");
		c15.setGender("Male");
		c15.setPlanName("Employment");
		c15.setPlanStatus("Terminated");
		c15.setPlanStartDate(LocalDate.now().minusMonths(12));
		c15.setPlanEndDate(LocalDate.now().plusMonths(6));
		c15.setBenefitAmt(5000.00);
		c15.setTerminatedDate(LocalDate.now().minusMonths(16));
		c15.setTerminationRsn("Got an another job");
		c15.setDenialReason("--");
		
		
		List<CitizenPlan> list = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12,c13,c14,c15);
		
		repo.saveAll(list);

	}

}