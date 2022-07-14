package pages;


import org.springframework.stereotype.Component;

@Component
public class CreateLeadPage extends AutoWiredPages {
	
	public CreateLeadPage enterCompanyName(String comnyName){
		clearAndType(locateElement("id", "createLeadForm_companyName"), comnyName);
		return this;
	}

	public CreateLeadPage enterFirstName(String firstName){
		clearAndType(locateElement("id", "createLeadForm_firstName"), firstName);
		return this;
	}

	public CreateLeadPage enterLastName(String lastName){
		clearAndType(locateElement("id", "createLeadForm_lastName"), lastName);
		return this;
	}

	public ViewLeadPage clickCreateLeadSubmit(){
		click(locateElement("class", "smallSubmit"));
		return viewLeadPage;
	}
	
	public CreateLeadPage enterEmail(String eMail){
		clearAndType(locateElement("id", "createLeadForm_primaryEmail"), eMail);
		return this;
	}
}
