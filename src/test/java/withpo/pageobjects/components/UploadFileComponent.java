package withpo.pageobjects.components;

import static com.codeborne.selenide.Selenide.$;

public class UploadFileComponent {
    public void uploadFile(String src){
        $("#uploadPicture").uploadFromClasspath(src);
    }
}
