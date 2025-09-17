package com.thinktimetechno.projects.website.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.thinktimetechno.constants.FrameworkConstants;
import com.thinktimetechno.driver.DriverManager;
import com.thinktimetechno.hooks.TestContext;
import com.thinktimetechno.keywords.WebUI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AHCA_StepDefinition {

    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));

    public AHCA_StepDefinition(TestContext testContext) {}

    // ---------- Home ----------
    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        WebUI.getURL(FrameworkConstants.HOME_URL);
    }

    // ---------- Login ----------
    @When("the user clicks on {string}")
    public void the_user_clicks_on(String linkName) {
        String id = null;
        if (linkName.equals("Group Login")) {
            id = FrameworkConstants.GROUP_LOGIN_ID;
        } else if (linkName.equals("Customer Login")) {
            id = FrameworkConstants.CUSTOMER_LOGIN_ID;
        }
        WebUI.clickElement(By.id(id));
    }

    @Then("the user should be navigated to the Customer Login page")
    public void the_user_should_be_navigated_to_the_customer_login_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.CUSTOMER_LOGIN_TITLE));
    }

    @Then("the user should be navigated to the Group Login page")
    public void the_user_should_be_navigated_to_the_group_login_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.GROUP_LOGIN_TITLE));
    }

    // ---------- Menu & Courses ----------
    @When("the user hovers over Course Information")
    public void the_user_hovers_over_Course_Information() {
        WebUI.mouseHover(By.xpath(FrameworkConstants.MENU_COURSE_INFO_XPATH));
    }

    @When("clicks on {string}")
    public void clicks_on(String courseName) {
        String courseXpath = String.format(FrameworkConstants.COURSE_LINK_XPATH, courseName);
        WebUI.clickElementWithJs(By.xpath(courseXpath));
    }

    @Then("the user should be navigated to the Standard First Aid Course page")
    public void the_user_should_be_navigated_to_the_standard_first_aid_course_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.FIRST_AID_TITLE));
    }

    @Then("the user should be navigated to the Bloodborne Pathogens Course page")
    public void the_user_should_be_navigated_to_the_bloodborne_pathogens_course_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.BLOODBORNE_TITLE));
    }

    @Then("the user should be navigated to the CPR AED + First Aid Combo Course page")
    public void the_user_should_be_navigated_to_the_cpr_aed_first_aid_combo_course_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.CPR_AED_COMBO_TITLE));
    }

    @Then("the user should be navigated to the Healthcare Provider CPR AED + First Aid Combo - BLS Course page")
    public void the_user_should_be_navigated_to_the_healthcare_provider_cpr_aed_first_aid_combo_bls_course_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.HEALTHCARE_COMBO_TITLE));
    }

    @Then("the user should be navigated to the CPR AED Course page")
    public void the_user_should_be_navigated_to_the_cpr_aed_course_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.CPR_AED_TITLE));
    }

    @Then("the user should be navigated to the ACLS PALS Course page")
    public void the_user_should_be_navigated_to_the_acls_pals_course_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.ACLS_PALS_TITLE));
    }

 // ---------- Footer ----------
    @When("the user clicks on {string} in the footer")
    public void the_user_clicks_on_in_the_footer(String linkText) {
        WebUI.waitForElementVisible(By.id(FrameworkConstants.POPUP_BOX_ID));
        WebUI.clickElementWithJs(By.xpath(FrameworkConstants.FOOTER_REJECT_XPATH));
        WebUI.moveToElement(By.xpath(FrameworkConstants.FOOTER_SECTION_XPATH));
        String footerXpath = String.format(FrameworkConstants.FOOTER_LINK_XPATH, linkText);
        WebUI.clickElementWithJs(By.xpath(footerXpath));
        WebUI.waitForPageLoaded();
        if(linkText.equals("Verify Certificate")) {
			WebUI.switchToWindowOrTabByTitle("Verifycertificate - American Health Care Academy");
		}
    }

    @Then("the user should be navigated to the About Us page")
    public void the_user_should_be_navigated_to_the_about_us_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.ABOUT_US_TITLE));
    }

    @Then("the user should be navigated to the Contact Us page")
    public void the_user_should_be_navigated_to_the_contact_us_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.CONTACT_US_TITLE));
    }

    @Then("the user should be navigated to the Careers page")
    public void the_user_should_be_navigated_to_the_careers_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.CAREERS_TITLE));
    }

    @Then("the user should be navigated to the Testimonials page")
    public void the_user_should_be_navigated_to_the_testimonials_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.TESTIMONIALS_TITLE));
    }

    @Then("the user should be navigated to the Privacy Policy page")
    public void the_user_should_be_navigated_to_the_privacy_policy_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.PRIVACY_POLICY_TITLE));
    }

    @Then("the user should be navigated to the Money Back Guarantee page")
    public void the_user_should_be_navigated_to_the_money_back_guarantee_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.MONEY_BACK_TITLE));
    }

    @Then("the user should be navigated to the Terms of Service page")
    public void the_user_should_be_navigated_to_the_terms_of_service_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.TERMS_OF_SERVICE_TITLE));
    }

    @Then("the user should be navigated to the FAQ page")
    public void the_user_should_be_navigated_to_the_faq_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.FAQ_TITLE));
    }

    @Then("the user should be navigated to the Blog page")
    public void the_user_should_be_navigated_to_the_blog_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.BLOG_TITLE));
    }

    @Then("the user should be navigated to the Join Our Community page")
    public void the_user_should_be_navigated_to_the_join_our_community_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.COMMUNITY_TITLE));
    }

    @Then("the user should be navigated to the Certification Details page successfully")
    public void the_user_should_be_navigated_to_the_certification_details_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.CERTIFICATION_DETAILS_TITLE));
    }

    @Then("the user should be navigated to the Replacement Cards page successfully")
    public void the_user_should_be_navigated_to_the_replacement_cards_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.REPLACEMENT_CARDS_TITLE));
    }

    @Then("the user should be navigated to the Group Program page successfully")
    public void the_user_should_be_navigated_to_the_group_program_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.GROUP_PROGRAM_TITLE));
    }

    @Then("the user should be navigated to the Industry CPR Training page successfully")
    public void the_user_should_be_navigated_to_the_industry_cpr_training_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.INDUSTRY_TITLE));
    }

    @Then("the user should be navigated to the Accreditation page successfully")
    public void the_user_should_be_navigated_to_the_accreditation_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.ACCREDITATION_TITLE));
    }

    @Then("the user should be navigated to the CPR Ratio page successfully")
    public void the_user_should_be_navigated_to_the_cpr_ratio_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.CPR_RATIO_TITLE));
    }

    @Then("the user should be navigated to the Free CPR Class page successfully")
    public void the_user_should_be_navigated_to_the_free_cpr_class_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.FREE_CPR_TITLE));
    }

    @Then("the user should be navigated to the Blended Learning page successfully")
    public void the_user_should_be_navigated_to_the_blended_learning_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.BLENDED_TITLE));
    }

    @Then("the user should be navigated to the Verify Certificate page successfully")
    public void the_user_should_be_navigated_to_the_verify_certificate_page() {
        // switched to a new tab/window
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.VERIFY_CERTIFICATE_TITLE));
    }

    @Then("the user should be navigated to the Renewals page successfully")
    public void the_user_should_be_navigated_to_the_renewals_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.RENEWALS_TITLE));
    }

    @Then("the user should be navigated to the CPRAED Course Overview page successfully")
    public void the_user_should_be_navigated_to_the_cpr_aed_course_overview_page_successfully() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.CPR_OVERVIEW_TITLE));
    }

    @Then("the user should be navigated to the BLS Course Overview page successfully")
    public void the_user_should_be_navigated_to_the_bls_course_overview_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.BLS_OVERVIEW_TITLE));
    }

    @Then("the user should be navigated to the First Aid Course Overview page successfully")
    public void the_user_should_be_navigated_to_the_first_aid_course_overview_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.FIRST_AID_OVERVIEW_TITLE));
    }

    @Then("the user should be navigated to the Healthcare Provider Course Overview page successfully")
    public void the_user_should_be_navigated_to_the_healthcare_provider_course_overview_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.HEALTHCARE_PROVIDER_OVERVIEW_TITLE));
    }

    @Then("the user should be navigated to the Bloodborne Pathogens Course Overview page successfully")
    public void the_user_should_be_navigated_to_the_bloodborne_pathogens_course_overview_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.BLOODBORNE_OVERVIEW_TITLE));
    }

    @Then("the user should be navigated to the ACLS Course page successfully")
    public void the_user_should_be_navigated_to_the_acls_course_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.ACLS_TITLE));
    }

    @Then("the user should be navigated to the PALS Course page successfully")
    public void the_user_should_be_navigated_to_the_pals_course_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.PALS_TITLE));
    }

    @Then("the user should be navigated to the HIPAA Course page successfully")
    public void the_user_should_be_navigated_to_the_hipaa_course_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.HIPAA_TITLE));
    }

    @Then("the user should be navigated to the CPRAED Recertification page successfully")
    public void the_user_should_be_navigated_to_the_cpr_aed_recertification_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.CPR_RECERTIFICATION_TITLE));
    }

    @Then("the user should be navigated to the BLS Recertification page successfully")
    public void the_user_should_be_navigated_to_the_bls_recertification_page() {
        Assert.assertTrue(WebUI.verifyPageTitleContains(FrameworkConstants.BLS_RECERTIFICATION_TITLE));
    }
}
