package withpo.pageobjects;

import com.codeborne.selenide.SelenideElement;
import withpo.components.CalendarComponent;
import withpo.components.ModalComponent;
import withpo.components.UploadFileComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormPracticePO {
    CalendarComponent calendarComponent = new CalendarComponent();
    UploadFileComponent uploadFileComponent = new UploadFileComponent();
    ModalComponent modalComponent = new ModalComponent();
    // VARS START
    private static final SelenideElement
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumber = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            currentAddress = $("#currentAddress"),
            state = $("#state"),
            stateCity_wrapper = $("#stateCity-wrapper"),
            city = $("#city"),
            submit = $("#submit"),
            dateOfBirthInput = $("#dateOfBirthInput");
    // VARS END

    public FormPracticePO openRegistrationForm(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        return this;
    }

    public FormPracticePO setFirstName(String value){
        firstName.setValue(value);

        return this;
    }

    public FormPracticePO setLastName(String value){
        lastName.setValue(value);

        return this;
    }

    public FormPracticePO setUserEmail(String value){
        userEmail.setValue(value);

        return this;
    }

    public FormPracticePO setGender(String value){
        genderWrapper.$(byText(value)).click();

        return this;
    }

    public FormPracticePO setUserNumber(String value){
        userNumber.setValue(value);

        return this;
    }

    public FormPracticePO setSubject(String value){
        subjectsInput.setValue(value).pressEnter();

        return this;
    }

    public FormPracticePO setHobie(String value){
        hobbiesWrapper.$(byText(value)).click();

        return this;
    }
    public FormPracticePO setCurrentAddress(String value){
        currentAddress.setValue(value);

        return this;
    }
    public FormPracticePO setState(String value){
        state.click();
        stateCity_wrapper.$(byText(value)).click();

        return this;
    }
    public FormPracticePO setCity(String value){
        city.click();
        stateCity_wrapper.$(byText(value)).click();

        return this;
    }
    public FormPracticePO clickOnSubmitBtn(){
        submit.click();

        return this;
    }

    public FormPracticePO setRegistrationDate(String day, String month, String year){
        dateOfBirthInput.click();
        calendarComponent.calendar(day, month, year);

        return this;
    }

    public FormPracticePO uploadFile(String src){
        uploadFileComponent.uploadFile(src);

        return this;
    }

    public FormPracticePO modalWindowCheck(String title){
        modalComponent.modalWindowAppears(title);

        return this;
    }

    public FormPracticePO verifyResult(String key, String value){
        modalComponent.checkModalKeyValue(key, value);

        return this;
    }
}
