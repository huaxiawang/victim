<%@ page import="com.victim.person.Employee" %>



<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'firstName', 'error')} ">
	<label for="firstName">
		<g:message code="employee.firstName.label" default="First Name" />
		
	</label>
	<g:textField name="firstName" value="${employeeInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'lastName', 'error')} ">
	<label for="lastName">
		<g:message code="employee.lastName.label" default="Last Name" />
		
	</label>
	<g:textField name="lastName" value="${employeeInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'profile', 'error')} ">
	<label for="profile">
		<g:message code="employee.profile.label" default="Profile" />
		
	</label>
	<g:select id="profile" name="profile.id" from="${com.victim.person.Profile.list()}" optionKey="id" value="${employeeInstance?.profile?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

