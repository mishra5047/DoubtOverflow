package com.abhishek.doubtoverflow.Util;

public class ItemUser {

    String userName, batchOf, emailId, contactNumber, imageAvatar;
    boolean isEmailVerified, isContactNumber;

    public ItemUser(String userName, String batchOf, String emailId, String contactNumber) {
        this.userName = userName;
        this.batchOf = batchOf;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
    }

    public ItemUser(String userName, String batchOf, String emailId, String contactNumber, boolean isEmailVerified, boolean isContactNumber, String imageAvatar) {
        this.userName = userName;
        this.batchOf = batchOf;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.isEmailVerified = isEmailVerified;
        this.isContactNumber = isContactNumber;
        this.imageAvatar = imageAvatar;
    }
}
