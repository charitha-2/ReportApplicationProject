<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Reports Application</title>

<style>
    body {
        background-color: #add8e6;  /* Light Blue */
        color: #000;
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }
    .container {
        width: 90%;
        margin: 20px auto;
        background-color: #ffffff; /* White content box */
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0px 4px 8px rgba(0,0,0,0.1);
    }
    h3 {
        text-align: center;
        color: #003366; /* Dark Blue */
    }
    /* Table */
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 15px;
    }
    th, td {
        border: 1px solid #ccc;
        padding: 8px;
        text-align: center;
    }
    th {
        background-color: #87ceeb; /* Sky Blue */
        color: #000;
    }
    tbody tr:nth-child(odd) {
        background-color: #f0f8ff; /* Alice Blue */
    }
    tbody tr:nth-child(even) {
        background-color: #e6f7ff; /* Lighter Blue */
    }
    tbody tr:hover {
        background-color: #d0ebff; /* Highlight Blue */
    }
    /* Inputs */
    .form-input, .form-select {
        background-color: #ffffff;
        color: #000;
        border: 1px solid #999;
        border-radius: 5px;
        padding: 6px;
        width: 100%;
    }
    .form-input:focus, .form-select:focus {
        outline: none;
        border-color: #1e90ff;
        box-shadow: 0 0 5px rgba(30, 144, 255, 0.5);
    }
    /* Buttons */
    .btn {
        padding: 8px 14px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
    .btn-primary {
        background-color: #1e90ff;
        color: #fff;
    }
    .btn-primary:hover {
        background-color: #187bcd;
    }
    .btn-secondary {
        background-color: #6c757d;
        color: #fff;
    }
    .btn-secondary:hover {
        background-color: #5c636a;
    }
    /* Links */
    a {
        color: #1e90ff;
        text-decoration: none;
        margin: 0 5px;
    }
    a:hover {
        color: #003366;
        text-decoration: underline;
    }
    /* Pagination */
    .pagination {
        margin-top: 20px;
        display: flex;
        justify-content: center;
        gap: 8px;
    }
    .pagination a {
        color: #000;
        background-color: #e6f7ff;
        border: 1px solid #ccc;
        padding: 6px 12px;
        border-radius: 4px;
    }
    .pagination a:hover {
        background-color: #1e90ff;
        border-color: #1e90ff;
        color: #fff;
    }
    .pagination .active {
        background-color: #1e90ff;
        border-color: #1e90ff;
        color: #fff;
    }
    .pagination .disabled {
        background-color: #ccc;
        border-color: #ccc;
        pointer-events: none;
        opacity: 0.6;
    }
</style>
</head>
<body>

	<div class="container">
		<h3>Report Application</h3>
	
	<form:form action="/searchData" modelAttribute="search" method="POST">
	    <table>
	       <tr>
	         <td>Plan Name:</td>
	         <td>
	            <form:select path="planName" cssClass="form-select">
	                 <form:option value="">-Select-</form:option>
	                 <form:options items="${names}"/>
	            </form:select>
	         </td>
	      
	         <td>Plan Status:</td>
	         <td>
	           <form:select path="planStatus" cssClass="form-select">
	                <form:option value="">-Select-</form:option>
	                <form:options items="${status}"/>
	           </form:select>
	         </td>
	         
	         <td>Gender:</td>
	         <td>
	            <form:select path="gender" cssClass="form-select">
	                <form:option value="">-Select-</form:option>
	                <form:option value="Male">Male</form:option>
	                <form:option value="Female">Female</form:option>
	            </form:select>
	         </td>
	          </tr>
	          
	          <tr>
	             <td>StartDate:</td>
	             <td><form:input path="startDate" type="date" cssClass="form-input"/></td>
	          
	             <td>EndDate:</td>
	             <td><form:input path="endDate" type="date" cssClass="form-input"/></td>
	          </tr>
	          <tr>
	             <td><a href="/" class="btn btn-secondary">Reset</a></td>
	             <td>
	               <input type="submit" value="Search" class="btn btn-primary" />
	             </td>
	          </tr>
	    </table>
	</form:form>
	
	<hr/>
	<table>
	   <thead>
	      <tr>
	        <th>Id</th>
	        <th>Holder Name</th>
	        <th>Gender</th>
	        <th>Plan Name</th>
	        <th>Plan Status</th>
	        <th>Start Date</th>
	        <th>End Date</th>
	        <th>Benefit Amt</th>
	        <th>TerminationRsn</th>
	        <th>DenialReason</th>
	      </tr>
	   </thead>
	   <tbody>
	       <c:forEach items="${plans}" var="plan" varStatus="index">
	           <tr>
	             <td>${index.count}</td>
	             <td>${plan.citizenName}</td>
	             <td>${plan.gender}</td>
	             <td>${plan.planName}</td>
	             <td>${plan.planStatus}</td>
	             <td>${plan.planStartDate}</td>
	             <td>${plan.planEndDate}</td>
	             <td>${plan.benefitAmt}</td>
	             <td>${plan.terminationRsn}</td>
	             <td>${plan.denialReason}</td>
	           </tr>
	       </c:forEach>
	       <tr>
	       <c:if test="${empty plans}">
	          <td colspan="10" style="text-align: center">No Records found</td>
	       </c:if>
	       </tr>
	   </tbody>
	</table>

	<!-- Pagination -->
	<div class="pagination">
	    <a href="#" class="disabled">Prev</a>
	    <a href="#" class="active">1</a>
	    <a href="#">2</a>
	    <a href="#">3</a>
	    <a href="#">Next</a>
	</div>
	
	<hr/>
	Export : <a href="/excel">Excel</a> | <a href="/pdf">Pdf</a>
	</div>

</body>
</html>
