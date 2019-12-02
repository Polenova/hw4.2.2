package ru.android.polenova;

import android.graphics.drawable.Drawable;
import android.widget.Button;

public class ContactItem {

    private Drawable imageIcon;
    private String contactInfo;
    private String callContact;
    private Button buttonRemove;

    public ContactItem(Drawable imageIcon, String callContact, String contactInfo, Button buttonRemove) {
        this.imageIcon = imageIcon;
        this.callContact = callContact;
        this.contactInfo = contactInfo;
        this.buttonRemove = buttonRemove;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Drawable getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(Drawable imageIcon) {
        this.imageIcon = imageIcon;
    }

    public String getCallContact() {
        return callContact;
    }

    public void setCallContact(String callContact) {
        this.callContact = callContact;
    }

    public Button getButtonRemove() {
        return buttonRemove;
    }

    public void setChecked(Button checkBoxSelect) {
        buttonRemove = buttonRemove;
    }
}
