package ee.viimsifotostuudio.apic;

import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;

public class Variables extends Application {

    //original uri
    private Uri originalImageUri;
    public void setOriginalImageUri(Uri variable) {
        this.croppedImageUri = variable;
    }
    public Uri getOriginalImageUri() {
        return croppedImageUri;
    }

    //cropped uri
    private Uri croppedImageUri;
    public void setCroppedImageUri(Uri variable) {
        this.croppedImageUri = variable;
    }
    public Uri getCroppedImageUri() {
        return croppedImageUri;
    }

    //filter bitmap
    private Bitmap filterImage;
    public void setFilterImage(Bitmap variable) {
        this.filterImage = variable;
    }
    public Bitmap getFilterImage() {
        return filterImage;
    }

    //copy number
    private int numberOfCopies;
    public void setNumberOfCopies(int variable) {
        this.numberOfCopies = variable;
    }
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    //first name
    private String firstName;
    public void setFirstName(String variable) {
        this.firstName = variable;
    }
    public String getFirstName() {
        return firstName;
    }

    //last name
    private String lastName;
    public void setLastName(String variable) {
        this.lastName = variable;
    }
    public String getLastName() {
        return lastName;
    }

    //phone number
    private String phone;
    public void setPhone(String variable) {
        this.phone = variable;
    }
    public String getPhone() {
        return phone;
    }

    //email address
    private String eMail;
    public void setEMail(String variable) {
        this.eMail = variable;
    }
    public String getEMail() {
        return eMail;
    }

    //physical address
    private String address;
    public void setAddress(String variable) {
        this.address = variable;
    }
    public String getAddress() {
        return address;
    }
}