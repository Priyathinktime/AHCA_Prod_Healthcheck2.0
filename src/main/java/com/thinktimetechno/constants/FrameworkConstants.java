/*
 * Copyright (c) 2022 Anh Tester
 * Automation Framework Selenium
 */

package com.thinktimetechno.constants;

import com.thinktimetechno.helpers.Helpers;
import com.thinktimetechno.helpers.PropertiesHelpers;
import com.thinktimetechno.utils.ReportUtils;

import java.io.File;

public final class FrameworkConstants {

    private FrameworkConstants() {
    }

    static {
        PropertiesHelpers.loadAllFiles();
        System.out.println("Data From FrameworkConstants: " + PropertiesHelpers.getProperties());
    }

 // ---------- URLs ----------
    public static final String HOME_URL = PropertiesHelpers.getValue("HOME_URL");

    // ---------- IDs ----------
    public static final String GROUP_LOGIN_ID = PropertiesHelpers.getValue("GROUP_LOGIN_ID");
    public static final String CUSTOMER_LOGIN_ID = PropertiesHelpers.getValue("CUSTOMER_LOGIN_ID");

    // ---------- XPaths ----------
    public static final String MENU_COURSE_INFO_XPATH = PropertiesHelpers.getValue("MENU_COURSE_INFO_XPATH");
    public static final String COURSE_LINK_XPATH = PropertiesHelpers.getValue("COURSE_LINK_XPATH");
    public static final String FOOTER_REJECT_XPATH = PropertiesHelpers.getValue("FOOTER_REJECT_XPATH");
    public static final String FOOTER_LINK_XPATH = PropertiesHelpers.getValue("FOOTER_LINK_XPATH");
    public static final String FOOTER_SECTION_XPATH = "//footer[@class='custom-footer-v2']";
    public static final String POPUP_BOX_ID = "popup-box";

    // ---------- TITLES ----------
    public static final String CUSTOMER_LOGIN_TITLE = PropertiesHelpers.getValue("CUSTOMER_LOGIN_TITLE");
    public static final String GROUP_LOGIN_TITLE = PropertiesHelpers.getValue("GROUP_LOGIN_TITLE");
    public static final String FIRST_AID_TITLE = PropertiesHelpers.getValue("FIRST_AID_TITLE");
    public static final String BLOODBORNE_TITLE = PropertiesHelpers.getValue("BLOODBORNE_TITLE");
    public static final String CPR_AED_COMBO_TITLE = PropertiesHelpers.getValue("CPR_AED_COMBO_TITLE");
    public static final String HEALTHCARE_COMBO_TITLE = PropertiesHelpers.getValue("HEALTHCARE_COMBO_TITLE");
    public static final String CPR_AED_TITLE = PropertiesHelpers.getValue("CPR_AED_TITLE");
    public static final String ACLS_PALS_TITLE = PropertiesHelpers.getValue("ACLS_PALS_TITLE");
    public static final String ABOUT_US_TITLE = PropertiesHelpers.getValue("ABOUT_US_TITLE");
    public static final String CONTACT_US_TITLE = PropertiesHelpers.getValue("CONTACT_US_TITLE");
    public static final String CAREERS_TITLE = PropertiesHelpers.getValue("CAREERS_TITLE");
    public static final String TESTIMONIALS_TITLE = PropertiesHelpers.getValue("TESTIMONIALS_TITLE");
    public static final String PRIVACY_POLICY_TITLE = PropertiesHelpers.getValue("PRIVACY_POLICY_TITLE");
    public static final String MONEY_BACK_TITLE = PropertiesHelpers.getValue("MONEY_BACK_TITLE");
    public static final String TERMS_OF_SERVICE_TITLE = PropertiesHelpers.getValue("TERMS_OF_SERVICE_TITLE");
    public static final String FAQ_TITLE = PropertiesHelpers.getValue("FAQ_TITLE");
    public static final String BLOG_TITLE = PropertiesHelpers.getValue("BLOG_TITLE");
    public static final String COMMUNITY_TITLE = PropertiesHelpers.getValue("COMMUNITY_TITLE");
    public static final String CERTIFICATION_DETAILS_TITLE = PropertiesHelpers.getValue("CERTIFICATION_DETAILS_TITLE");
    public static final String REPLACEMENT_CARDS_TITLE = PropertiesHelpers.getValue("REPLACEMENT_CARDS_TITLE");
    public static final String GROUP_PROGRAM_TITLE = PropertiesHelpers.getValue("GROUP_PROGRAM_TITLE");
    public static final String INDUSTRY_TITLE = PropertiesHelpers.getValue("INDUSTRY_TITLE");
    public static final String ACCREDITATION_TITLE = PropertiesHelpers.getValue("ACCREDITATION_TITLE");
    public static final String CPR_RATIO_TITLE = PropertiesHelpers.getValue("CPR_RATIO_TITLE");
    public static final String FREE_CPR_TITLE = PropertiesHelpers.getValue("FREE_CPR_TITLE");
    public static final String BLENDED_TITLE = PropertiesHelpers.getValue("BLENDED_TITLE");
    public static final String VERIFY_CERTIFICATE_TITLE = PropertiesHelpers.getValue("VERIFY_CERTIFICATE_TITLE");
    public static final String RENEWALS_TITLE = PropertiesHelpers.getValue("RENEWALS_TITLE");
    public static final String CPR_OVERVIEW_TITLE = PropertiesHelpers.getValue("CPR_OVERVIEW_TITLE");
    public static final String BLS_OVERVIEW_TITLE = PropertiesHelpers.getValue("BLS_OVERVIEW_TITLE");
    public static final String FIRST_AID_OVERVIEW_TITLE = PropertiesHelpers.getValue("FIRST_AID_OVERVIEW_TITLE");
    public static final String HEALTHCARE_PROVIDER_OVERVIEW_TITLE = PropertiesHelpers.getValue("HEALTHCARE_PROVIDER_OVERVIEW_TITLE");
    public static final String BLOODBORNE_OVERVIEW_TITLE = PropertiesHelpers.getValue("BLOODBORNE_OVERVIEW_TITLE");
    public static final String ACLS_TITLE = PropertiesHelpers.getValue("ACLS_TITLE");
    public static final String PALS_TITLE = PropertiesHelpers.getValue("PALS_TITLE");
    public static final String HIPAA_TITLE = PropertiesHelpers.getValue("HIPAA_TITLE");
    public static final String CPR_RECERTIFICATION_TITLE = PropertiesHelpers.getValue("CPR_RECERTIFICATION_TITLE");
    public static final String BLS_RECERTIFICATION_TITLE = PropertiesHelpers.getValue("BLS_RECERTIFICATION_TITLE");

    // ---------- Special ----------
    public static final String VERIFY_CERTIFICATE_URL = "https://app.cpraedcourse.com/verifycertificate?_gl=1*j1okr5*_gcl_au*MTUzODY3NTE4NC4xNzQ1MzAyNTY2*_ga*MjA5NDgyMzczMy4xNzQ1MzAyNTY2*_ga_BQXRHZVPD0*MTc0NTMwMjU2Ni4xLjAuMTc0NTMwMjU3MC41Ni4wLjA.";
    
    
    
    
    public static final String PROJECT_PATH = Helpers.getCurrentDir();
    public static final String EXCEL_DATA_FILE_PATH = PropertiesHelpers.getValue("EXCEL_DATA_FILE_PATH");
    public static final String JSON_DATA_FILE_PATH = PropertiesHelpers.getValue("JSON_DATA_FILE_PATH");

    public static final String BROWSER = PropertiesHelpers.getValue("BROWSER");
    public static final String URL_CRM = PropertiesHelpers.getValue("URL_CRM");
    public static final String REMOTE_URL = PropertiesHelpers.getValue("REMOTE_URL");
    public static final String REMOTE_PORT = PropertiesHelpers.getValue("REMOTE_PORT");
    public static final String PROJECT_NAME = PropertiesHelpers.getValue("PROJECT_NAME");
    public static final String REPORT_TITLE = PropertiesHelpers.getValue("REPORT_TITLE");
    public static final String EXTENT_REPORT_NAME = PropertiesHelpers.getValue("EXTENT_REPORT_NAME");
    public static final String EXTENT_REPORT_FOLDER = PropertiesHelpers.getValue("EXTENT_REPORT_FOLDER");
    public static final String EXPORT_VIDEO_PATH = PropertiesHelpers.getValue("EXPORT_VIDEO_PATH");
    public static final String EXPORT_CAPTURE_PATH = PropertiesHelpers.getValue("EXPORT_CAPTURE_PATH");
    public static final String SEND_REPORT_TO_TELEGRAM = PropertiesHelpers.getValue("SEND_REPORT_TO_TELEGRAM");
    public static final String TELEGRAM_TOKEN = PropertiesHelpers.getValue("TELEGRAM_TOKEN");
    public static final String TELEGRAM_CHATID = PropertiesHelpers.getValue("TELEGRAM_CHATID");
    public static final String AUTHOR = PropertiesHelpers.getValue("AUTHOR");
    public static final String TARGET = PropertiesHelpers.getValue("TARGET");
    public static final String HEADLESS = PropertiesHelpers.getValue("HEADLESS");
    public static final String OVERRIDE_REPORTS = PropertiesHelpers.getValue("OVERRIDE_REPORTS");
    public static final String OPEN_REPORTS_AFTER_EXECUTION = PropertiesHelpers.getValue("OPEN_REPORTS_AFTER_EXECUTION");
    public static final String SEND_EMAIL_TO_USERS = PropertiesHelpers.getValue("SEND_EMAIL_TO_USERS");
    public static final String SCREENSHOT_PASSED_STEPS = PropertiesHelpers.getValue("SCREENSHOT_PASSED_STEPS");
    public static final String SCREENSHOT_FAILED_STEPS = PropertiesHelpers.getValue("SCREENSHOT_FAILED_STEPS");
    public static final String SCREENSHOT_SKIPPED_STEPS = PropertiesHelpers.getValue("SCREENSHOT_SKIPPED_STEPS");
    public static final String SCREENSHOT_ALL_STEPS = PropertiesHelpers.getValue("SCREENSHOT_ALL_STEPS");
    public static final String ZIP_FOLDER = PropertiesHelpers.getValue("ZIP_FOLDER");
    public static final String ZIP_FOLDER_PATH = PropertiesHelpers.getValue("ZIP_FOLDER_PATH");
    public static final String ZIP_FOLDER_NAME = PropertiesHelpers.getValue("ZIP_FOLDER_NAME");
    public static final String VIDEO_RECORD = PropertiesHelpers.getValue("VIDEO_RECORD");

    public static final String LOCATE = PropertiesHelpers.getValue("LOCATE");

    public static final int WAIT_DEFAULT = Integer.parseInt(PropertiesHelpers.getValue("WAIT_DEFAULT"));
    public static final int WAIT_IMPLICIT = Integer.parseInt(PropertiesHelpers.getValue("WAIT_IMPLICIT"));
    public static final int WAIT_EXPLICIT = Integer.parseInt(PropertiesHelpers.getValue("WAIT_EXPLICIT"));
    public static final int WAIT_PAGE_LOADED = Integer.parseInt(PropertiesHelpers.getValue("WAIT_PAGE_LOADED"));
    public static final int WAIT_SLEEP_STEP = Integer.parseInt(PropertiesHelpers.getValue("WAIT_SLEEP_STEP"));
    public static final String ACTIVE_PAGE_LOADED = PropertiesHelpers.getValue("ACTIVE_PAGE_LOADED");

    public static final String EXTENT_REPORT_FOLDER_PATH = PROJECT_PATH + EXTENT_REPORT_FOLDER;
    public static final String EXTENT_REPORT_FILE_NAME = EXTENT_REPORT_NAME + ".html";
    public static String EXTENT_REPORT_FILE_PATH = EXTENT_REPORT_FOLDER_PATH + File.separator + EXTENT_REPORT_FILE_NAME;

    //Zip file for Report folder
    public static final String ZIPPED_EXTENT_REPORTS_FOLDER = EXTENT_REPORT_FOLDER + ".zip";

    public static final String YES = "yes";
    public static final String NO = "no";

    public static final String BOLD_START = "<b>";
    public static final String BOLD_END = "</b>";

    /* ICONS - START */

    public static final String ICON_SMILEY_PASS = "<i class='fa fa-smile-o' style='font-size:24px'></i>";
    public static final String ICON_SMILEY_SKIP = "<i class=\"fas fa-frown-open\"></i>";
    public static final String ICON_SMILEY_FAIL = "<i class='fa fa-frown-o' style='font-size:24px'></i>";

    public static final String ICON_OS_WINDOWS = "<i class='fa fa-windows' ></i>";
    public static final String ICON_OS_MAC = "<i class='fa fa-apple' ></i>";
    public static final String ICON_OS_LINUX = "<i class='fa fa-linux' ></i>";

    public static final String ICON_BROWSER_OPERA = "<i class=\"fa fa-opera\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_EDGE = "<i class=\"fa fa-edge\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_CHROME = "<i class=\"fa fa-chrome\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_FIREFOX = "<i class=\"fa fa-firefox\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_SAFARI = "<i class=\"fa fa-safari\" aria-hidden=\"true\"></i>";

    public static final String ICON_Navigate_Right = "<i class='fa fa-arrow-circle-right' ></i>";
    public static final String ICON_LAPTOP = "<i class='fa fa-laptop' style='font-size:18px'></i>";
    public static final String ICON_BUG = "<i class='fa fa-bug' ></i>";
    /* style="text-align:center;" */

    public static final String ICON_SOCIAL_GITHUB_PAGE_URL = "https://anhtester.com/";
    public static final String ICON_SOCIAL_LINKEDIN_URL = "https://www.linkedin.com/in/anhtester/";
    public static final String ICON_SOCIAL_GITHUB_URL = "https://github.com/anhtester";
    public static final String ICON_SOCIAL_LINKEDIN = "<a href='" + ICON_SOCIAL_LINKEDIN_URL
            + "'><i class='fa fa-linkedin-square' style='font-size:24px'></i></a>";
    public static final String ICON_SOCIAL_GITHUB = "<a href='" + ICON_SOCIAL_GITHUB_URL
            + "'><i class='fa fa-github-square' style='font-size:24px'></i></a>";

    public static final String ICON_CAMERA = "<i class=\"fa fa-camera\" aria-hidden=\"true\"></i>";

    public static final String ICON_BROWSER_PREFIX = "<i class=\"fa fa-";
    public static final String ICON_BROWSER_SUFFIX = "\" aria-hidden=\"true\"></i>";
    /* ICONS - END */

    public static String getExtentReportFilePath() {
//        if (EXTENT_REPORT_FILE_PATH.isEmpty()) {
            EXTENT_REPORT_FILE_PATH = ReportUtils.createExtentReportPath();
//        }
        return EXTENT_REPORT_FILE_PATH;
    }

}
