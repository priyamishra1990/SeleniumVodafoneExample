/*
package com.priya;


import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='https://www.google.co.in/intl/en_in/about/?utm_source=google-IN&utm_medium=referral&utm_campaign=hp-footer&fg=1']")
    @CacheLookup
    private WebElement about;

    @FindBy(id = "gb192")
    @CacheLookup
    private WebElement account;

    @FindBy(css = "a.gb_T.gb_Hf")
    @CacheLookup
    private WebElement addAShortcut;

    @FindBy(css = "a.gb_0.gb_Af.gb_le.gb_kb")
    @CacheLookup
    private WebElement addAccount;

    @FindBy(css = "a[href='/advanced_search?hl=en-IN&fg=1']")
    @CacheLookup
    private WebElement advancedSearch;

    @FindBy(css = "a[href='https://www.google.co.in/intl/en_in/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1']")
    @CacheLookup
    private WebElement advertising;

    @FindBy(css = "a.gb_Nb.gb_wa")
    @CacheLookup
    private WebElement allYourBrandAccounts;

    @FindBy(id = "gb30")
    @CacheLookup
    private WebElement blogger;

    @FindBy(id = "gb10")
    @CacheLookup
    private WebElement books;

    @FindBy(css = "a[href='https://www.google.co.in/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpbfooter&fg=1']")
    @CacheLookup
    private WebElement business;

    @FindBy(id = "gb24")
    @CacheLookup
    private WebElement calendar;

    @FindBy(css = "a.gb_2a.gb_Hf")
    @CacheLookup
    private WebElement change;

    @FindBy(id = "gb265")
    @CacheLookup
    private WebElement classroom;

    @FindBy(id = "gb338")
    @CacheLookup
    private WebElement collections;

    @FindBy(id = "gb53")
    @CacheLookup
    private WebElement contacts;

    @FindBy(id = "gb25")
    @CacheLookup
    private WebElement docs;

    @FindBy(id = "gb49")
    @CacheLookup
    private WebElement drive;

    @FindBy(id = "gb429")
    @CacheLookup
    private WebElement earth;

    @FindBy(css = "a.gb_E.gb_zf")
    @CacheLookup
    private WebElement evenMoreFromGoogle;

    @FindBy(css = "#gbw div div.gb_Ja.gb_7f.gb_f.gb_6f.gb_ag.gb_of div:nth-of-type(1) div:nth-of-type(1) a.gb_d")
    @CacheLookup
    private WebElement gmail1;

    @FindBy(id = "gb23")
    @CacheLookup
    private WebElement gmail2;

    @FindBy(name = "q")
    @CacheLookup
    private WebElement gmailimagesaccountsearchmapsyoutubeplaynewsgmailcontactsdrivecalendartranslatephotosshoppingsearchaddAShortcutmoredocsbooksbloggerhangoutskeepjamboardclassroomearthcollectionsevenMoreFromGoogle;

    @FindBy(css = "a.gb_0.gb_Df.gbp1.gb_le.gb_kb")
    @CacheLookup
    private WebElement googleAccount;

    @FindBy(name = "btnK")
    @CacheLookup
    private WebElement googleSearch1;

    @FindBy(name = "btnK")
    @CacheLookup
    private WebElement googleSearch2;

    @FindBy(id = "gb300")
    @CacheLookup
    private WebElement hangouts;

    @FindBy(css = "a[href='//myactivity.google.com/product/search?utm_source=google&hl=en-IN&fg=1']")
    @CacheLookup
    private WebElement history;

    @FindBy(name = "btnI")
    @CacheLookup
    private WebElement imFeelingLucky1;

    @FindBy(name = "btnI")
    @CacheLookup
    private WebElement imFeelingLucky2;

    @FindBy(css = "a[href='https://www.google.co.in/imghp?hl=en&tab=wi']")
    @CacheLookup
    private WebElement images;

    @FindBy(id = "gb357")
    @CacheLookup
    private WebElement jamboard;

    @FindBy(id = "gb136")
    @CacheLookup
    private WebElement keep;

    @FindBy(id = "gb8")
    @CacheLookup
    private WebElement maps;

    @FindBy(css = "a.gb_D.gb_Hf")
    @CacheLookup
    private WebElement more;

    @FindBy(id = "gb5")
    @CacheLookup
    private WebElement news;

    private final String pageLoadedText = "";

    private final String pageUrl = "/";

    @FindBy(id = "gb31")
    @CacheLookup
    private WebElement photos;

    @FindBy(id = "gb78")
    @CacheLookup
    private WebElement play;

    @FindBy(css = "a[href='https://www.google.co.in/intl/en_in/policies/privacy/?fg=1']")
    @CacheLookup
    private WebElement privacy1;

    @FindBy(css = "a[href='https://myaccount.google.com/privacypolicy']")
    @CacheLookup
    private WebElement privacy2;

    @FindBy(css = "a.gb_yb.gb_Fb")
    @CacheLookup
    private WebElement priyaMishraconnectPriyamishragmailComDefault;

    @FindBy(id = "sbfblt")
    @CacheLookup
    private WebElement reportInappropriatePredictions;

    @FindBy(id = "gb1")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "a[href='//support.google.com/websearch/?p=ws_results_help&hl=en-IN&fg=1']")
    @CacheLookup
    private WebElement searchHelp;

    @FindBy(css = "a[href='https://www.google.co.in/preferences?hl=en-IN&fg=1']")
    @CacheLookup
    private WebElement searchSettings;

    @FindBy(id = "dk2qOd")
    @CacheLookup
    private WebElement sendFeedback;

    @FindBy(id = "fsettl")
    @CacheLookup
    private WebElement settings;

    @FindBy(id = "gb6")
    @CacheLookup
    private WebElement shopping;

    @FindBy(id = "gb_71")
    @CacheLookup
    private WebElement signOut;

    @FindBy(css = "a[href='https://www.google.co.in/intl/en_in/policies/terms/?fg=1']")
    @CacheLookup
    private WebElement terms;

    @FindBy(id = "gb51")
    @CacheLookup
    private WebElement translate;

    @FindBy(css = "a[href='//myactivity.google.com/privacyadvisor/search?utm_source=googlemenu&fg=1']")
    @CacheLookup
    private WebElement yourDataInSearch;

    @FindBy(id = "gb36")
    @CacheLookup
    private WebElement youtube;

    public void google() {
    }

    public void google(WebDriver driver) {
        this.driver = driver;
    }

    public google(WebDriver driver, Map<String, String> data) {
        this.data = data;
    }

    public void google(WebDriver driver, Map<String, String> data, int timeout) {
        this.timeout = timeout;
    }

    */
/**
     * Click on About Link.
     *
     * @return the google class instance.
     *//*

    public google clickAboutLink() {
        about.click();
        return this;
    }

    */
/**
     * Click on Account Link.
     *
     * @return the google class instance.
     *//*

    public google clickAccountLink() {
        account.click();
        return this;
    }

    */
/**
     * Click on Add A Shortcut Link.
     *
     * @return the google class instance.
     *//*

    public google clickAddAShortcutLink() {
        addAShortcut.click();
        return this;
    }

    */
/**
     * Click on Add Account Link.
     *
     * @return the google class instance.
     *//*

    public google clickAddAccountLink() {
        addAccount.click();
        return this;
    }

    */
/**
     * Click on Advanced Search Link.
     *
     * @return the google class instance.
     *//*

    public google clickAdvancedSearchLink() {
        advancedSearch.click();
        return this;
    }

    */
/**
     * Click on Advertising Link.
     *
     * @return the google class instance.
     *//*

    public google clickAdvertisingLink() {
        advertising.click();
        return this;
    }

    */
/**
     * Click on All Your Brand Accounts Link.
     *
     * @return the google class instance.
     *//*

    public google clickAllYourBrandAccountsLink() {
        allYourBrandAccounts.click();
        return this;
    }

    */
/**
     * Click on Blogger Link.
     *
     * @return the google class instance.
     *//*

    public google clickBloggerLink() {
        blogger.click();
        return this;
    }

    */
/**
     * Click on Books Link.
     *
     * @return the google class instance.
     *//*

    public google clickBooksLink() {
        books.click();
        return this;
    }

    */
/**
     * Click on Business Link.
     *
     * @return the google class instance.
     *//*

    public google clickBusinessLink() {
        business.click();
        return this;
    }

    */
/**
     * Click on Calendar Link.
     *
     * @return the google class instance.
     *//*

    public google clickCalendarLink() {
        calendar.click();
        return this;
    }

    */
/**
     * Click on Change Link.
     *
     * @return the google class instance.
     *//*

    public google clickChangeLink() {
        change.click();
        return this;
    }

    */
/**
     * Click on Classroom Link.
     *
     * @return the google class instance.
     *//*

    public google clickClassroomLink() {
        classroom.click();
        return this;
    }

    */
/**
     * Click on Collections Link.
     *
     * @return the google class instance.
     *//*

    public google clickCollectionsLink() {
        collections.click();
        return this;
    }

    */
/**
     * Click on Contacts Link.
     *
     * @return the google class instance.
     *//*

    public google clickContactsLink() {
        contacts.click();
        return this;
    }

    */
/**
     * Click on Docs Link.
     *
     * @return the google class instance.
     *//*

    public google clickDocsLink() {
        docs.click();
        return this;
    }

    */
/**
     * Click on Drive Link.
     *
     * @return the google class instance.
     *//*

    public google clickDriveLink() {
        drive.click();
        return this;
    }

    */
/**
     * Click on Earth Link.
     *
     * @return the google class instance.
     *//*

    public google clickEarthLink() {
        earth.click();
        return this;
    }

    */
/**
     * Click on Even More From Google Link.
     *
     * @return the google class instance.
     *//*

    public google clickEvenMoreFromGoogleLink() {
        evenMoreFromGoogle.click();
        return this;
    }

    */
/**
     * Click on Gmail Link.
     *
     * @return the google class instance.
     *//*

    public google clickGmail1Link() {
        gmail1.click();
        return this;
    }

    */
/**
     * Click on Gmail Link.
     *
     * @return the google class instance.
     *//*

    public google clickGmail2Link() {
        gmail2.click();
        return this;
    }

    */
/**
     * Click on Google Account Link.
     *
     * @return the google class instance.
     *//*

    public google clickGoogleAccountLink() {
        googleAccount.click();
        return this;
    }

    */
/**
     * Click on Google Search Button.
     *
     * @return the google class instance.
     *//*

    public google clickGoogleSearch1Button() {
        googleSearch1.click();
        return this;
    }

    */
/**
     * Click on Google Search Button.
     *
     * @return the google class instance.
     *//*

    public google clickGoogleSearch2Button() {
        googleSearch2.click();
        return this;
    }

    */
/**
     * Click on Hangouts Link.
     *
     * @return the google class instance.
     *//*

    public google clickHangoutsLink() {
        hangouts.click();
        return this;
    }

    */
/**
     * Click on History Link.
     *
     * @return the google class instance.
     *//*

    public google clickHistoryLink() {
        history.click();
        return this;
    }

    */
/**
     * Click on Im Feeling Lucky Button.
     *
     * @return the google class instance.
     *//*

    public google clickImFeelingLucky1Button() {
        imFeelingLucky1.click();
        return this;
    }

    */
/**
     * Click on Im Feeling Lucky Button.
     *
     * @return the google class instance.
     *//*

    public google clickImFeelingLucky2Button() {
        imFeelingLucky2.click();
        return this;
    }

    */
/**
     * Click on Images Link.
     *
     * @return the google class instance.
     *//*

    public google clickImagesLink() {
        images.click();
        return this;
    }

    */
/**
     * Click on Jamboard Link.
     *
     * @return the google class instance.
     *//*

    public google clickJamboardLink() {
        jamboard.click();
        return this;
    }

    */
/**
     * Click on Keep Link.
     *
     * @return the google class instance.
     *//*

    public google clickKeepLink() {
        keep.click();
        return this;
    }

    */
/**
     * Click on Maps Link.
     *
     * @return the google class instance.
     *//*

    public google clickMapsLink() {
        maps.click();
        return this;
    }

    */
/**
     * Click on More Link.
     *
     * @return the google class instance.
     *//*

    public google clickMoreLink() {
        more.click();
        return this;
    }

    */
/**
     * Click on News Link.
     *
     * @return the google class instance.
     *//*

    public google clickNewsLink() {
        news.click();
        return this;
    }

    */
/**
     * Click on Photos Link.
     *
     * @return the google class instance.
     *//*

    public google clickPhotosLink() {
        photos.click();
        return this;
    }

    */
/**
     * Click on Play Link.
     *
     * @return the google class instance.
     *//*

    public google clickPlayLink() {
        play.click();
        return this;
    }

    */
/**
     * Click on Privacy Link.
     *
     * @return the google class instance.
     *//*

    public google clickPrivacy1Link() {
        privacy1.click();
        return this;
    }

    */
/**
     * Click on Privacy Link.
     *
     * @return the google class instance.
     *//*

    public google clickPrivacy2Link() {
        privacy2.click();
        return this;
    }

    */
/**
     * Click on Priya Mishraconnect.priyamishragmail.com Default Link.
     *
     * @return the google class instance.
     *//*

    public google clickPriyaMishraconnectPriyamishragmailComDefaultLink() {
        priyaMishraconnectPriyamishragmailComDefault.click();
        return this;
    }

    */
/**
     * Click on Report Inappropriate Predictions Link.
     *
     * @return the google class instance.
     *//*

    public google clickReportInappropriatePredictionsLink() {
        reportInappropriatePredictions.click();
        return this;
    }

    */
/**
     * Click on Search Help Link.
     *
     * @return the google class instance.
     *//*

    public google clickSearchHelpLink() {
        searchHelp.click();
        return this;
    }

    */
/**
     * Click on Search Link.
     *
     * @return the google class instance.
     *//*

    public google clickSearchLink() {
        search.click();
        return this;
    }

    */
/**
     * Click on Search Settings Link.
     *
     * @return the google class instance.
     *//*

    public google clickSearchSettingsLink() {
        searchSettings.click();
        return this;
    }

    */
/**
     * Click on Send Feedback Link.
     *
     * @return the google class instance.
     *//*

    public google clickSendFeedbackLink() {
        sendFeedback.click();
        return this;
    }

    */
/**
     * Click on Settings Link.
     *
     * @return the google class instance.
     *//*

    public google clickSettingsLink() {
        settings.click();
        return this;
    }

    */
/**
     * Click on Shopping Link.
     *
     * @return the google class instance.
     *//*

    public google clickShoppingLink() {
        shopping.click();
        return this;
    }

    */
/**
     * Click on Sign Out Link.
     *
     * @return the google class instance.
     *//*

    public google clickSignOutLink() {
        signOut.click();
        return this;
    }

    */
/**
     * Click on Terms Link.
     *
     * @return the google class instance.
     *//*

    public google clickTermsLink() {
        terms.click();
        return this;
    }

    */
/**
     * Click on Translate Link.
     *
     * @return the google class instance.
     *//*

    public google clickTranslateLink() {
        translate.click();
        return this;
    }

    */
/**
     * Click on Your Data In Search Link.
     *
     * @return the google class instance.
     *//*

    public google clickYourDataInSearchLink() {
        yourDataInSearch.click();
        return this;
    }

    */
/**
     * Click on Youtube Link.
     *
     * @return the google class instance.
     *//*

    public google clickYoutubeLink() {
        youtube.click();
        return this;
    }

    */
/**
     * Fill every fields in the page.
     *
     * @return the google class instance.
     *//*

    public google fill() {
        setGmailimagesaccountsearchmapsyoutubeplaynewsgmailcontactsdrivecalendartranslatephotosshoppingsearchaddAShortcutmoredocsbooksbloggerhangoutskeepjamboardclassroomearthcollectionsevenMoreFromGoogleTextField();
        return this;
    }

    */
/**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the google class instance.
     *//*

    public google fillAndSubmit() {
        fill();
        return submit();
    }

    */
/**
     * Set default value to Gmailimagesaccountsearchmapsyoutubeplaynewsgmailcontactsdrivecalendartranslatephotosshoppingsearchadd A Shortcutmoredocsbooksbloggerhangoutskeepjamboardclassroomearthcollectionseven More From Google Text field.
     *
     * @return the google class instance.
     *//*

    public google setGmailimagesaccountsearchmapsyoutubeplaynewsgmailcontactsdrivecalendartranslatephotosshoppingsearchaddAShortcutmoredocsbooksbloggerhangoutskeepjamboardclassroomearthcollectionsevenMoreFromGoogleTextField() {
        return setGmailimagesaccountsearchmapsyoutubeplaynewsgmailcontactsdrivecalendartranslatephotosshoppingsearchaddAShortcutmoredocsbooksbloggerhangoutskeepjamboardclassroomearthcollectionsevenMoreFromGoogleTextField(data.get("GMAILIMAGESACCOUNTSEARCHMAPSYOUTUBEPLAYNEWSGMAILCONTACTSDRIVECALENDARTRANSLATEPHOTOSSHOPPINGSEARCHADD_A_SHORTCUTMOREDOCSBOOKSBLOGGERHANGOUTSKEEPJAMBOARDCLASSROOMEARTHCOLLECTIONSEVEN_MORE_FROM_GOOGLE"));
    }

    */
/**
     * Set value to Gmailimagesaccountsearchmapsyoutubeplaynewsgmailcontactsdrivecalendartranslatephotosshoppingsearchadd A Shortcutmoredocsbooksbloggerhangoutskeepjamboardclassroomearthcollectionseven More From Google Text field.
     *
     * @return the google class instance.
     *//*

    public google setGmailimagesaccountsearchmapsyoutubeplaynewsgmailcontactsdrivecalendartranslatephotosshoppingsearchaddAShortcutmoredocsbooksbloggerhangoutskeepjamboardclassroomearthcollectionsevenMoreFromGoogleTextField(String gmailimagesaccountsearchmapsyoutubeplaynewsgmailcontactsdrivecalendartranslatephotosshoppingsearchaddAShortcutmoredocsbooksbloggerhangoutskeepjamboardclassroomearthcollectionsevenMoreFromGoogleValue) {
        gmailimagesaccountsearchmapsyoutubeplaynewsgmailcontactsdrivecalendartranslatephotosshoppingsearchaddAShortcutmoredocsbooksbloggerhangoutskeepjamboardclassroomearthcollectionsevenMoreFromGoogle.sendKeys(gmailimagesaccountsearchmapsyoutubeplaynewsgmailcontactsdrivecalendartranslatephotosshoppingsearchaddAShortcutmoredocsbooksbloggerhangoutskeepjamboardclassroomearthcollectionsevenMoreFromGoogleValue);
        return this;
    }

    */
/**
     * Submit the form to target page.
     *
     * @return the google class instance.
     *//*

    public google submit() {
        clickImFeelingLuckyButton();
        return this;
    }

    */
/**
     * Verify that the page loaded completely.
     *
     * @return the google class instance.
     *//*

    public google verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    */
/**
     * Verify that current page URL matches the expected URL.
     *
     * @return the google class instance.
     *//*

    public google verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

*/
