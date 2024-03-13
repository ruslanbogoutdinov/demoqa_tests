package withpo;

import org.junit.jupiter.api.Test;

import static utils.RandomUtils.getRandomEmail;
import static utils.RandomUtils.getRandomString;

public class FormPracticeTestsWithRandomUtils extends TestBase {
    String firstName = getRandomString(5),
        lastName = getRandomString(10),
        userEmail = getRandomEmail(10),
        userGender = "Male",
        userNumber = "1234567890",
        subject = "Math",
        hobie = "Sports",
        currentAddress = "Some address",
        state = "NCR",
        city = "Delhi",
        day = "30",
        month = "July",
        year = "1997",
        file = "img/1.png",
        modalWindowTitle = "Thanks for submitting the form",
        student_name = "Student Name",
        student_email = "Student Email",
        mobile = "Mobile",
        dateOfBirth = "Date of Birth";
    @Test
    void practiceFormTest(){
        formPracticePO.openRegistrationForm()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGender(userGender)
                .setUserNumber(userNumber)
                .setRegistrationDate(day, month, year)
                .setSubject(subject)
                .setHobie(hobie)
                .uploadFile(file)
                .setCurrentAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .clickOnSubmitBtn()
                .modalWindowCheck(modalWindowTitle)
                .verifyResult(student_name, firstName+" "+lastName)
                .verifyResult(student_email, userEmail)
                .verifyResult(userGender, userGender)
                .verifyResult(mobile, userNumber)
                .verifyResult(dateOfBirth, day+" "+month+","+year);
    }
}
